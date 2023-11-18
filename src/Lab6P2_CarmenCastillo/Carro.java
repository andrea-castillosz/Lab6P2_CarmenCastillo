/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6P2_CarmenCastillo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author casti
 */
public class Carro {
    
    private Date fechaFabric;
    String marca;
    String modelo;
    String paisR;
    Color color;
    double precio;
    ArrayList <Partes> mejoras = new ArrayList();
    boolean marcador;

    public Carro(Date fechaFabric, String marca, String modelo, String paisR, Color color, double precio, boolean marcador) {
        this.fechaFabric = fechaFabric;
        this.marca = marca;
        this.modelo = modelo;
        this.paisR = paisR;
        this.color = color;
        this.precio = precio;
        this.marcador = marcador;
    }

    public Date getFechaFabric() {
        return fechaFabric;
    }

    public void setFechaFabric(Date fechaFabric) {
        this.fechaFabric = fechaFabric;
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

    public String getPaisR() {
        return paisR;
    }

    public void setPaisR(String paisR) {
        this.paisR = paisR;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Partes> getMejoras() {
        return mejoras;
    }

    public void setMejoras(ArrayList<Partes> mejoras) {
        this.mejoras = mejoras;
    }

    public boolean isMarcador() {
        return marcador;
    }

    public void setMarcador(boolean marcador) {
        this.marcador = marcador;
    }
    
    public String validMarcador(boolean marc) { //es reconstruido o comprado
        if (marc == true) {
            return "Es reconstruido.";
        } else {
            return "Es comprado.";
        }
    }

    @Override
    public String toString() {
        String cad = "";
        cad += "Carros:\n" + "Marca: " + marca + "\nModelo: " + modelo + "\nColor: " + color + "\nPrecio: " + precio + "\nMarcador: " + validMarcador(marcador);
        
        return cad;
    }
    
    
    
}
