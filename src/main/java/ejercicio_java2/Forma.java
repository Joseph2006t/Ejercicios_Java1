/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_java2;

/**
 *
 * @author JOSEPH
 */
public abstract class Forma {
    private String nombre;
    private String color;

    public Forma() {
    }

    protected Forma(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    protected abstract double calcularArea();
    
}
