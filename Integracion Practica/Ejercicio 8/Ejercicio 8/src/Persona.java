public abstract class Persona {
    private String seguridadSocial;
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String seguridadSocial, String nombre, String direccion, String telefono) {
        this.seguridadSocial = seguridadSocial;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
}