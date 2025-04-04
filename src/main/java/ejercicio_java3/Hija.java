/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_java3;

/**
 *
 * @author JOSEPH
 */
public class Hija extends Padre{
    
    private String carrera;

    
    public Hija(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera=carrera;
    }

    
    public Hija(String nombre, int edad, double sueldo, String carrera) {
        super(nombre, edad, sueldo);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    
    @Override
    protected String verMensaje(){
        return "Objeto de la clase Hija";
    }

}
