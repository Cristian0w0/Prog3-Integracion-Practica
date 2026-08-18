public class Main {
    public static void main(String[] args) {
        Federacion fedNacional = new Federacion("Federacion Nacional", 500);

        Estacion estacionCerro = new Estacion("EST-01", "Cerro Catedral");
        fedNacional.agregarEstacion(estacionCerro);

        Pista pistaPrincipal = new Pista(1, 2.5f, "Rojo");
        estacionCerro.agregarPista(pistaPrincipal);

        Esquiador esquiador1 = new Esquiador("11223344", "Matias", 22, fedNacional);
        Esquiador esquiador2 = new Esquiador("55667788", "Lucas", 24, fedNacional);

        Equipo equipoAlfa = new Equipo("EQ-ALFA", "Entrenador Gomez");
        equipoAlfa.agregarEsquiador(esquiador1);
        equipoAlfa.agregarEsquiador(esquiador2);

        Prueba slalom = new Prueba("Slalom Gigante", "Slalom", estacionCerro);
        slalom.agregarPista(pistaPrincipal);

        Inscripcion inscripcionEquipo = new Inscripcion(equipoAlfa, slalom, "Slalom Gigante-001");

        System.out.println("Federacion registrada: " + fedNacional.getNombre());
        System.out.println("Estacion configurada: " + estacionCerro.getNombre());
        System.out.println("Participante inscripto: " + inscripcionEquipo.getParticipante().getIdentificador());
    }
}