import java.util.ArrayList;
import java.util.List;

public class Ciudad {
    private String nombre;
    private int cantidadHabitantes;
    private List<Impuesto> impuestos;
    private List<Gasto> gastos;

    public Ciudad(String nombre, int cantidadHabitantes) {
        this.nombre = nombre;
        this.cantidadHabitantes = cantidadHabitantes;
        this.impuestos = new ArrayList<>();
        this.gastos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public void agregarImpuesto(Impuesto impuesto) {
        this.impuestos.add(impuesto);
    }

    public void agregarGasto(Gasto gasto) {
        this.gastos.add(gasto);
    }

    public boolean tieneDeficit() {
        float totalRecaudado = 0;
        for (Impuesto impuesto : impuestos) {
            totalRecaudado += impuesto.getMontoRecaudado();
        }

        float totalGastado = 0;
        for (Gasto gasto : gastos) {
            totalGastado += gasto.getMontoGastado();
        }

        return totalGastado > totalRecaudado;
    }
}