/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;


public class Objetos {

    
    private Boolean hostil;
    private Integer distancia;
    private String nombre;

    public Objetos() {
    }

    public Objetos(Boolean hostil, Integer distancia, String nombre) {
        this.hostil = hostil;
        this.distancia = distancia;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Boolean getHostil() {
        return hostil;
    }

    public void setHostil(Boolean hostil) {
        this.hostil = hostil;
    }

    @Override
    public String toString() {
        return "Objetos{" + "hostil=" + hostil + ", distancia=" + distancia + ", nombre=" + nombre + '}';
    }
    
    
    
}
