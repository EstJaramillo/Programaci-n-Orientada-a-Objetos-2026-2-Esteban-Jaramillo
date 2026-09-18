/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grupo3_ejercicioresueltono12;

/**
 *
 * @author User
 */
public class Grupo3_EjercicioResueltoNo12 {

    public static void main(String[] args) {
        double HorasTrabajadas,PrecioHora,PorcentajeRetencion;
        double SalarioNeto,Retencion,SalarioBruto;
        
        HorasTrabajadas = 48;
        PrecioHora = 5000;
        PorcentajeRetencion = 12.5/100;
        
        SalarioBruto = Nomina.CalSalB(HorasTrabajadas, PrecioHora);
        Retencion = Nomina.Reten(SalarioBruto, PorcentajeRetencion);
        SalarioNeto = Nomina.CalSalN(SalarioBruto, Retencion);
        
        System.out.println("El salario bruto es: "+SalarioBruto);
        System.out.println("La retencion en la fuente es: "+Retencion);
        System.out.println("El salario neto es: "+SalarioNeto);
    }
}
