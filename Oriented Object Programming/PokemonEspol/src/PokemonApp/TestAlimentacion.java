package PokemonApp;

public class TestAlimentacion {
    public static void main(String[] args) {
        Pokemon pk = new Pokemon();
        pk.nombre = "Charizard";
        pk.especie = "Fuego";
        pk.puntosCombate = 2000;
        pk.puntosSalud = 200;

        Alimento alimento = new Alimento("baya", 5);
        Alimento alimento2 = new Alimento("piña");
        pk.comer(alimento);
        pk.mostrarInformacion();
        pk.comer(alimento2);
        pk.mostrarInformacion();
    }
}
