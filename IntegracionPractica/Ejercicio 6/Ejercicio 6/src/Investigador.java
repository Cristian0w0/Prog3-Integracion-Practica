import java.util.ArrayList;
import java.util.List;

public class Investigador extends Cargo {
    private String titulacion;
    private List<Proyecto> proyectos;

    public Investigador(String titulacion) {
        super("Investigador");
        this.titulacion = titulacion;
        this.proyectos = new ArrayList<>();
    }

    public void agregarProyecto(Proyecto proyecto) {
        this.proyectos.add(proyecto);
    }
}