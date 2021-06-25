/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import ico.fes.persona.Alumno;

/**
 *
 * @author diego
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a = new Alumno("318018315", "ICO", 2,"DIEGO", 19, 1, 1.81f);
        System.out.println("Nombre" +a.getNombre());
    }
    
}
