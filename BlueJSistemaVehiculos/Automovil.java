
/**
 * Write a description of class Automovil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Automovil implements Vehiculo {
    private String marca;
    
    public Automovil(String marca) {
        this.marca = marca;
    }
    
    public void arrancar() {
        System.out.println("El automóvil " + marca + " enciende el motor con la llave.");
    }
    
    public void detener() {
        System.out.println("El automóvil " + marca + " frena y apaga el motor.");
    }
}