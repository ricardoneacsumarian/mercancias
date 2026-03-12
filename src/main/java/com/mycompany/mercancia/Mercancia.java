/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mercancia;

/**
 * Representa una mercancía peligrosa dentro del sistema de transporte.
 * @author ricardo
 */

public class Mercancia {
    private String nombre;
    private String origen;
    private String destino;
    private int cantidad;

    /**
     * Representa el constructor de un objeto de tipo mercancía.
     * 
     * @param nombre nombre de la mercancía.
     * @param origen país de origen de la mercancía.
     * @param destino país de destino.
     * @param cantidad cantidad de la mercancía.
     */
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

    /**
     * Devuele la información de la mercancía.
     * 
     * @return devuelve la información de la mercancía formateada.
     */
    public String mostrarInfo() {
    return "MercancÃ­a: " + nombre + " | Origen: " + origen + " | Destino: " + destino + " | Cantidad: " + cantidad;
    }

}
