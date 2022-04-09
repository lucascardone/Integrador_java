/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import enums.Colores;
import enums.NvlResistencia;


public class Armadura {

    private Colores colorPrimario;
    private Colores colorSecundario;
    private NvlResistencia nvlResistencia;
            
    private Botas botas;
    private Guantes guantes;
    private Casco casco;
    
    private Integer nvlSalud;
    private Integer nvlEnergia;
    private Boolean generador;

    public Armadura() {
    }

    public Armadura(Colores colorPrimario, Colores colorSecundario, Botas botas, Guantes guantes, Casco casco, Integer nvlSalud, Integer nvlEnergia, Boolean generador, NvlResistencia nvlResistencia) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.botas = botas;
        this.guantes = guantes;
        this.casco = casco;
        this.nvlSalud = nvlSalud;
        this.nvlEnergia = nvlEnergia;
        this.generador = generador;
        this.nvlResistencia = nvlResistencia;
    }

    public NvlResistencia getNvlResistencia() {
        return nvlResistencia;
    }

    public void setNvlResistencia(NvlResistencia nvlResistencia) {
        this.nvlResistencia = nvlResistencia;
    }

    public Colores getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(Colores colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public Colores getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(Colores colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Botas getBotas() {
        return botas;
    }

    public void setBotas(Botas botas) {
        this.botas = botas;
    }

    public Guantes getGuantes() {
        return guantes;
    }

    public void setGuantes(Guantes guantes) {
        this.guantes = guantes;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    public Integer getNvlSalud() {
        return nvlSalud;
    }

    public void setNvlSalud(Integer nvlSalud) {
        this.nvlSalud = nvlSalud;
    }

    public Integer getNvlEnergia() {
        return nvlEnergia;
    }

    public void setNvlEnergia(Integer nvlEnergia) {
        this.nvlEnergia = nvlEnergia;
    }

    public Boolean getGenerador() {
        return generador;
    }

    public void setGenerador(Boolean generador) {
        this.generador = generador;
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", botas=" + botas + ", guantes=" + guantes + ", casco=" + casco + ", nvlSalud=" + nvlSalud + ", nvlEnergia=" + nvlEnergia + ", generador=" + generador + '}';
    }

    public void iniciar(){
        System.out.println("Iniciando sistemas...");
        setColorPrimario(Colores.ROJO);
        setColorSecundario(Colores.DORADO);
        setNvlResistencia(NvlResistencia.HRA);
        setBotas(new Botas(100));
        setGuantes(new Guantes(100));
        setCasco(new Casco("", 100));
        setGenerador(Boolean.TRUE);
        setNvlEnergia(100);
        setNvlSalud(100);
    }

}
