/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_java3;

/**
 *
 * @author JOSEPH
 */
public class Nieta extends Hija{
    
    private String musica;

    public Nieta(String nombre, int edad, String carrera, String musica) {
        super(nombre, edad, carrera);
        this.musica=musica;
    }


    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }
    

    @Override
    protected String verMensaje(){
        return "Mensaje de clase Nieta";
    }
    
}

    

