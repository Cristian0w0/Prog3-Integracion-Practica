public class Pintura extends ObjetoArte {
    private String tipoPintura;
    private String soporte;
    private String estilo;

    public Pintura(int id, Artista artista, String titulo, EstadoPertenencia estadoPertenencia, String tipoPintura, String soporte) {
        super(id, artista, titulo, estadoPertenencia);
        this.tipoPintura = tipoPintura;
        this.soporte = soporte;
    }
}