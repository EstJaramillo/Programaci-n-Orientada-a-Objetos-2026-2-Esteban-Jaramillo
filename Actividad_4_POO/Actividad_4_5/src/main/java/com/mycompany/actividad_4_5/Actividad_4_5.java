/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_4_5;

import java.io.*;
/**
 *
 * @author User
 */
public class Actividad_4_5 {

    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
        FileInputStream archivo;
        InputStreamReader conversor;
        BufferedReader filtro;
        String línea;
        try {
            archivo = new FileInputStream(nombreArchivo);
            conversor = new InputStreamReader(archivo);
            filtro = new BufferedReader(conversor);
            línea = filtro.readLine();
            while (línea != null) {
                System.out.println(línea);
                línea = filtro.readLine();
            }
            filtro.close();
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo.");
        }
    }
}
