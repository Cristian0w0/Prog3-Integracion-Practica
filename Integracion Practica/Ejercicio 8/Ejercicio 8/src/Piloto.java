import java.util.ArrayList;
import java.util.List;

public class Piloto extends Persona {
    private String numeroLicencia;
    private String restricciones;
    private List<TipoAvion> tiposAutorizados;

    public Piloto(String seguridadSocial, String nombre, String direccion, String telefono, String numeroLicencia, String restricciones) {
        super(seguridadSocial, nombre, direccion, telefono);
        this.numeroLicencia = numeroLicencia;
        this.restricciones = restricciones;
        this.tiposAutorizados = new ArrayList<>();
    }

    public void agregarAutorizacion(TipoAvion tipo) {
        this.tiposAutorizados.add(tipo);
    }
}