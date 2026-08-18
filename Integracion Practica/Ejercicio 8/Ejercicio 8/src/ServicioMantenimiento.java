import java.util.Date;

public class ServicioMantenimiento {
    private Date fecha;
    private int horasInvertidas;
    private String tipoTrabajo;
    private Mecanico mecanico;

    public ServicioMantenimiento(Date fecha, int horasInvertidas, String tipoTrabajo, Mecanico mecanico) {
        this.fecha = fecha;
        this.horasInvertidas = horasInvertidas;
        this.tipoTrabajo = tipoTrabajo;
        this.mecanico = mecanico;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }
}