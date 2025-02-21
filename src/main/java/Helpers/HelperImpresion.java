/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Persona;

/**
 *
 * @author Santiago Lopez
 */
public class HelperImpresion {
    
    public static void ImprimirPersona(Persona objPersona)
    {
         System.out.println("El nombre de la persona es"+"\t"+objPersona.getNombre());
        System.out.println("El apellido de la persona es"+"\t"+objPersona.getApellido());
        System.out.println("La cedula de la persona es"+"\t"+objPersona.getCedula());
        System.out.println("La direccion de la persona es"+"\t"+objPersona.getDireccion());
        System.out.println("El computador tiene marca"+"\t"+objPersona.getObjComputador().getMarca());
        System.out.println("El computador tiene serial"+"\t"+objPersona.getObjComputador().getSerial());
        System.out.println("El computador tiene tamaño"+"\t"+objPersona.getObjComputador().getTamaño());
        System.out.println("El computador tiene color"+"\t"+objPersona.getObjComputador().getColor());
    }
    
}
