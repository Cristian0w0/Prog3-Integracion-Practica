import java.util.Date;

public class ColeccionPermanente extends EstadoPertenencia {
    private Date fechaAdquisicion;
    private float coste;
    private boolean enExposicion;

    public ColeccionPermanente(Date fechaAdquisicion, float coste, boolean enExposicion) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.coste = coste;
        this.enExposicion = enExposicion;
    }

    public boolean isEnExposicion() {
        return enExposicion;
    }
}