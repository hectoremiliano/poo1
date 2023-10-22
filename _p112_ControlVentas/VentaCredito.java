package _p112_ControlVentas;

public class VentaCredito extends AbstractaVentas {
    private double Meses;
    private double Interes;

    public VentaCredito(String Articulo, double Cantidad, double Precio, double Meses, double Interes) {
        super(Articulo, Cantidad, Precio);
        this.Meses = Meses;
        this.Interes = Interes;
    }

    public double getMeses() {
        return Meses;
    }

    public double getInteres() {
        return Interes;
    }

    @Override
    public double getTotalVenta() {
        return (super.getCantidad() * super.getPrecio()) + ((super.getCantidad() * super.getPrecio()) * (Meses * Interes / 100));
    }

    @Override
    public String toString() {
        return "VentaCredito [" + super.toString() + ", Meses=" + Meses + ", Interes=" + Interes + "%, TotalVenta=" + getTotalVenta() + "]";
    }
}