package PokemonApp;

public class PokemonAplicacion {
    public static void main(String[] args) {
       Pokemon pk1 = new Pokemon();
       pk1.nombre = "Charizard";
       pk1.puntosSalud = 200;
       pk1.puntosCombate = 1000;
        
       Pokemon pk2 = new Pokemon();
       pk2.nombre = "Pikachu";
       pk2.puntosSalud = 300;
       pk2.puntosCombate = 1500;

       pk2.saludar(5);
       pk1.atacar(pk2);
       pk1.atacar(pk2);
       pk1.atacar(pk2);
    }
}
