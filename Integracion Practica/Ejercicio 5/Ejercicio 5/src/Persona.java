import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private List<Restaurante> restaurantesHabituales;
    private List<Restaurante> restaurantesOcasionales;
    private List<Degustacion> degustaciones;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.restaurantesHabituales = new ArrayList<>();
        this.restaurantesOcasionales = new ArrayList<>();
        this.degustaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarRestauranteHabitual(Restaurante restaurante) {
        this.restaurantesHabituales.add(restaurante);
    }

    public void agregarRestauranteOcasional(Restaurante restaurante) {
        this.restaurantesOcasionales.add(restaurante);
    }

    public void registrarDegustacion(Plato plato, Restaurante restaurante, boolean leGusta) {
        Degustacion degustacion = new Degustacion(this, plato, restaurante, leGusta);
        this.degustaciones.add(degustacion);
    }

    public List<Degustacion> getDegustaciones() {
        return degustaciones;
    }
}