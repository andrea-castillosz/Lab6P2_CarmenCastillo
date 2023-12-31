/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6P2_CarmenCastillo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author casti
 */
public class Jugadores {

    String nombre;
    String correo;
    String paisR;
    String user;
    String contra;
    ArrayList<Carro> listaCarros = new ArrayList();
    double cuantBanco;
    private Date fecha_nacimiento;

    public Jugadores() {
    }

    public Jugadores(String nombre, String correo, String paisR, String user, String contra, double cuantBanco, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.correo = correo;
        this.paisR = paisR;
        this.user = user;
        this.contra = contra;
        this.cuantBanco = cuantBanco;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carro> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(ArrayList<Carro> listaCarros) {
        this.listaCarros = listaCarros;
    }

    public double getCuantBanco() {
        return cuantBanco;
    }

    public void setCuantBanco(double cuantBanco) {
        this.cuantBanco = cuantBanco;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPaisR() {
        return paisR;
    }

    public void setPaisR(String paisR) {
        this.paisR = paisR;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

//    @Override
//    public String toString() {
//        String cad = "";
//        cad += "Jugadores{" + "Nombre: " + nombre  + ", cuantBanco=" + cuantBanco + '}';
//        for (Carro l : listaCarros) {
//            cad+=l.toString()+"\n";
//        }
//        return cad;
//    }
    @Override
    public String toString() {
        String cad = "";
        cad += "User: " + user;
        for (Carro l : listaCarros) {
            cad += l.toString() + "\n";
        }
        return cad;
    }

}
