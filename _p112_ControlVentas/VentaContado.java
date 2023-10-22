package _p112_ControlVentas;

public class VentaContado extends AbstractaVentas {
    private double Descuento;
    private String Regalo;

    public VentaContado(String Articulo, double Cantidad, double Precio, double Descuento, String Regalo) {
        super(Articulo, Cantidad, Precio);
        this.Descuento = Descuento;
        this.Regalo = Regalo;
    }

    public double getDescuento() {
        return Descuento;
    }

    public String getRegalo() {
        return Regalo;
    }

    @Override
    public double getTotalVenta() {
        return (super.getCantidad() * super.getPrecio()) - ((super.getCantidad() * super.getPrecio()) * (Descuento / 100));
    }

    @Override
    public String toString() {
        return "VentaContado [" + super.toString() + ", Descuento=" + Descuento + "%, Regalo=" + Regalo + ", Total=" + getTotalVenta() + "]";
    }
}