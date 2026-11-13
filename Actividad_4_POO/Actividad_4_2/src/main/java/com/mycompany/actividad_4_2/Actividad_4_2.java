/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_4_2;

import java.util.*;

/**
 *
 * @author User
 */
public class Actividad_4_2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del Vendedor: ");
        String n = teclado.next();
        System.out.println("Apellidos del Vendedor: ");
        String a = teclado.next();
        Vendedor vendedor = new Vendedor(n,a);
        System.out.println("Edad del Vendedor: ");
        int e = teclado.nextInt();
        vendedor.VerificarEdad(e);
        vendedor.Imprimir();
    }
}
