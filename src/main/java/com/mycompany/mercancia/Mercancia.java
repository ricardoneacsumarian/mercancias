/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mercancia;

/**
 *
 * @author ricardo
 */
/**
 * Clase que representa una mercancÃ­a peligrosa.
 */
public class Mercancia {
    private String nombre;
    private String origen;
    private String destino;
    private int cantidad;

    public Mercancia(String nombre, String origen, String destino, int cantidad) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String mostrarInfo() {
    return "MercancÃ­a: " + nombre + " | Origen: " + origen + " | Destino: " + destino + " | Cantidad: " + cantidad;
    }

}
