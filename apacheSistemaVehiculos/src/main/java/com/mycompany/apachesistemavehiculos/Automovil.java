/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apachesistemavehiculos;

/**
 *
 * @author perla
 */
public class Automovil implements Vehiculos {
    
    private String marca;
    
    public Automovil(String marca) {
        this.marca = marca;
    }
    
    @Override 
    public void arrancar() {
        System.out.println("El automóvil " + marca + " enciende el motor con la llave.");
    }
    
    @Override
    public void detener() {
        System.out.println("El automóvil " + marca + " frena y apaga el motor.");
    }
  
}
