/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grupo3_ejercicioresueltono5;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class Grupo3_EjercicioResueltoNo5 {

    public static void main(String[] args) {
        double suma, x, y;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de X:");
        x = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de Suma:");
        suma = scanner.nextDouble();
        suma = Calculos.Op1(suma, x);
        
        System.out.print("Ingrese el valor de Y:");
        y = scanner.nextDouble();
        
        x = Calculos.Op2(x, y);
        suma = Calculos.Op3(suma, x, y);
    System.out.print("EL VALOR DE LA SUMA ES:" + suma);
    }
}
