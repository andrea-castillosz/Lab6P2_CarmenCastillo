/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6P2_CarmenCastillo;

import java.util.ArrayList;

/**
 *
 * @author casti
 */
public class Concesionarias {
    private String nombre;
    private String localizacion;
    private ArrayList <Carro> listaCarros;

    public Concesionarias() {
    }

    public Concesionarias(String nombre, String localizacion) {
        this.nombre = nombre;
        this.localizacion = localizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public ArrayList<Carro> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(ArrayList<Carro> listaCarros) {
        this.listaCarros = listaCarros;
    }

    @Override
    public String toString() {
        String x = "";
        x += "Nombre: " + nombre + "Lista de carros: \n";
        for (Carro l : listaCarros) {
            x+=l.toString()+"\n";
        }
        return x;
    }
    
    
    
    
}
