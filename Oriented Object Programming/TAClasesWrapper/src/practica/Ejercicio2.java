/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio de práctica de objeto Wrapper a partir de un string
 *
 * @author 
 */
public class Ejercicio2 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Double> difTemperatura = new ArrayList<>();
        String info = "15.8-18.9;16.6-19.2;15.5-21.2;14.8-20.1;16.2-18.9;15.4-19.5";
        //a partir de la variable info extraer las temperaturas y almacenar la diferencia en la lista difTemperatura
        String[] arrayTemps = info.split("[;]");
        for (String temps : arrayTemps) {
            String[] temperaturas = temps.split("[-]");
            double iniTemp = Double.parseDouble(temperaturas[0]);
            double finTemp = Double.parseDouble(temperaturas[1]);
            difTemperatura.add(finTemp - iniTemp);
        }

        for (Double temp : difTemperatura) {
            System.out.println(temp);
        }

        int[] arrayAlturas = convertirPesos(listaPersonas());
        for (int altura : arrayAlturas) {
            System.out.println(altura);
        }

    }

    public static ArrayList<Persona> listaPersonas() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Persona> personas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            System.out.println("Ingrese un nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese una altura: ");
            float altura = scanner.nextFloat();
            scanner.nextLine();

            personas.add(new Persona(nombre, altura));
        }

        scanner.close();
        return personas;
    }

    public static int[] convertirPesos(ArrayList<Persona> listaPersonas) {
        int[] listaAlturas = new int[3];

        int i = 0;
        for (Persona persona : listaPersonas) {
            listaAlturas[i] = (int) persona.getAltura();
            i++;
        }

        return listaAlturas;
    }
}
