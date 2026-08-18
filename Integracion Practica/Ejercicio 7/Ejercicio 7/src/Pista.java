public class Pista {
    private int numeroCorrelativo;
    private float longitudKm;
    private String nivelDificultad;

    public Pista(int numeroCorrelativo, float longitudKm, String nivelDificultad) {
        this.numeroCorrelativo = numeroCorrelativo;
        this.longitudKm = longitudKm;
        this.nivelDificultad = nivelDificultad;
    }

    public int getNumeroCorrelativo() {
        return numeroCorrelativo;
    }
}