
/*
 * Whe ask the user for their personal data 
 *and finally we show them all together on the screem.
 */
package com.mycompany.ejercicioedd2;
import java.util.Scanner;
/**
 *
 * @author Ricardo Santiago Tomé @RicardoSantom en github
 * @version 14/11/2020
 */
public class EjercicioEDD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;//cadena de caracteres que solicita entrada por teclado de nombre.
        String primerapellido;//cadena de caracters que solicita entrada por teclado de primer apellido.
        String segundoapellido;//cadena de caracters que solicita entrada por teclado de segundo apellido.
        
        System.out.println("Introduzca su nombre(seguido de un espacio): ");
        Scanner reader=new Scanner(System.in);
        nombre = reader.nextLine();
        
        System.out.println("Introduzca su primer apellido(seguido de un espacio): ");
        reader=new Scanner(System.in);
        primerapellido = reader.nextLine();
        
        System.out.println("Introduzca su segudo apellido: ");
        reader=new Scanner(System.in);
        segundoapellido = reader.nextLine();
        
        String nombreConcreto;//cadena de caracters que guarda juntas las tres variables anteriores.
        nombreConcreto=nombre+primerapellido+segundoapellido;
        
        System.out.println("Su nombre completo es: "+nombreConcreto);
    }
    
}
