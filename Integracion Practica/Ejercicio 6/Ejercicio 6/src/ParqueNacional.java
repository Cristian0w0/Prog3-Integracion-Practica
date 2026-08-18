import java.util.ArrayList;
import java.util.List;

public class ParqueNacional {
    private String nombre;
    private List<Area> areas;
    private List<Entrada> entradas;
    private List<Personal> personal;

    public ParqueNacional(String nombre) {
        this.nombre = nombre;
        this.areas = new ArrayList<>();
        this.entradas = new ArrayList<>();
        this.personal = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarArea(Area area) {
        this.areas.add(area);
    }

    public void agregarEntrada(Entrada entrada) {
        this.entradas.add(entrada);
    }

    public void contratarPersonal(Personal persona) {
        this.personal.add(persona);
    }
}