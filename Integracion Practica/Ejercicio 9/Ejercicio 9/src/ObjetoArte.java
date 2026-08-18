public abstract class ObjetoArte {
    private int id;
    private Artista artista;
    private int anioCreacion;
    private String titulo;
    private String descripcion;
    private String pais;
    private String cultura;
    private String epoca;
    private EstadoPertenencia estadoPertenencia;

    public ObjetoArte(int id, Artista artista, String titulo, EstadoPertenencia estadoPertenencia) {
        this.id = id;
        this.artista = artista;
        this.titulo = titulo;
        this.estadoPertenencia = estadoPertenencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public EstadoPertenencia getEstadoPertenencia() {
        return estadoPertenencia;
    }
}