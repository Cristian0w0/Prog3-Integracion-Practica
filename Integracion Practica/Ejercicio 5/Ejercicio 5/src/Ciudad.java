import java.util.ArrayList;
import java.util.List;

public class Ciudad {
    private String nombre;
    private List<Restaurante> restaurantes;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.restaurantes = new ArrayList<>();
    }

    public void agregarRestaurante(Restaurante restaurante) {
        this.restaurantes.add(restaurante);
    }
}
