public class Degustacion {
    private Persona persona;
    private Plato plato;
    private Restaurante restaurante;
    private boolean leGusta;

    public Degustacion(Persona persona, Plato plato, Restaurante restaurante, boolean leGusta) {
        this.persona = persona;
        this.plato = plato;
        this.restaurante = restaurante;
        this.leGusta = leGusta;
    }

    public Plato getPlato() {
        return plato;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public boolean isLeGusta() {
        return leGusta;
    }
}