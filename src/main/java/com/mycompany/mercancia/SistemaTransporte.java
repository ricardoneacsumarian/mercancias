/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mercancia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricardo
 */
/**
 * Clase que gestiona la logÃ­stica de transporte.
 */
public class SistemaTransporte {
    private List<Mercancia> mercancias = new ArrayList<>();

    public List<Mercancia> getMercancias() {
        return mercancias;
    }

    public void agregarMercancia(Mercancia mercancia) {
        if(mercancia==null){
            System.err.println("no puede agregar una mercancía nula");
            return;
        }
        mercancias.add(mercancia);
    }

    public void mostrarMercancias() {
        if(mercancias.isEmpty()){
            System.out.println("no hay mercancías registradas");
            return;
        }
        for (Mercancia mercancia : mercancias) {
            System.out.println(mercancia.mostrarInfo());
            
            
        }
    }
}
