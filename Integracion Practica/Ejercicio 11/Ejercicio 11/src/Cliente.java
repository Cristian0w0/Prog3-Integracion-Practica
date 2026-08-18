import java.util.Date;

public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;
    private Date fechaIngreso;

    public Cliente(String nombre, String direccion, String telefono, Date fechaNacimiento, Date fechaIngreso) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }
}