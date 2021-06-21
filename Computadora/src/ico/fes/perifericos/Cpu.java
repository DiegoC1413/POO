/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.perifericos;

/**
 *
 * @author diego
 */
public class Cpu {
    private String marca;
    private String modelo;
    private int velocidadprocesador;

    public Cpu() {
    }

    public Cpu(String marca, String modelo, int velocidadprocesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadprocesador = velocidadprocesador;
    }

    public int getVelocidadprocesador() {
        return velocidadprocesador;
    }

    public void setVelocidadprocesador(int velocidadprocesador) {
        this.velocidadprocesador = velocidadprocesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Cpu{" + "marca=" + marca + ", modelo=" + modelo + ", velocidadprocesador=" + velocidadprocesador + '}';
    }
    
    
}
