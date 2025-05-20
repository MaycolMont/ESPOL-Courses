package Opciones;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBinaryFile {
    public CopyBinaryFile() {
        // Ruta del archivo de origen
        String archivoOrigen = "the office.jpg";
        // Ruta del archivo de destino
        String archivoDestino = "the office_copia.jpg";

        // Validar si el archivo de origen existe
        File archivo = new File(archivoOrigen);
        if (!archivo.exists()) {
            System.err.println("El archivo de origen no existe: " + archivoOrigen);
            return;
        }

        // Copiar el archivo binario
        try (
            FileInputStream entrada = new FileInputStream(archivoOrigen);
            FileOutputStream salida = new FileOutputStream(archivoDestino)
        ) {
            byte[] buffer = new byte[1024]; // Buffer de 1 KB
            int bytesLeidos;

            // Leer y escribir en el archivo de destino
            while ((bytesLeidos = entrada.read(buffer)) != -1) {
                salida.write(buffer, 0, bytesLeidos); 
            }

            System.out.println("El archivo se copió correctamente en: " + archivoDestino);
        } catch (IOException e) {
            System.err.println("Ocurrió un error al copiar el archivo: " + e.getMessage());
        }
    }
}
