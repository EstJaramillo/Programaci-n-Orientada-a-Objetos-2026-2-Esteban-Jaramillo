/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_4_3;

import java.util.*;

/**
 *
 * @author User
 */
public class Actividad_4_3 {

    public static void main(String[] args) {
        System.out.println("Valor numerico:");
        Scanner Teclado = new Scanner(System.in);
        double valor = Teclado.nextDouble();
        CalculosNumericos.CalcularAlgoritmoNeperiano(valor);
        CalculosNumericos.CalcularRaiz(valor);
    }
}
