/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Solicitud;

/**
 *
 * @author 1002821333
 */
public class HelperImpresion {

    public static void ImprimirSolicitud(Solicitud objSolicitud) {
        System.out.println("\nEl nombre del solicitante es: " + "\t" + objSolicitud.getSolicitante());
        System.out.println("El codigo del solicitante es: " + "\t" + objSolicitud.getCodigo());
        System.out.println("La cedula del solicitante es: " + "\t" + objSolicitud.getCedula());

        System.out.println("\nNombre de la actividad:   " + "\t" + objSolicitud.getObjActividad().getNombre());
        System.out.println("El id de la actividad es:   " + "\t" + objSolicitud.getObjActividad().getId());
        System.out.println("Descripcion de la actividad:" + "\t" + objSolicitud.getObjActividad().getDescripcion());
    }
}
