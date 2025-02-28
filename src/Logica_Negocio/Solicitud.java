package Logica_Negocio;
/**
 *
 * @author 1002821333
 */
public class Solicitud {
    String solicitante, codigo, cedula;
    public Actividad objActividad;

    public Solicitud(String solicitante, String codigo, String cedula, Actividad objActividad) {
        this.solicitante = solicitante;
        this.codigo = codigo;
        this.cedula = cedula;
        
        this.objActividad = objActividad;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Actividad getObjActividad() {
        return objActividad;
    }

    public void setObjActividad(Actividad objActividad) {
        this.objActividad = objActividad;
    }

    
}
