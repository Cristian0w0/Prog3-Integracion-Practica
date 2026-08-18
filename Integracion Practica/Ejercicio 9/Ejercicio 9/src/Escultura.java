public class Escultura extends ObjetoArte {
    private String material;
    private float altura;
    private float peso;
    private String estilo;

    public Escultura(int id, Artista artista, String titulo, EstadoPertenencia estadoPertenencia, String material, float altura) {
        super(id, artista, titulo, estadoPertenencia);
        this.material = material;
        this.altura = altura;
    }
}