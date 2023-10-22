package _p112_ControlVentas;

public class App {
    public static void main(String[] args) {
        AbstractaVentas venta1 = new VentaContado("Martillo", 10, 60.50, 10, "Sacabrocados");
        AbstractaVentas venta2 = new VentaCredito("Pala", 2, 1170.55, 3, 10);
        AbstractaVentas venta3 = new VentaCredito("Clavo", 2.5, 160.34, 2, 20);
        AbstractaVentas venta4 = new VentaCredito("Cinta de Aislar", 5, 71.34, 6, 20);
        AbstractaVentas venta5 = new VentaContado("Pinzas", 10, 650.33, 20, "Taladro");
        AbstractaVentas venta6 = new VentaContado("Thiner", 50, 65.00, 10, "Aerosol");

        Cliente cliente1 = new Cliente("Felipe Calderon", "Las Lomas 123", "calde@msn.com");
        Cliente cliente2 = new Cliente("Enrique Peña", "5 de Mayo 321", "quique@gmail.com");
        Cliente cliente3 = new Cliente("Andres Lopez", "Palacio Nacional 321", "peje@yahoo.com");
        Cliente cliente4 = new Cliente("Xochitl Gelatinas", "Danone 123", "xochitl@presidencia.gob.mx");

        cliente1.agregarVenta(venta1);
        cliente1.agregarVenta(venta2);
        cliente2.agregarVenta(venta3);
        cliente2.agregarVenta(venta4);
        cliente2.agregarVenta(venta5);
        cliente3.agregarVenta(venta6);

        Tienda tienda = new Tienda("Av. Luis Moya 345", "Carlos Castaneda", "Mi Tiendita");
        tienda.agregarCliente(cliente1);
        tienda.agregarCliente(cliente2);
        tienda.agregarCliente(cliente3);
        tienda.agregarCliente(cliente4);

        tienda.reporte();
    }
}