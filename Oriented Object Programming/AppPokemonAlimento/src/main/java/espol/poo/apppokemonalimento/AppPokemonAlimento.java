package espol.poo.apppokemonalimento;
import espol.poo.modelo.Alimento;
import espol.poo.modelo.Pokemon;

public class AppPokemonAlimento {

    public static void main(String[] args) {
        System.out.println("Trabajo autónomo");
                //Cree un alimento con las siguientes caracteristicas
        //nombre: "golden berry" , valor-nutricional: 100
        //use el contructor apropiado
        Alimento goldenBerry = new Alimento("goldenBerry", 100);
        
        //Cree un alimento con las siguientes caracteristicas
        //nombre: "strawberry" , con valor nutricional predeterminado
        //use el contructor apropiado
        Alimento strawberry = new Alimento("strawberry");
        
        //cree un nuevo pokemon
        //1. Haga que el pokemon creado llame al método comer - (pase como argumento el primer alimento creado)
        //2.Muestre la información del Pokemon
        Pokemon pikachu = new Pokemon("Pikachu", "Electric Pokemon", 1000, 100);
        pikachu.comer(goldenBerry);
        pikachu.mostrarInformacion();

        //3.Haga que el pokemon creado llame al método comer - (pase como argumento el segundo alimento creado)
        //4. Muestre la información del Pokemon
        pikachu.comer(strawberry);
        pikachu.mostrarInformacion();


        //PARTE 5
        // 1
        // Alimento a = new Alimento();
        // a.nombre="fresa";

        //Errores
        // La clase alimento no tiene un constructor sin parametros definido.
        // No se puede asignar directamente valores a los atributos de instancia porque no son publicos


        //2
        // Pokemon p1 = new Pokemon("Pikachu","Sparky",300,1200); 
        // Pokemon p2 = p1;
        // p1.setNombre("Gigante");
        // System.out.println(p1.getNombre());
        // System.out.println(p2.getNombre());

        //Errores
        // Los metódo setter y getter del atributo nombre están definidos como setName y getName respectivamente
        // En el caso de llamar a las funciones correctas, se imprimiría dos veces nuevo nombre asignado

        //3
        // Pokemon p3 = new Pokemon("Charizard","MyDragon"); 
        // System.out.println(p3.mostrarInformacion());

        //Errores
        // El metódo mostrarInformacion no duvuelve nada, porque lo que se genera un error

        //4
        // Pokemon p4 = new Pokemon("Chikorita","Chiko");
        // p4.setPuntosSalud(100); 
        // System.out.println(p4.mostrarInformacion());
        
        //Errores
        // El mismo error del ejercicio anterior,
    }
}
