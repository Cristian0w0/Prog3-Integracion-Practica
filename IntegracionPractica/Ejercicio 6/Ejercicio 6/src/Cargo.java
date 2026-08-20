public abstract class Cargo {
    private String denominacion;

    public Cargo(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }
}