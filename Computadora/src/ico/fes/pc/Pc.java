/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.pc;

import ico.fes.perifericos.Cpu;
import ico.fes.perifericos.Monitor;
import ico.fes.perifericos.Mouse;
import ico.fes.perifericos.Teclado;

/**
 *
 * @author diego
 */
public class Pc {
    private String marca;
    private int modelo;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;
    private Cpu cpu;

    public Pc() {
    }

    public Pc(String marca, int modelo, Monitor monitor, Mouse mouse, Teclado teclado, Cpu cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
        this.cpu = cpu;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Pc{" + "marca=" + marca + ", modelo=" + modelo + ", monitor=" + monitor + ", mouse=" + mouse + ", teclado=" + teclado + ", cpu=" + cpu + '}';
    }
   
    
    
}
