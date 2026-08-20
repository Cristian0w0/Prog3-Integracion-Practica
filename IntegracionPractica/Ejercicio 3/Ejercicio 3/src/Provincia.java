import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public float calcularPorcentajeCiudadesDeficit() {
        if (ciudades.isEmpty()) {
            return 0;
        }

        int ciudadesFiltradas = 0;
        int ciudadesConDeficit = 0;

        for (Ciudad ciudad : ciudades) {
            if (ciudad.getCantidadHabitantes() > 100000) {
                ciudadesFiltradas++;
                if (ciudad.tieneDeficit()) {
                    ciudadesConDeficit++;
                }
            }
        }

        if (ciudadesFiltradas == 0) {
            return 0;
        }

        return ((float) ciudadesConDeficit / ciudadesFiltradas) * 100;
    }
}
