package Paciente;
import java.util.Locale;
import java.util.Scanner;

public class PacienteApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); //usar puntos para las entradas double

        Paciente paciente1 = new Paciente();

        System.out.println("Ingrese su nombre:");
        paciente1.nombre = scanner.nextLine();

        System.out.println("Ingrese su edad:");
        paciente1.edad = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Ingrese su identificación:");
        paciente1.identificacion = scanner.nextLine();

        System.out.println("Ingrese su sexo:");
        paciente1.sexo = scanner.nextLine();

        System.out.println("Ingrese su peso:");
        paciente1.peso = scanner.nextDouble();

        System.out.println("Ingrese su altura:");
        paciente1.altura = scanner.nextDouble();

        paciente1.mostrarInformacion();
        double imc = paciente1.calcularIMC();
        System.out.printf("IMC: %.2f", imc);
        scanner.close();
    }
}
