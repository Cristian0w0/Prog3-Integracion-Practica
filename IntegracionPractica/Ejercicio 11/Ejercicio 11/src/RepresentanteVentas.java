import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class RepresentanteVentas {
    private String nombre;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;
    private String cuitCuil;
    private Date fechaIncorporacion;
    private List<Cliente> carteraClientes;
    private List<TicketVenta> ticketsVenta;

    public RepresentanteVentas(String nombre, String direccion, String telefono, Date fechaNacimiento, String cuitCuil, Date fechaIncorporacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuitCuil = cuitCuil;
        this.fechaIncorporacion = fechaIncorporacion;
        this.carteraClientes = new ArrayList<>();
        this.ticketsVenta = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCliente(Cliente cliente) {
        this.carteraClientes.add(cliente);
    }

    public void agregarTicket(TicketVenta ticket) {
        this.ticketsVenta.add(ticket);
    }

    public List<TicketVenta> getTicketsVenta() {
        return ticketsVenta;
    }
}