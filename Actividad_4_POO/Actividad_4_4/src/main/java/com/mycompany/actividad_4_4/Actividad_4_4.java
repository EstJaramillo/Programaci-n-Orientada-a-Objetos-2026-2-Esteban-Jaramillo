/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_4_4;

import java.util.*;
/**
 *
 * @author User
 */
public class Actividad_4_4 {

    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre del equipo: ");
        String Nombre = teclado.next();
        System.out.println("Universidad: ");
        String Universidad = teclado.next();
        System.out.println("Lenguaje de programacion: ");
        String Lenguaje = teclado.next();
        EquipoMaraton equipo = new EquipoMaraton(Nombre,Universidad,Lenguaje);
        System.out.println("Datos intenrgantes del equipo");
        String nombreProgramador;
        String apellidosProgramador;
        for (int  i=0; i < 3; i++) {
            System.out.println("Nombre del integrante: ");
            nombreProgramador = teclado.next();
            EquipoMaraton.ValidarCampo(nombreProgramador);
            System.out.println("Apellidos del integrante: ");
            apellidosProgramador = teclado.next();
            EquipoMaraton.ValidarCampo(apellidosProgramador);
            Programador programador = new Programador(nombreProgramador, apellidosProgramador);
            equipo.añadir(programador);
        }
        
    }
}
