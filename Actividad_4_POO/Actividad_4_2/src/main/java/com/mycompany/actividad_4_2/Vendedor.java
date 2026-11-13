/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad_4_2;

/**
 *
 * @author User
 */
public class Vendedor {
    String Nombre;
    String Apellidos;
    int Edad;
    
    Vendedor(String Nombre, String Apellidos) {
    this.Nombre = Nombre;
    this.Apellidos = Apellidos;
    }
    
    void Imprimir() {
        System.out.println("Nombre del vendedor: " + Nombre);
        System.out.println("Apellidos del vendedor: " + Apellidos);
        System.out.println("Edad del vendedor: " + Edad);
    }
    
    void VerificarEdad(int Edad){
        if (Edad < 18) {
        throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años");
        } if (Edad >= 0 && Edad < 120) {
            this.Edad = Edad;                    
        } else {
            throw new IllegalArgumentException("La edad no puede ser negativa ni mayor a 120");
        }
        
    }
}
