/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_4_4;

import java.util.*;
/**
 *
 * @author User
 */
public class EquipoMaraton {
    
    String NombreEquipo;
    String Universidad;
    String LenguajeProgramacion;
    Programador[] Programadores;
    int TamañoEquipo;
    
    EquipoMaraton(String NE, String U, String LP) {
        this.NombreEquipo = NE;
        this.Universidad = U;
        this.LenguajeProgramacion = LP;
        this.Programadores = this.Programadores;
        this.TamañoEquipo = 0;
        Programadores = new Programador[3];
    }
    
    boolean EstaLleno() {
        return TamañoEquipo == Programadores.length;
    }
    
    void añadir(Programador P) throws Exception {
        if (EstaLleno()) {
            throw new Exception ("El equipo esta completo. No se pudo agregar programador");
        }
        
        Programadores[TamañoEquipo] = P;
        TamañoEquipo++;
        
    }
    
    static void ValidarCampo(String Campo)throws Exception {
        for (int j = 0; j < Campo.length();j++) {
            char c = Campo.charAt(j);
            if (Character.isDigit(c)) {
                throw new Exception("El nombre no me puede tener digitos");
            }
        }
    }
    
}
