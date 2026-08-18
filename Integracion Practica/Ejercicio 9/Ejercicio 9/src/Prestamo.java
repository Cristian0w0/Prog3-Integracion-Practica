import java.util.Date;

public class Prestamo extends EstadoPertenencia {
    private ColeccionExterna origen;
    private Date fechaRecepcion;
    private Date fechaDevolucion;

    public Prestamo(ColeccionExterna origen, Date fechaRecepcion, Date fechaDevolucion) {
        this.origen = origen;
        this.fechaRecepcion = fechaRecepcion;
        this.fechaDevolucion = fechaDevolucion;
    }

    public ColeccionExterna getOrigen() {
        return origen;
    }
}