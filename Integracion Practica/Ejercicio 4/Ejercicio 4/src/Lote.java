import java.util.ArrayList;
import java.util.List;

public class Lote {
    private String identificador;
    private List<Mineral> minerales;
    private List<SiembraHistorica> historialSiembras;

    public Lote(String identificador) {
        this.identificador = identificador;
        this.minerales = new ArrayList<>();
        this.historialSiembras = new ArrayList<>();
    }

    public void agregarMineral(Mineral mineral) {
        this.minerales.add(mineral);
    }

    public void agregarSiembraHistorica(SiembraHistorica siembra) {
        this.historialSiembras.add(siembra);
    }

    public boolean esEspecial() {
        for (Mineral mineral : minerales) {
            if (mineral.isEsPrimario()) {
                return true;
            }
        }
        return false;
    }

    public boolean satisfaceRequerimientos(Cereal cereal) {
        for (Mineral mineralReq : cereal.getMineralesRequeridos()) {
            if (!minerales.contains(mineralReq)) {
                return false;
            }
        }

        if (cereal instanceof Pastura) {
            for (SiembraHistorica siembra : historialSiembras) {
                if (siembra.getCerealSembrado() instanceof Pastura) {
                    return false;
                }
            }
        }

        return true;
    }
}
