package Clases;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
@Entity
public class Venta implements Serializable{
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pk;
    @OneToMany
    private ArrayList<DetalleVenta> detalleVentas = new ArrayList<>();
    @Column(nullable = false)
    private Persona cliente;
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    @Column(nullable = false)
    private int CostoVentaTotal = 0;

    public Venta() {
    }

    public Venta(Persona cliente) {
        this.cliente = cliente;
        this.fecha = Date.from(Instant.now());
    }

    public ArrayList<DetalleVenta> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(ArrayList<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCostoVentaTotal() {

        int a = 0;

        for (DetalleVenta dV : this.detalleVentas) {
            a += dV.getCostoTotal();
        }

        return CostoVentaTotal = a;
    }

    public void setCostoVentaTotal(int CostoVentaTotal) {
        this.CostoVentaTotal = CostoVentaTotal;
    }

    public void addDetalleVenta(DetalleVenta dV) {
        this.detalleVentas.add(dV);
    }
}
