/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import ico.fes.pc.Pc;
import ico.fes.perifericos.Cpu;
import ico.fes.perifericos.Monitor;
import ico.fes.perifericos.Mouse;
import ico.fes.perifericos.Teclado;



/**
 *
 * @author diego
 */
public class Computadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pc pc1 = new Pc ();
        pc1.setMonitor(new Monitor("LG", "320", " 15 pulgadas"));
        pc1.setTeclado(new Teclado("MS1", "GK30", 104, 8));
        pc1.setMouse(new Mouse("Logitech", "G502", "Inalambrico"));
        pc1.setCpu(new Cpu("Intel", "i7", 3));
        pc1.setMarca("Lenovo");
        pc1.setModelo(730);
        
        System.out.println(pc1); 
         
        pc1.getMonitor().setModelo("330");
        System.out.println(pc1);
    }
    
}
