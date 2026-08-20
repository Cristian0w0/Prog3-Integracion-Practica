import java.util.ArrayList;
import java.util.List;

public class EspecieAnimal extends Especie {
    private String periodoCelo;
    private String tipoAlimentacion;
    private List<Especie> alimentos;

    public EspecieAnimal(String nombreCientifico, String nombreVulgar, String periodoCelo, String tipoAlimentacion) {
        super(nombreCientifico, nombreVulgar);
        this.periodoCelo = periodoCelo;
        this.tipoAlimentacion = tipoAlimentacion;
        this.alimentos = new ArrayList<>();
    }

    public void agregarAlimento(Especie especie) {
        this.alimentos.add(especie);
    }
}