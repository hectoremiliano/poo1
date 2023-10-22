package _p112_ControlVentas;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String Nombre;
    private String Domicilio;
    private String Correo;
    private List<AbstractaVentas> Ventas;

    public Cliente(String Nombre, String Domicilio, String Correo) {
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Correo = Correo;
        this.Ventas = new ArrayList<>();
    }

    public void agregarVenta(AbstractaVentas venta) {
        Ventas.add(venta);
    }

    public double getTotal() {
        double total = 0;
        for (AbstractaVentas venta : Ventas) {
            total += venta.getTotalVenta();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cliente [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Correo=" + Correo + ", Ventas=" + Ventas.size() + ", Total=" + getTotal() + "]";
    }

    public List<AbstractaVentas> getVentas() {
        return Ventas;
    }
}