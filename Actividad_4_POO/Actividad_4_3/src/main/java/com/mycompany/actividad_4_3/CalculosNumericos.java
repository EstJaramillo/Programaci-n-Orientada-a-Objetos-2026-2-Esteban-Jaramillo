/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_4_3;

import java.util.*;
/**
 *
 * @author User
 */
public class CalculosNumericos {
    
    static void CalcularAlgoritmoNeperiano(double valor){
        try {
            if (valor < 0) {
                throw new ArithmeticException("El numero debe ser positivo");
            }
            
            double resultado = Math.log(valor);
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e){
        
            System.out.println("El valor debe ser un numero positivo para calcular el logaritmo");
            
        } catch (InputMismatchException e){
            System.out.println("El valor debe ser numerico para calcular el logaritmo");
        }            
        
    }
    
    static void CalcularRaiz(double valor) {
        try {
            if (valor < 0) {
                throw new ArithmeticException("El valor debe ser un numero positivo");
            }
            double resultado =Math.sqrt(valor);
            System.out.println("Resultado: " + resultado);
        
        } catch (ArithmeticException e) {
            System.out.println("El valor debe ser un numero positivo para calcular la raiz cuadrada");
        } catch (InputMismatchException e) {
            System.out.println("El valor debe ser numerico para calcular la raiz cuadrada");
        }
    }
    
}
