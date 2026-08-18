import java.util.ArrayList;
import java.util.List;

public class Comisario {
    private String nombre;
    private List<Evento> eventos;

    public Comisario(String nombre) {
        this.nombre = nombre;
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        this.eventos.add(evento);
    }

    public String getNombre() {
        return nombre;
    }
}