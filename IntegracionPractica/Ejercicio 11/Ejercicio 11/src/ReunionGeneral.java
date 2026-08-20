import java.util.Date;

public class ReunionGeneral {
    private Date fechaReunion;
    private Date fechaProximaReunion;

    public ReunionGeneral(Date fechaReunion, Date fechaProximaReunion) {
        this.fechaReunion = fechaReunion;
        this.fechaProximaReunion = fechaProximaReunion;
    }

    public Date getFechaReunion() {
        return fechaReunion;
    }
}