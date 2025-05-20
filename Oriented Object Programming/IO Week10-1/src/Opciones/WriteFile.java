package Opciones;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public WriteFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa su nombre: ");
        String name = scanner.nextLine();
        System.out.println("Ingresa su id: ");
        String id = scanner.nextLine();
        System.out.println("Ingrese su curso");
        String course = scanner.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt"))) {
            writer.write("Nombre: " + name + "\n");
            writer.write("Identificación: " + id + "\n");
            writer.write("Curso: " + course + "\n");
        } catch (IOException e) { 
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
