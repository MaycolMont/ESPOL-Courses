package Opciones;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public ReadFile() {
        String filePathString = "student.txt";
        Path filePath = Paths.get(filePathString);

        if (!Files.exists(filePath)) {
            System.err.println("File not found: " + filePath);
            return;
        } else {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePathString))) {
                String line;
                while ((line = reader.readLine())!= null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading from file: " + e.getMessage());
            }
        }

    }
}
