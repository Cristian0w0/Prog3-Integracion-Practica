public class EspecieVegetal extends Especie {
    private boolean tieneFloracion;
    private String periodoFloracion;

    public EspecieVegetal(String nombreCientifico, String nombreVulgar, boolean tieneFloracion, String periodoFloracion) {
        super(nombreCientifico, nombreVulgar);
        this.tieneFloracion = tieneFloracion;
        this.periodoFloracion = periodoFloracion;
    }
}