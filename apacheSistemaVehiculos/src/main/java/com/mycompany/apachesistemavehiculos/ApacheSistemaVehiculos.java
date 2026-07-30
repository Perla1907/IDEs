/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.apachesistemavehiculos;

/**
 *
 * @author perla
 */
public class ApacheSistemaVehiculos {

    public static void main(String[] args) {
        
        Automovil automovil = new Automovil("Toyota");
        System.out.println("Automóvil");
        automovil.arrancar();
        automovil.detener();
  
        
        Bicicleta bicicleta = new Bicicleta();
        System.out.println("\nBicicleta");
        bicicleta.arrancar();
        bicicleta.detener();
    }
}
