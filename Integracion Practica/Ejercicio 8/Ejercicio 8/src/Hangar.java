public class Hangar {
    private int numero;
    private int capacidad;
    private String ubicacion;

    public Hangar(int numero, int capacidad, String ubicacion) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
    }

    public int getNumero() {
        return numero;
    }
}