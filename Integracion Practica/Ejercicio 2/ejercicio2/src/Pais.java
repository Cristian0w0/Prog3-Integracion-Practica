import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private Ciudad capital;
    private List<Provincia> provincias;
    private List<Pais> paisesLimitrofes;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
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

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void agregarProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }

    public List<Pais> getPaisesLimitrofes() {
        return paisesLimitrofes;
    }

    public void agregarPaisLimitrofe(Pais pais) {
        this.paisesLimitrofes.add(pais);
    }
}