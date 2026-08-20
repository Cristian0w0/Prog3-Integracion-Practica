public class ColeccionExterna {
    private String nombre;
    private String tipo;
    private String descripcion;
    private String direccion;
    private String telefono;
    private String personaContacto;

    public ColeccionExterna(String nombre, String tipo, String personaContacto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.personaContacto = personaContacto;
    }

    public String getNombre() {
        return nombre;
    }
}