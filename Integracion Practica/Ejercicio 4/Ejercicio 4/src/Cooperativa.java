import java.util.ArrayList;
import java.util.List;

public class Cooperativa {
    private List<Cereal> cerealesDisponibles;

    public Cooperativa() {
        this.cerealesDisponibles = new ArrayList<>();
    }

    public void agregarCerealDisponible(Cereal cereal) {
        this.cerealesDisponibles.add(cereal);
    }

    public Cereal aconsejarCerealParaLote(Lote lote) {
        for (Cereal cereal : cerealesDisponibles) {
            if (lote.satisfaceRequerimientos(cereal)) {
                return cereal;
            }
        }
        return null;
    }
}