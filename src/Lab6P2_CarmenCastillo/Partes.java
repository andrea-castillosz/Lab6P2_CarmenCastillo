/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6P2_CarmenCastillo;

/**
 *
 * @author casti
 */
public class Partes {
    String marca;
    String clasi;
    double precio;

    public Partes() {
    }

    public Partes(String marca, String clasi, double precio) {
        this.marca = marca;
        this.clasi = clasi;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getClasi() {
        return clasi;
    }

    public void setClasi(String clasi) {
        this.clasi = clasi;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Partes{" + "marca=" + marca + ", clasi=" + clasi + ", precio=" + precio + '}';
    }
    
    
    
}
