public class TipoAvion {
    private String modelo;
    private int capacidad;
    private float peso;

    public TipoAvion(String modelo, int capacidad, float peso) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public String getModelo() {
        return modelo;
    }
}
