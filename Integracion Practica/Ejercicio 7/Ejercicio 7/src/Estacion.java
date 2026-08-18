import java.util.ArrayList;
import java.util.List;

public class Estacion {
    private String codigo;
    private String nombre;
    private List<Pista> pistas;

    public Estacion(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pistas = new ArrayList<>();
    }

    public void agregarPista(Pista pista) {
        this.pistas.add(pista);
    }

    public String getNombre() {
        return nombre;
    }
}