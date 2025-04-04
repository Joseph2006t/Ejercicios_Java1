/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_java2;

import java.util.Scanner;

/**
 *
 * @author JOSEPH
 */
public class prueba {
    
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(3,2);
        
        double resultadoRectangulo = rectangulo1.calcularArea();
        
        System.out.println("El area del rectangulo1 es: "+ resultadoRectangulo);
        
        
        Circulo circulo1 = new Circulo(2);
        
        double resultadoCirculo = circulo1.calcularArea();
        
        System.out.println("El area del circulo1 es: "+ resultadoCirculo);
        
        
        
        int [] numeros = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<numeros.length;i++){
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        
        for(int i=numeros.length-1;i>=0;i--){
            System.out.println(numeros[i]);
        }
        
        
        
        
        
        
    }
    
}
