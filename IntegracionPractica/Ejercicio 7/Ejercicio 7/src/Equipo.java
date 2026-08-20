import java.util.ArrayList;
import java.util.List;

public class Equipo extends Participante {
    private String codigo;
    private String entrenador;
    private List<Esquiador> esquiadores;

    public Equipo(String codigo, String entrenador) {
        this.codigo = codigo;
        this.entrenador = entrenador;
        this.esquiadores = new ArrayList<>();
    }

    public void agregarEsquiador(Esquiador esquiador) {
        this.esquiadores.add(esquiador);
    }

    @Override
    public String getIdentificador() {
        return codigo;
    }
}