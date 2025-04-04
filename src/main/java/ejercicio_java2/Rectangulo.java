/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_java2;

/**
 *
 * @author JOSEPH
 */
public class Rectangulo extends Forma{
    private double base;
    private double altura;

    public Rectangulo() {
    }
    
    

    public Rectangulo(double base, double altura, String nombre, String color) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    

    @Override
    public double calcularArea() {
        return base * altura;
    }
    
}
