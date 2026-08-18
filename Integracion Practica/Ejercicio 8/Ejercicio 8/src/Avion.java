import java.util.ArrayList;
import java.util.List;

public class Avion {
    private String matricula;
    private TipoAvion tipo;
    private Hangar hangar;
    private List<Propietario> propietarios;
    private List<ServicioMantenimiento> historialMantenimiento;

    public Avion(String matricula, TipoAvion tipo, Hangar hangar) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.hangar = hangar;
        this.propietarios = new ArrayList<>();
        this.historialMantenimiento = new ArrayList<>();
    }

    public void agregarPropietario(Propietario propietario) {
        this.propietarios.add(propietario);
    }

    public void agregarServicio(ServicioMantenimiento servicio) {
        this.historialMantenimiento.add(servicio);
    }

    public String getMatricula() {
        return matricula;
    }
}