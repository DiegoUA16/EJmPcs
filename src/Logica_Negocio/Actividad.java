package Logica_Negocio;

/**
 *
 * @author 1002821333
 */
public class Actividad {

    String nombre, descripcion, id;

    public Actividad(String nombre, String descripcion, String id, Solicitud objSolicitud) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
    }

    public Actividad(String nombre, String descripcion, String id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
