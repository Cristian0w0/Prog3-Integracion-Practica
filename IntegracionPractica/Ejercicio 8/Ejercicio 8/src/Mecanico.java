import java.util.ArrayList;
import java.util.List;

public class Mecanico extends Persona {
    private float salario;
    private String turno;
    private List<TipoAvion> tiposAutorizados;

    public Mecanico(String seguridadSocial, String nombre, String direccion, String telefono, float salario, String turno) {
        super(seguridadSocial, nombre, direccion, telefono);
        this.salario = salario;
        this.turno = turno;
        this.tiposAutorizados = new ArrayList<>();
    }

    public void agregarAutorizacion(TipoAvion tipo) {
        this.tiposAutorizados.add(tipo);
    }
}