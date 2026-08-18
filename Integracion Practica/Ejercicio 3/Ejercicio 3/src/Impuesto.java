public class Impuesto {
    private String tipoDeImpuesto;
    private float montoRecaudado;

    public Impuesto(String tipoDeImpuesto, float montoRecaudado) {
        this.tipoDeImpuesto = tipoDeImpuesto;
        this.montoRecaudado = montoRecaudado;
    }

    public float getMontoRecaudado() {
        return montoRecaudado;
    }
}