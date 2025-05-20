package espol.poo.modelo;

public class Alimento {
    private String nombre;
    private int valorNutricional;

    //constructor
    public Alimento(String nombre, int valorNutricional) {
        this.nombre = nombre;
        this.valorNutricional = valorNutricional;
    }

    public Alimento(String nombre) { 
        this.nombre = nombre;
        this.valorNutricional = 10;
    }

    public void mostrarInformacion(){
        System.out.printf("Alimento: %s\nValor nutricional: %d\n", nombre, valorNutricional);
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getValorNutricional() {
        return valorNutricional;
    }
}
