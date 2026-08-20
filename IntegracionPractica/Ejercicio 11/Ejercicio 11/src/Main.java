import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Empresa cosmeticaNatural = new Empresa();

        Producto cremaDia = new Producto("Crema de Dia", 15000.0f);
        cosmeticaNatural.agregarProducto(cremaDia);

        Lider liderEquipo = new Lider("Ana Martinez", "Calle 1", "111", new Date(), "27-11111111-4", new Date(), new Date());
        Vendedor vendedor1 = new Vendedor("Pedro Lopez", "Calle 2", "222", new Date(), "20-22222222-4", new Date());

        liderEquipo.agregarVendedorAEquipo(vendedor1);
        cosmeticaNatural.agregarRepresentante(liderEquipo);
        cosmeticaNatural.agregarRepresentante(vendedor1);

        Cliente clienteNuevo = new Cliente("Marta Suarez", "Calle 3", "333", new Date(), new Date());
        vendedor1.agregarCliente(clienteNuevo);

        TicketVenta venta1 = new TicketVenta(new Date(), cremaDia, cremaDia.getPrecio());
        venta1.setCliente(clienteNuevo);
        vendedor1.agregarTicket(venta1);

        System.out.println("Representante principal: " + liderEquipo.getNombre());
        System.out.println("Vendedor a cargo: " + vendedor1.getNombre());
        System.out.println("Producto vendido: " + venta1.getProducto().getNombre());
    }
}