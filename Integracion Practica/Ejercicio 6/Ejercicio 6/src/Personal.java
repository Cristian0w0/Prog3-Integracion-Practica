import java.util.ArrayList;
import java.util.List;

public class Personal {
    private String dni;
    private String nombre;
    private List<Cargo> cargos;

    public Personal(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.cargos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void asignarCargo(Cargo cargo) {
        this.cargos.add(cargo);
    }

    public List<Cargo> getCargos() {
        return cargos;
    }
}