import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Exposicion {
    private String nombre;
    private Date fechaComienzo;
    private Date fechaFinalizacion;
    private List<ObjetoArte> objetosExhibidos;

    public Exposicion(String nombre, Date fechaComienzo, Date fechaFinalizacion) {
        this.nombre = nombre;
        this.fechaComienzo = fechaComienzo;
        this.fechaFinalizacion = fechaFinalizacion;
        this.objetosExhibidos = new ArrayList<>();
    }

    public void agregarObjeto(ObjetoArte objeto) {
        this.objetosExhibidos.add(objeto);
    }

    public String getNombre() {
        return nombre;
    }
}