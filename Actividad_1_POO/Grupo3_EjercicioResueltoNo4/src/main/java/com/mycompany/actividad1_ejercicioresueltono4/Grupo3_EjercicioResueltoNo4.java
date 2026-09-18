/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.actividad1_ejercicioresueltono4;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class Grupo3_EjercicioResueltoNo4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double edjuan, edalber, edana, edmama;

        System.out.print("Ingrese la edad de Juan: ");
        edjuan = scanner.nextDouble();

        edalber = Edades.calcular_edalber(edjuan);
        edana = Edades.calcular_edana(edjuan);
        edmama = Edades.calcular_edmama(edjuan, edalber, edana);

        System.out.println("la edad de la mama es: " + edmama);
        System.out.println("la edad de juan es: " + edjuan);
        System.out.println("la edad de alber es: " + edalber);
        System.out.println("la edad de ana es: " + edana);

        scanner.close();
    }
}