package Opciones;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.BufferedWriter;
import java.io.IOException;

public class ExplorarDirectorios {
    public ExplorarDirectorios() {
        Path rootPath = Paths.get("").toAbsolutePath();
        try {
            Path proyectPath = rootPath.resolve("Proyect");
            Files.createDirectory(proyectPath);
            Path datosPath = proyectPath.resolve("datos.txt");
            Path logsPath = proyectPath.resolve("logs.txt");
            Files.createFile(datosPath);
            Files.createFile(logsPath);
            BufferedWriter writer = Files.newBufferedWriter(datosPath);
            writer.write("# Información de usuarios\r\n" + //
                                "ID: 1, Nombre: Juan Pérez, Edad: 30\r\n" + //
                                "ID: 2, Nombre: María Gómez, Edad: 25\r\n" + //
                                "ID: 3, Nombre: Pedro Ruiz, Edad: 35\r\n" + //
                                "ID: 4, Nombre: Ana López, Edad: 28\r\n" + //
                                "");
            writer.close();
            writer = Files.newBufferedWriter(logsPath);
            writer.write("[INFO] 2024-12-18 10:00:01 - Directorio 'proyecto' creado exitosamente.\r\n" + //
                                "[INFO] 2024-12-18 10:00:02 - Archivo 'datos.txt' creado y escrito.\r\n" + //
                                "[INFO] 2024-12-18 10:00:03 - Archivo 'logs.txt' creado y escrito.\r\n" + //
                                "[INFO] 2024-12-18 10:00:04 - Listando archivos en el directorio 'proyecto'.\r\n" + //
                                "[INFO] 2024-12-18 10:00:05 - Se encontraron 2 archivos: datos.txt, logs.txt.\r\n" + //
                                "[INFO] 2024-12-18 10:00:06 - Programa finalizado correctamente.\r\n" + //
                                "");
            writer.close();
            System.out.println("Archivos Creados con exito");
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
