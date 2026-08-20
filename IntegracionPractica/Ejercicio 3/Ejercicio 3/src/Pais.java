import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private List<Provincia> provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }
}