import java.util.ArrayList;
import java.util.List;

public abstract class Poligono extends FiguraBasica {
    private int numeroDeLados;
    private List<Lado> lados;

    public Poligono(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
        this.lados = new ArrayList<>();
    }

    public void agregarLado(Lado lado) {
        this.lados.add(lado);
    }

    public int getNumeroDeLados() {
        return numeroDeLados;
    }

    public void setNumeroDeLados(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public List<Lado> getLados() {
        return lados;
    }
}