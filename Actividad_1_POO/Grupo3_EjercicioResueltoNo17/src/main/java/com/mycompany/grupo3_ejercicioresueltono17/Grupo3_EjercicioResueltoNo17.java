/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grupo3_ejercicioresueltono17;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Grupo3_EjercicioResueltoNo17 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double Radio;
        double Area,Circunferencia;
        
        System.out.print("Ingrese el radio del circulo: ");        
        Radio = scanner.nextDouble();
        
        Area = Operaciones.CalArea(Radio);
        Circunferencia = Operaciones.CalCircunferencia(Radio);
        
        System.out.println("El area del cirvulo es: "+ Area);
        System.out.println("La longitud de la circunferencia del circulo es: "+ Circunferencia);
        
    }
}
