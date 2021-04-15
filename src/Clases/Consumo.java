package Clases;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consumo implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;
    @Column(nullable = false)
    private int cantidad;
    @Column(nullable = false)
    private Servicio servicio;
    @Column(nullable = false)
    private Producto producto;
    @Column(nullable = false)
    private int costoTotalCons;

    public Consumo() {
    }
    
    public Consumo(int cantidad, Servicio servicio, Producto producto) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("La cantidad del consumo no puede ser menor o igual a cero");
        }
        if (servicio == null) {
            throw new Exception("El servicio del consumo no debe estar vacio");
        }
        if (producto == null) {
            throw new Exception("El producto del consumo no debe estar vacio");
        }

        this.cantidad = cantidad;
        this.servicio = servicio;
        this.producto = producto;
        this.costoTotalCons = (int) (cantidad * producto.getCosto());
    }

    public int getCantidad() {
        return cantidad;
    }

    public long getPk() {
        return pk;
    }

    public void setPk(long pk) {
        this.pk = pk;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCostoTotalCons() {
        return costoTotalCons;
    }

    public void setCostoTotalCons(int costoTotalCons) {
        this.costoTotalCons = costoTotalCons;
    }

    @Override
    public String toString() {
        return producto + "  Cantidad : " + cantidad;
    }
}
