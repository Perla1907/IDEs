/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.apachesistemavehiculos;

/**
 *
 * @author perla
 */
public class Bicicleta implements Vehiculos {
    
    @Override
    public void arrancar() {
        System.out.println("La bicicleta comienza a avanzar cuando pedaleas.");
    }
    
    @Override
    public void detener() {
        System.out.println("La bicicleta se detiene al usar los frenos del manubrio.");
    }
}
