/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

/**
 *
 * @author jgare
 */
public class Ejer3 {

     public static void main(String[] args) {
        Jugador jugador = new Jugador("Juan", 140, "Argentino", 29);
        
        
        System.out.println("Nombre: " + jugador.getNombre());
        System.out.println("Puntaje: " + jugador.getPuntaje());
        System.out.println("Nacionalidad: " + jugador.getNacionalidad());
        System.out.println("Edad: " + jugador.getEdad());
    }
    
}
