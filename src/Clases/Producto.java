package Clases;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto implements Serializable{
    @Id()
    @Column(nullable = false)
    private int codigo;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private float costo;

    public Producto(int codigo, String nombre, float costo) throws Exception {
        if (codigo <= 0) {
            throw new Exception("El codigo del producto no puede ser menor o igual a cero");
        }
        if (nombre == null || "".equals(nombre.trim())) {
            throw new Exception("El nombre del producto no debe estar vacio ni ser solo espacios");
        }
        if (costo <= 0) {
            throw new Exception("El costo del producto no debe ser menor o igual a cero");
        }
        
        this.codigo = codigo;
        this.nombre = nombre;
        this.costo = costo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return codigo + "  " + nombre + "  costo : " + costo;
    }
}
