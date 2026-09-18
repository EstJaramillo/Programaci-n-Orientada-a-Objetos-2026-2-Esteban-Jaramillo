    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grupo3_ejercicioresueltono12;

/**
 *
 * @author User
 */
public class Nomina {
    public static double CalSalB(double Horas, double PHora) {
        double SalBruto = Horas * PHora;
        return SalBruto;
    }
    
    public static double Reten(double SalB, double RetenP) {
        double Reten = SalB*RetenP;
        return Reten;
    }
    
    public static double CalSalN(double SalBruto, double retencion) {
        double SalNeto = SalBruto - retencion;
        return SalNeto;
    }
}
