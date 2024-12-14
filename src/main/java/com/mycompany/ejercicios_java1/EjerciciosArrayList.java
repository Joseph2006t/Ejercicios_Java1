/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_java1;

import java.util.ArrayList;

/**
 *
 * @author JOSEPH
 */
public class EjerciciosArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Abel");
        nombres.add("Alexander");
        nombres.add("Joseph");
        int TamanioArray = nombres.size();
        System.out.println("El tamanio del array es de "+TamanioArray);
        System.out.println(nombres.get(2));
        for(int i=nombres.size()-1;i>=0;i--){
            System.out.println(nombres.get(i));
        }
    }
    
}
