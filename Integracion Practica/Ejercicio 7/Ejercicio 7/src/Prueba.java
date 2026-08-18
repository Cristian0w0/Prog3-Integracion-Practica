import java.util.ArrayList;
import java.util.List;

public class Prueba {
    private String nombre;
    private String tipo;
    private Estacion estacion;
    private List<Pista> pistasUsadas;

    public Prueba(String nombre, String tipo, Estacion estacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.estacion = estacion;
        this.pistasUsadas = new ArrayList<>();
    }

    public void agregarPista(Pista pista) {
        this.pistasUsadas.add(pista);
    }

    public String getNombre() {
        return nombre;
    }
}