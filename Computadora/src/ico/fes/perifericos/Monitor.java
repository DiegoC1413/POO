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
public class Monitor {
    private String marca;
    private String modelo;
    private String pulgadas;

    public Monitor() {
    }

    public Monitor(String marca, String modelo, String pulgadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
    }

    public String getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
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
        return "Monitor{" + "marca=" + marca + ", modelo=" + modelo + ", pulgadas=" + pulgadas + '}';
    }
    
    
            
}
