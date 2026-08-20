import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Lider extends RepresentanteVentas {
    private Date fechaPromocion;
    private List<Vendedor> equipoVendedores;

    public Lider(String nombre, String direccion, String telefono, Date fechaNacimiento, String cuitCuil, Date fechaIncorporacion, Date fechaPromocion) {
        super(nombre, direccion, telefono, fechaNacimiento, cuitCuil, fechaIncorporacion);
        this.fechaPromocion = fechaPromocion;
        this.equipoVendedores = new ArrayList<>();
    }

    public void agregarVendedorAEquipo(Vendedor vendedor) {
        this.equipoVendedores.add(vendedor);
    }

    public List<Vendedor> getEquipoVendedores() {
        return equipoVendedores;
    }
}