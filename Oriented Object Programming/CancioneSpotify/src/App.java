import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class App {
    static String fileName = "src/data/featuresdf.csv";
    static String csvFileName = "src/data/mezcla.csv";

    public static void main(String[] args) throws Exception {
        ArrayList<String[]> songs = getAttributes(fileName);
        createMezclaCsv(songs, 1800000);
    }

    public static ArrayList<String[]> getAttributes(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            ArrayList<String[]> songs = new ArrayList<>();
            String line = br.readLine();
            // Ignorar la primera línea (encabezados)

            while ((line = br.readLine()) != null) {
                songs.add(line.split(","));
            }
            return songs;

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return new ArrayList<String[]>();
        }
    }

    public static void createMezclaCsv(ArrayList<String[]> songs, int maxDuration) {
        double currentDuration = 0.0;
        String[] headers = getHeaders(fileName);

        int durationIndex = getIndex(headers, "duration_ms");
        int nameIndex = getIndex(headers, "name");
        int artistIndex = getIndex(headers, "artists");
        int danceabilityIndex = getIndex(headers, "danceability");

        songs.sort((b, a) -> Double.compare(Double.parseDouble(a[danceabilityIndex]), Double.parseDouble(b[danceabilityIndex])));
        
        try (FileWriter writer = new FileWriter(csvFileName)) {
            writer.write("name,artists\n");

            for (String[] attributes : songs) {
                Double songDuration = Double.parseDouble(attributes[durationIndex]);
                System.out.println(attributes[danceabilityIndex]);
                if ((songDuration + currentDuration) < maxDuration) {
                    writer.write(attributes[nameIndex]+ "," + attributes[artistIndex] + "\n");
                    currentDuration += songDuration;
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }

    public static String[] getHeaders(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            return line.split(",");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return new String[]{};
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int getIndex(String[] array, String header) {
        int i = 0;
        for (String element : array) {
            if (element.equals(header)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
