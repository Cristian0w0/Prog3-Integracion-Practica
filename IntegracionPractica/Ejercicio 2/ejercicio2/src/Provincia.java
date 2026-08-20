import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private Ciudad capital;
    private List<Ciudad> ciudades;
    private List<Provincia> provinciasLimitrofes;
    private List<Pais> paisesLimitrofes;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
        this.provinciasLimitrofes = new ArrayList<>();
        this.paisesLimitrofes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCapital() {
        return capital;
    }

    public void setCapital(Ciudad capital) {
        this.capital = capital;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void agregarCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }

    public List<Provincia> getProvinciasLimitrofes() {
        return provinciasLimitrofes;
    }

    public void agregarProvinciaLimitrofe(Provincia provincia) {
        this.provinciasLimitrofes.add(provincia);
    }

    public List<Pais> getPaisesLimitrofes() {
        return paisesLimitrofes;
    }

    public void agregarPaisLimitrofe(Pais pais) {
        this.paisesLimitrofes.add(pais);
    }
}