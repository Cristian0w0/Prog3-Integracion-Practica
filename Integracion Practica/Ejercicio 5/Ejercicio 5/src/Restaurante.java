import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private List<Sucursal> sucursales;
    private List<Plato> platosOfrecidos;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
        this.platosOfrecidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    public void agregarPlato(Plato plato) {
        if (this.platosOfrecidos.size() < 20) {
            this.platosOfrecidos.add(plato);
        } else {
            System.out.println("No se pueden ofrecer mas de 20 platos en este restaurante");
        }
    }
}