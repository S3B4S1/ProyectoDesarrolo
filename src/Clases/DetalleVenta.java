package Clases;

public class DetalleVenta {

    private int cantidad;
    private float costoTotal;
    private Producto producto;

    public DetalleVenta(int cantidad, float costoTotal, Producto producto) {
        this.cantidad = cantidad;
        this.costoTotal = costoTotal;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getCostoTotal() {
        return costoTotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
