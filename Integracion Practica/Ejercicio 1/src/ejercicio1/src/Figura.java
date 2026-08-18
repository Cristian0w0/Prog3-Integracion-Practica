import java.util.ArrayList;
import java.util.List;

public class Figura {
    private List<FiguraBasica> figurasBasicas;

    public Figura() {
        this.figurasBasicas = new ArrayList<>();
    }

    public void agregarFiguraBasica(FiguraBasica figuraBasica) {
        this.figurasBasicas.add(figuraBasica);
    }

    public void mostrarComponentes() {
        System.out.println("Componentes de la figura compleja:");
        for (FiguraBasica fb : figurasBasicas) {
            fb.dibujar();
        }
    }
}