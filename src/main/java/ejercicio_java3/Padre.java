/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_java3;

/**
 *
 * @author JOSEPH
 */
public class Padre {
    private String nombre;
    private int edad;
    private double sueldo;

    public Padre() {
    }
    
    public Padre(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    
    
    public Padre(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    public void CumplirAños(){
        this.edad++;
    }

    protected String verMensaje(){
        return "Mensaje de la clase Padre";
    }
    
    
}
