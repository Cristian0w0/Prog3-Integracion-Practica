public class Inscripcion {
    private Participante participante;
    private Prueba prueba;
    private String codigoDorsal;
    private String tiempoEmpleado;
    private int posicionObtenida;

    public Inscripcion(Participante participante, Prueba prueba, String codigoDorsal) {
        this.participante = participante;
        this.prueba = prueba;
        this.codigoDorsal = codigoDorsal;
    }

    public void registrarResultado(String tiempoEmpleado, int posicionObtenida) {
        this.tiempoEmpleado = tiempoEmpleado;
        this.posicionObtenida = posicionObtenida;
    }

    public Participante getParticipante() {
        return participante;
    }
}