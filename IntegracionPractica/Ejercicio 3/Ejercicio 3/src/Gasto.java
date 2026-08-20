public class Gasto {
    private String concepto;
    private float montoGastado;

    public Gasto(String concepto, float montoGastado) {
        this.concepto = concepto;
        this.montoGastado = montoGastado;
    }

    public float getMontoGastado() {
        return montoGastado;
    }
}