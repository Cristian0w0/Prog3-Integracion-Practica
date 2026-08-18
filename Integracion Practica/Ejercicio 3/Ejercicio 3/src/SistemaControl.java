import java.util.ArrayList;
import java.util.List;

public class SistemaControl {
    private Pais pais;

    public SistemaControl(Pais pais) {
        this.pais = pais;
    }

    public List<Ciudad> obtenerCiudadesConDeficit() {
        List<Ciudad> ciudadesConDeficit = new ArrayList<>();
        for (Provincia provincia : pais.getProvincias()) {
            for (Ciudad ciudad : provincia.getCiudades()) {
                if (ciudad.getCantidadHabitantes() > 100000 && ciudad.tieneDeficit()) {
                    ciudadesConDeficit.add(ciudad);
                }
            }
        }
        return ciudadesConDeficit;
    }

    public List<Provincia> obtenerProvinciasConDeficit() {
        List<Provincia> provinciasConDeficit = new ArrayList<>();
        for (Provincia provincia : pais.getProvincias()) {
            if (provincia.calcularPorcentajeCiudadesDeficit() > 50.0f) {
                provinciasConDeficit.add(provincia);
            }
        }
        return provinciasConDeficit;
    }
}