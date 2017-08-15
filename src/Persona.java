/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingles
 */

import javax.swing.JOptionPane;

public class Persona {
    
    
    public String nombre;
    public String apellido;
    public int edad;
    
    public static void escribir(){
        System.out.println("probando funcion");
        
         JOptionPane.showMessageDialog(null,"Probando funcion");
    }
    
    public static void correr(){
        System.out.println("Estoy corriendo");
    }
    
public static void main (String[]args){
    System.out.println("hola");
    
    Persona persona1 = new Persona();
    persona1.nombre="Miguel";
    persona1.apellido="Nefle";
    persona1.edad=22;
    
     System.out.println(persona1.nombre);
    
    Persona persona2 = new Persona();
    persona2.nombre="Pedro";
    persona2.apellido="Ruiz";
    persona2.edad=15;
    System.out.println(persona2.nombre+" " + persona2.apellido);
    
    escribir();
    correr();
    
    if(persona1.edad<18){
        correr();
    }
}    
}
