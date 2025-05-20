/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio de práctica de clases Wrapper y proceso de boxing y unboxing
 *
 * @author 
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //1. solicitar números enteros y agregarlos a la lista
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número: ");
            Integer num = scanner.nextInt(); // Boxing
            numeros.add(num);
        }
        //3. llamar a la función suma pares y mostrar el valor de la suma
        System.out.println("Suma de números pares: " + sumaPares(numeros));

        scanner.close();
        
    }

    public static int sumaPares(ArrayList<Integer> lista) {
        int sum = 0;
        for (Integer i : lista) {
            //2. completar código para sumar solo los números pares;
            if (i%2 == 0) {
                sum += i; // Unboxing
            }
        }
        return sum;
    }

}
