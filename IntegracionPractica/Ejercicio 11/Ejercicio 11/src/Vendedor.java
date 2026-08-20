import java.util.Date;

public class Vendedor extends RepresentanteVentas {
    public Vendedor(String nombre, String direccion, String telefono, Date fechaNacimiento, String cuitCuil, Date fechaIncorporacion) {
        super(nombre, direccion, telefono, fechaNacimiento, cuitCuil, fechaIncorporacion);
    }
}