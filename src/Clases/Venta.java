package Clases;

import java.time.LocalDateTime;

public class Venta {

    private DetalleVenta detalleVenta;
    private Persona cliente;
    private LocalDateTime fecha;

    public Venta(DetalleVenta detalleVenta, Persona cliente, LocalDateTime fecha) {
        this.detalleVenta = detalleVenta;
        this.cliente = cliente;
        this.fecha = LocalDateTime.now();
    }

    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    public Persona getCliente() {
        return cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setDetalleVenta(DetalleVenta detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
