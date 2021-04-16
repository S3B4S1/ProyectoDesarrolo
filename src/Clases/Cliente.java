package Clases;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;



@Entity
public class Cliente  extends Persona implements Serializable{
    @Column(nullable = false)
    private Long telefono;
    @Column(nullable = false)
    private String correo;

    public Cliente() {
    }

    public Cliente(long identificacion, String nombre, String apellido, long telefono, String correo) throws Exception {
        super(identificacion, nombre, apellido);
        String strTelefono = Long.toString(telefono);
        if (!(strTelefono.length() == 10)) {
            throw new Exception("El numero telefonico de la persona debe contener 10 digitos");
        }
        
        this.telefono = telefono;
        this.correo = correo;
    }

    public Long getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
