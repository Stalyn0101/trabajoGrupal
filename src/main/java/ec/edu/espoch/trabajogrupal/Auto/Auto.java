/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.trabajogrupal.Auto;

import java.awt.Color;

/**
 *
 * @author USER
 */
public class Auto {
    private String Marca;
    private int Modelo;
    private double Motor;
    private TipoCombus tipoCombus;
    private TipoAuto tipoAuto;
    private int numPuertas;
    private int numAsientos;
    private double velocMaxima;
    private Color color;
    private double velocActual = 0;
    

    public Auto(String Marca, int Modelo, double Motor, TipoCombus tipoCombus, TipoAuto tipoAuto, int numAsientos,int numPuertas, double velocMaxima,Color color, double velocActual) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Motor = Motor;
        this.tipoCombus = tipoCombus;
        this.tipoAuto = tipoAuto;
        this.numPuertas = numPuertas;
        this.numAsientos = numAsientos;
        this.velocMaxima = velocMaxima;
        this.color = color;
        this.velocActual = velocActual;
        
        
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public double getMotor() {
        return Motor;
    }

    public void setMotor(double Motor) {
        this.Motor = Motor;
    }

    public TipoCombus getTipoCombus() {
        return tipoCombus;
    }

    public void setTipoCombus(TipoCombus tipoCombus) {
        this.tipoCombus = tipoCombus;
    }

    public TipoAuto getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(TipoAuto tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public double getVelocMaxima() {
        return velocMaxima;
    }

    public void setVelocMaxima(double velocMaxima) {
        this.velocMaxima = velocMaxima;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVelocActual() {
        return velocActual;
    }

    public void setVelocActual(double velocActual) {
        this.velocActual = velocActual;
    }

    
}

