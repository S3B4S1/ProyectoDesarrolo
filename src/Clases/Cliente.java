package Clases;

public class Cliente extends Persona {

    private long telefono;
    private String correo;

    public Cliente(long telefono, String correo, long identificacion, String nombre, String apellido) {
        super(identificacion, nombre, apellido);
        this.telefono = telefono;
        this.correo = correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
