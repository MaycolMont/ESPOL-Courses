package Paciente;

class Paciente {
    String nombre;
    int edad;
    String identificacion;
    String sexo;
    double peso;
    double altura;

    public void mostrarInformacion() {
        System.out.printf("Nombre: %s, Edad: %d, Identificación: %s, Sexo: %s, Peso: %.2f, Altura: %.2f\n", nombre, edad, identificacion, sexo, peso, altura);
    }

    public boolean esMayorDeEdad(){
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public double calcularIMC() {
        double imc = peso/(altura*altura);
        if (imc < 18.5){
            System.out.println("Bajo peso");
        } else if (imc >= 25.0){
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Ideal");
        }
        return imc;
    }
}