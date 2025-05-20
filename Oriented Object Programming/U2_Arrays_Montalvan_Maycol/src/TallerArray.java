import java.util.Scanner;

public class TallerArray {
    public static void main(String[] args) {
        // Parte 1

        int[] array = new int[10];
        System.out.println("La longitud del arreglo es: " + array.length);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los valores del arreglo:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Valor en la posición " + i + ": ");
            int inputUser = scanner.nextInt();

            if (inputUser > 5) {
                array[i] = 100;
            } else {
                array[i] = inputUser;
            }
        }

        System.out.println("Arreglo modificado:");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor en la posición " + i + ": " + array[i]);
        }

        scanner.close();

        // Parte 2
        System.out.println("Parte 2");

        int[][] matriz1 = {{2, 4, 0}, {6, 2, 3}, {5, 2, 1}};
        int[][] matriz2 = {{1, 1, 2}, {2, 1, 1}, {1, 2, 1}};

        int iResult = 1;
        for (int i = 0; i<matriz1.length; i++) {
            for (int j = 0; j<matriz1[i].length; j++) {
                System.out.printf("R%d: " + matriz1[i][j] * matriz2[i][j] + "\n", iResult);
                iResult++;
            }
        }
    }
}
