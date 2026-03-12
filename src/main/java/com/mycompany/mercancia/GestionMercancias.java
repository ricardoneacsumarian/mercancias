/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mercancia;

/**
 *
 * @author ricardo
 */
/**
 *  El siguiente cÃ³digo es un fragmento funcional pero con margen de mejora para poder aplicar refactorizaciÃ³n, control de versiones, documentaciÃ³n con JavaDoc y herramientas de integraciÃ³n continua. El cÃ³digo 
representarÃ¡ una gestiÃ³n bÃ¡sica de mercancÃ­as peligrosas dentro de una compaÃ±Ã­a de transporte. ContendrÃ¡ deficiencias intencionadas para la refactorizaciÃ³n y optimizaciÃ³n como parte de la actividad.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal que gestiona las mercancÃ­as peligrosas.
 */

public class GestionMercancias {
    public static void main(String[] args) {
        SistemaTransporte sistema = new SistemaTransporte();
        sistema.agregarMercancia(new Mercancia("QuÃ­mico A", "EspaÃ±a", "Francia", 100));
        sistema.agregarMercancia(new Mercancia("Gas B", "Italia", "Alemania", 200));
        sistema.mostrarMercancias();
    }
}

/**
 * Clase que representa una mercancÃ­a peligrosa.
 */

class Mercancia {
    String nombre;
    String origen;
    String destino;
    int cantidad;

    public Mercancia(String n, String o, String d, int c) {
        this.nombre = n;
        this.origen = o;
        this.destino = d;
        this.cantidad = c;
    }

    public void mostrarInfo() {
        System.out.println("MercancÃ­a: " + nombre + " | Origen: " + origen + " | Destino: " + destino + " | Cantidad: " + cantidad);
    }
}

/**
 * Clase que gestiona la logÃ­stica de transporte.
 */

class SistemaTransporte {
    List<Mercancia> mercancias = new ArrayList<>();

    public void agregarMercancia(Mercancia m) {
        mercancias.add(m);
    }

    public void mostrarMercancias() {
        for (Mercancia m : mercancias) {
            m.mostrarInfo();
        }
    }
}
