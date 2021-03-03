package Clases;

import java.time.LocalDateTime;

public class Venta {

    private DetalleVenta detalleVenta;
    private Cliente cliente;
    private LocalDateTime fecha;

    public Venta(DetalleVenta detalleVenta, Cliente cliente, LocalDateTime fecha) {
        this.detalleVenta = detalleVenta;
        this.cliente = cliente;
        this.fecha = LocalDateTime.now();
    }

    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setDetalleVenta(DetalleVenta detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

}
