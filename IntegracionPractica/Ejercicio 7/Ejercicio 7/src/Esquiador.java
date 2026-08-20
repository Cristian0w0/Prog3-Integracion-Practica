public class Esquiador extends Participante {
    private String dni;
    private String nombre;
    private int edad;
    private Federacion federacion;

    public Esquiador(String dni, String nombre, int edad, Federacion federacion) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.federacion = federacion;
    }

    @Override
    public String getIdentificador() {
        return nombre;
    }

    public Federacion getFederacion() {
        return federacion;
    }
}