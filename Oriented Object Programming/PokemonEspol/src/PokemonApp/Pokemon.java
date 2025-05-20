package PokemonApp;

public class Pokemon {
    
    // ATRIBUTOS O PROPIEDADES
    String nombre;
    String especie;
    int puntosSalud;
    int puntosCombate;

    // METODOS()
    public void mostrarInformacion(){
        System.out.printf("especie: %s, nombre: %s \n"
        + "puntos de Salud: %d, puntos de Combate: %d \n",
        especie, nombre, puntosSalud, puntosCombate);
    }

    public void saludar(int veces){
        for(int i=0; i < veces; i++){
            System.out.printf("Hola %s\n", nombre);
        }
    }

    public boolean esquivar(){
        double numeroAleatorio = Math.random();
        if (numeroAleatorio >= 0.5){
            System.out.printf("%s esquivó el ataque\n", nombre);
            return true;
        } else {

            System.out.printf("%s no logró esquivar el ataque\n", nombre);
            return false;
        }
    }

    public void atacar(Pokemon pokemon) {
        if (!pokemon.esquivar()){
            int dañoCausado = (int) (puntosCombate * 0.1);
            pokemon.puntosSalud -= dañoCausado;
            System.out.printf("Daño causado: %d\n", dañoCausado);
        }
    }

    public void comer(Alimento alimento) {
        puntosSalud += alimento.getValorNutricional();
    }
}
