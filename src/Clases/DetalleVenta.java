package Clases;

public class DetalleVenta {

    private int cantidad;
    private float costoTotal;
    private Producto producto;

    public DetalleVenta(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.costoTotal = cantidad * producto.getCosto();
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

    @Override
    public String toString() {
        return producto + "  Cantidad: " + cantidad + "  CostoTotal: " + costoTotal;
    }
}
