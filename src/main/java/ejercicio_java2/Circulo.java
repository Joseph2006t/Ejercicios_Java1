/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_java2;

/**
 *
 * @author JOSEPH
 */
public class Circulo extends Forma{
    private double radio;

    public Circulo() {
    }
    
    

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, String nombre, String color) {
        super(nombre, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    
    
    @Override
    public double calcularArea() {
        return radio * radio * 3.14;
    }
    
}
