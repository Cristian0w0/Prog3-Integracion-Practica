import java.util.ArrayList;
import java.util.List;

public class Sede {
    private float presupuestoAproximado;
    private List<ComplejoDeportivo> complejos;

    public Sede(float presupuestoAproximado) {
        this.presupuestoAproximado = presupuestoAproximado;
        this.complejos = new ArrayList<>();
    }

    public void agregarComplejo(ComplejoDeportivo complejo) {
        this.complejos.add(complejo);
    }

    public int getNumeroComplejos() {
        return this.complejos.size();
    }

    public float getPresupuestoAproximado() {
        return presupuestoAproximado;
    }
}