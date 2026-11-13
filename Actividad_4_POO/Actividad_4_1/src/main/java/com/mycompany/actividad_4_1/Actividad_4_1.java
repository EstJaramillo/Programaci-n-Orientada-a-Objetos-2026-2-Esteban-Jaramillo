/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_4_1;

/**
 *
 * @author User
 */
public class Actividad_4_1 {

    public static void main(String[] args) {
        try {
            System.out.println("Ingresando al primer try");
            double cociente = 10000/0; 
            System.out.println("Despues de la division"); 
        } catch (ArithmeticException e) {
            System.out.println("Division por cero");
        } finally {
            System.out.println("Ingresando al primer finally");
        }
        try {
            System.out.println("Ingresando al segundo try");
            Object objeto = null;
            objeto.toString();
            System.out.println("Imprimiendo objeto");
        } catch (ArithmeticException e) { 
            System.out.println("Division por cero");
        } catch (Exception e) { 
            System.out.println("Ocurrio una excepcion"); 
        } finally {          
            System.out.println("Ingresando al segundo finally");
}

    }
}
