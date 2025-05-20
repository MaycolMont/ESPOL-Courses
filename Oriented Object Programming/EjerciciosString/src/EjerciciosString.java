import java.util.Scanner;

public class EjerciciosString {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        literal1();
        literal2();
        literal3();
        literal4();

        scanner.close();
    }

    public static void literal1() {
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        
        int totalCharts = cadena.length();
        System.out.println("Total de caracteres: " + totalCharts);
        for (int i = 0; i < 10; i++) {
            System.out.println(cadena);
        }

        System.out.println(cadena.charAt(0));
        System.out.println(cadena.substring(0, 3));

        if (totalCharts >= 7) {
            System.out.println("Séptimo caracter: "+ cadena.charAt(6));
        } else {
            System.out.println("La cadena no tiene suficientes caracteres.");
        }

        System.out.println(cadena.substring(1, totalCharts-2));
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.replace("a", "e"));
    }

    public static void literal2() {
        System.out.print("Ingrese la cadena 1: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingrese la cadena 2: ");
        String cadena2 = scanner.nextLine();

        cadena1 = cadena1.toLowerCase();
        cadena2 = cadena2.toLowerCase();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas no son iguales");
        }
    }

    public static void literal3() {
        System.out.println("Cantidad de correos electrónicos a ingresar: ");
        int nCorreos = scanner.nextInt();
        scanner.nextLine();

        String[] arrayCorreos = new String[nCorreos];

        for (int i = 0; i < nCorreos; i++) {
            System.out.println("Ingresar correo: ");
            arrayCorreos[i] = scanner.nextLine();
        }

        int nCorreosProfe = 0, nCorreosEstu = 0;

        for (String correo : arrayCorreos) {
            String[] partesCorreo = correo.split("[@]");
            String dominio = partesCorreo[1];
            
            if (dominio.equals("prof.college.edu")) {
                nCorreosProfe++;
            } else if (dominio.equals("student.college.edu")) {
                nCorreosEstu++;
            }
        }

        System.out.println("Número de correos de profesores: " + nCorreosProfe);
        System.out.println("Número de correos de estudiantes: " + nCorreosEstu);
    }

    public static void literal4() {
        System.out.println("Ingrese una cadena para encriptar: ");
        String cadenaAntes = scanner.nextLine();
        String chartsPar = "";
        String chartsImp = "";
        for (int i = 0; i < cadenaAntes.length(); i++) {
            if (i%2 == 0) {
                chartsPar += cadenaAntes.charAt(i);
            } else {
                chartsImp += cadenaAntes.charAt(i);
            }
        }

        String cadenaEncriptada = chartsPar + chartsImp;

        System.out.println("Cadena encriptada: " + cadenaEncriptada);


        System.out.println("Ingrese una cadena encriptada: ");
        cadenaEncriptada = scanner.nextLine();
        String cadenaDesencriptada = "";
 
        int lengthCadena = cadenaEncriptada.length();
        String chartPar = cadenaEncriptada.substring(0, lengthCadena/2 + 1);
        String chartIm = cadenaEncriptada.substring(lengthCadena/2 + 1, lengthCadena);

        for (int i = 0;i < chartIm.length(); i++) {
            cadenaDesencriptada += chartPar.charAt(i) + "" + chartIm.charAt(i);
        }

        if (chartPar.length() > chartIm.length()) {
            cadenaDesencriptada += chartPar.charAt(chartIm.length());
        }

        System.out.println("Cadena desencriptada: " + cadenaDesencriptada);
    }
}