import java.util.Scanner;
import Opciones.*;

public class ProgramaPrincipal {
    public static void main(String[] args) throws Exception {
        boolean run = true;
        while (run) {
            mostrarMenu();
            int opcion = obtenerOpcion();
            switch (opcion) {
                case 1:
                    new WriteFile();
                    break;
                case 2:
                    new ReadFile();
                    break;
                case 3:
                    new CopyBinaryFile();
                    break;
                case 4:
                    new ProcesarDatos();
                    break;
                case 5:
                    new ExplorarDirectorios();
                    break;
                case 6:
                    run = false;
                    break;
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("======== Menú Principal ============");
        System.out.println("Escoja la ocpción a realizar: ");
        System.out.println("1. Escritura de Archivos");
        System.out.println("2. Lectura de Archivos");
        System.out.println("3. Escritura y lectura de Archivos Binarios");
        System.out.println("4. Procesamiento de datos");
        System.out.println("5. Exploración y manejo de directorios");
        System.out.println("6. Salir");
    }

    public static int obtenerOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opción entre 1 y 6: ");
        int opcion;

        while (true) {
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <= 6) {
                    break;  // Salir del bucle si el número está en el rango
                } else {
                    System.out.println("Número fuera de rango. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next();  // Limpiar el buffer de entrada
            }
        }
        return opcion;
    }
}
