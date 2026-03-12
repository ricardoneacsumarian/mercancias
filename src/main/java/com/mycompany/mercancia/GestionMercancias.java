/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mercancia;

/**
*
* Clase principal que ejecuta el sistema de transporte.
* @author ricardo
*/

public class GestionMercancias {
    public static void main(String[] args) {
        SistemaTransporte sistema = new SistemaTransporte();
        sistema.agregarMercancia(new Mercancia("QuÃ­mico A", "EspaÃ±a", "Francia", 100));
        sistema.agregarMercancia(new Mercancia("Gas B", "Italia", "Alemania", 200));
        sistema.mostrarMercancias();
       
    }
}