import java.util.Date;

public class SiembraHistorica {
    private Date fecha;
    private Cereal cerealSembrado;

    public SiembraHistorica(Date fecha, Cereal cerealSembrado) {
        this.fecha = fecha;
        this.cerealSembrado = cerealSembrado;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cereal getCerealSembrado() {
        return cerealSembrado;
    }
}