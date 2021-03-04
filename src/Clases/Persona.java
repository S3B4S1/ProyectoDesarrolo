package Clases;

public class Persona {
    
    public static enum EstaDisp{
        Si, No
    }

    private long identificacion;
    private String nombre;
    private String apellido;
    private EstaDisp estaDisp;
    

    public Persona(long identificacion, String nombre, String apellido) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
      
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public EstaDisp getEstaDisp() {
        return estaDisp;
    }

    public void setEstaDisp(EstaDisp estaDisp) {
        this.estaDisp = estaDisp;
    }

    @Override
    public String toString() {
        return identificacion + "  " + nombre + "  " + apellido;
    }
    
    
}
