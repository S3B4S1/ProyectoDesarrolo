package Clases;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Tecnico extends Persona implements Serializable{
    @Column(nullable = false)
    private boolean estado;

    public Tecnico() {
    }
   

  
    public Tecnico(long identificacion, String nombre, String apellido) throws Exception {
        super(identificacion, nombre, apellido);
        this.estado = true;

    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    

 

}
