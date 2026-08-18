import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
    private String nombre;
    private Date fecha;
    private int duracion;
    private int numeroParticipantes;
    private List<Comisario> comisarios;
    private List<Material> materiales;

    public Evento(String nombre, Date fecha, int duracion, int numeroParticipantes) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.numeroParticipantes = numeroParticipantes;
        this.comisarios = new ArrayList<>();
        this.materiales = new ArrayList<>();
    }

    public void agregarComisario(Comisario comisario) {
        this.comisarios.add(comisario);
    }

    public void agregarMaterial(Material material) {
        this.materiales.add(material);
    }

    public String getNombre() {
        return nombre;
    }
}