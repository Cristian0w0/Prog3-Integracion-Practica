import java.util.Date;

public class TicketVenta {
    private Date fecha;
    private Producto producto;
    private float precio;
    private Cliente cliente;

    public TicketVenta(Date fecha, Producto producto, float precio) {
        this.fecha = fecha;
        this.producto = producto;
        this.precio = precio;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public float getPrecio() {
        return precio;
    }
}