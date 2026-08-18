public class Guarda extends Cargo {
    private Area areaAsignada;
    private Vehiculo vehiculoAsignado;

    public Guarda(Area areaAsignada, Vehiculo vehiculoAsignado) {
        super("Guarda");
        this.areaAsignada = areaAsignada;
        this.vehiculoAsignado = vehiculoAsignado;
    }
}