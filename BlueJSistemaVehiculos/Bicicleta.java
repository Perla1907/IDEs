
/**
 * Write a description of class Bicicleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Bicicleta implements Vehiculo {
    
    public void arrancar() {
        System.out.println("La bicicleta comienza a avanzar cuando pedaleas.");
    }
    
    public void detener() {
        System.out.println("La bicicleta se detiene al usar los frenos del manubrio.");
    }
}