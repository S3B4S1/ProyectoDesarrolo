package Clases;

public class Consumo {

    private int cantidad;
    private Servicio servicio;
    private Producto producto;

    public Consumo(int cantidad, Servicio servicio, Producto producto) {
        this.cantidad = cantidad;
        this.servicio = servicio;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
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

}
