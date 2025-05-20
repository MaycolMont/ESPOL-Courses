package Opciones;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProcesarDatos {
    public ProcesarDatos() {
        String calFileString = "calificaciones.txt";
        Double promedio = 0.0;
        Double notaAlta = 0.0;
        String nombreAlta = "";
        Double notaBaja = 0.0;
        String nombreBaja = "";


        try (BufferedReader reader = new BufferedReader(new FileReader(calFileString))) {
            String line;
            int nNotas = 0;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Double nota = Double.parseDouble(data[1]);
                String nombre = data[0];
                if (nota > notaAlta) {
                    notaAlta = nota;
                    nombreAlta = nombre;
                }
                if (notaBaja == 0) {
                    notaBaja = nota;
                }
                if (nota < notaBaja) {
                    notaBaja = nota;
                    nombreBaja = nombre;
                }
                promedio += nota;
                nNotas += 1;
            }
            promedio /= nNotas;
            
        } catch (IOException e) {
            System.err.println("No se pudo encontrar el archivo");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("resultados.txt"))) {
            writer.write("Resultados del análisis de calificaciones\n");
            writer.newLine();
            writer.write("Promedio de calificaciones: " + promedio + "\n");
            writer.newLine();
            writer.write("Estudiante con la calificación más alta:\n");
            writer.write("Nombre: " + nombreAlta + "\n");
            writer.write("Calificación: " + notaAlta + "\n");
            writer.newLine();
            writer.write("Estudiante con la calificación más alta:\n");
            writer.write("Nombre: " + nombreBaja + "\n");
            writer.write("Calificación: " + notaBaja + "\n");
            System.out.println("Notas analizadas con exito");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
