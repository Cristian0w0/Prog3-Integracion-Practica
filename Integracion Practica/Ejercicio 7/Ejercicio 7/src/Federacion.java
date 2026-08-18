import java.util.ArrayList;
import java.util.List;

public class Federacion {
    private String nombre;
    private int numeroFederados;
    private List<Estacion> estacionesAdministradas;

    public Federacion(String nombre, int numeroFederados) {
        this.nombre = nombre;
        this.numeroFederados = numeroFederados;
        this.estacionesAdministradas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEstacion(Estacion estacion) {
        this.estacionesAdministradas.add(estacion);
    }
}