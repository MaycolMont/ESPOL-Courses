/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.modelo;

/**
 *
 * @author rocio
 */
public class TestAccesoMismoPaquete {
    public static void main(String[] args){
        //llama al constructor String,String
        Pokemon pk1 = new Pokemon("Pikachu","Barry");
        pk1.mostrarInformacion();
        pk1.setName("cambio nombre"); //modificador public
        // pk1.especie = "cambio especie"; modificador public
        pk1.puntosCombate = 13; //modificador default - permite acceder porque esta en el mismo paquete
        pk1.mostrarInformacion();
        //LA SIGUIENTE SENTENCIA ES INVALIDA
        //pk1.puntosSalud = 23; //modificador private - no permite acceder desde fuera de la clase      
    }
}
