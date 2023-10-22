package _p112_ControlVentas;

public abstract class AbstractaVentas {
    private String Articulo;
    private double Cantidad;
    private double Precio;

    public AbstractaVentas(String Articulo, double Cantidad, double Precio) {
        this.Articulo = Articulo;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public abstract double getTotalVenta();

    @Override
    public String toString() {
        return "Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + "]";
    }
}