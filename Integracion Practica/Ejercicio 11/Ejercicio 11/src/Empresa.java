import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Producto> productos;
    private List<ReunionGeneral> reuniones;
    private List<RepresentanteVentas> representantes;

    public Empresa() {
        this.productos = new ArrayList<>();
        this.reuniones = new ArrayList<>();
        this.representantes = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void agregarReunion(ReunionGeneral reunion) {
        this.reuniones.add(reunion);
    }

    public void agregarRepresentante(RepresentanteVentas representante) {
        this.representantes.add(representante);
    }
}