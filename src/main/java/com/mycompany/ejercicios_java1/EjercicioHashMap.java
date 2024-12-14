/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_java1;

import java.util.HashMap;

/**
 *
 * @author JOSEPH
 */
public class EjercicioHashMap {
    public static void main(String[] args) {
        HashMap<String, String> paisesCapitales = new HashMap<>();
        paisesCapitales.put("Peru","Lima");
        paisesCapitales.put("Peru","Lima");
        paisesCapitales.put("Peru","Lima");
        
        String pais = "Peru";
        String capital=BuscarCapital(paisesCapitales,pais);
        
        if(capital!=null){
            System.out.println("La capital de "+pais+" es "+capital);
            
        }else{
            System.out.println("Pais no encontrado");
        }
    }
    
    public static String BuscarCapital(HashMap<String, String> hMap, String pais) {
        return hMap.get(pais);
    }
    
}
