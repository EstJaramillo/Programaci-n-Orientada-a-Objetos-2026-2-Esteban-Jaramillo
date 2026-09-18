/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grupo13_ejercicioresueltono14;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Grupo3_EjercicioResueltoNo14 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double Numero;
        double NumeroCuadrado,NumeroCubo;
        
        System.out.print("Ingrese el numero: ");        
        Numero = scanner.nextDouble();
        
        NumeroCuadrado = Calculo.Cuadrado(Numero);
        NumeroCubo = Calculo.Cubo(Numero);
        
        System.out.println("El numero al cuadrado es: "+ NumeroCuadrado);
        System.out.println("El numero al cubo es: "+ NumeroCubo);
        
    }
}
