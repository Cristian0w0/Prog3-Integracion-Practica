import java.util.Date;

public class Artista {
    private String nombre;
    private Date fechaNacimiento;
    private Date fechaDefuncion;
    private String paisOrigen;
    private String epoca;
    private String estiloPrincipal;
    private String descripcion;

    public Artista(String nombre, String paisOrigen, String estiloPrincipal) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.estiloPrincipal = estiloPrincipal;
    }

    public String getNombre() {
        return nombre;
    }
}