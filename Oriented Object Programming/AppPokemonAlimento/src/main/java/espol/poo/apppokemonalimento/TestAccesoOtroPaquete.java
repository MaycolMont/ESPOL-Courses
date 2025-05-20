/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espol.poo.apppokemonalimento;

import espol.poo.modelo.Pokemon;

/**
 *
 * @author rocio
 */
public class TestAccesoOtroPaquete {
    public static void main(String[] args){
        //llama al constructor String,String
        Pokemon pk1 = new Pokemon("Pikachu","Barry");
        pk1.mostrarInformacion();
        //pk1.nombre = "cambio nombre"; //modificador public
        //pk1.especie = "cambio especie"; //modificador public
        pk1.mostrarInformacion();
        //LAS SIGUIENTES SENTENCIAS SON INVALIDAS
        //pk1.puntosCombate = 13; //modificador default - no permite acceder porque esta en otro paquete
        //pk1.puntosSalud = 23; //modificador private - no permite acceder       
    }
}
