import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TipoAvion boeing = new TipoAvion("Boeing 737", 200, 41000.0f);

        Hangar hangarNorte = new Hangar(10, 5, "Sector Norte");

        Avion avionPrincipal = new Avion("LV-ABC", boeing, hangarNorte);

        Propietario empresa = new Propietario("Aerolineas XYZ");
        avionPrincipal.agregarPropietario(empresa);

        Mecanico mecanicoJefe = new Mecanico("12345", "Roberto", "Calle Falsa 123", "555-1234", 150000.0f, "Mañana");
        mecanicoJefe.agregarAutorizacion(boeing);

        ServicioMantenimiento revision = new ServicioMantenimiento(new Date(), 8, "Revision de motores", mecanicoJefe);
        avionPrincipal.agregarServicio(revision);

        System.out.println("Matricula del avion: " + avionPrincipal.getMatricula());
        System.out.println("Trabajo realizado: " + revision.getTipoTrabajo());
        System.out.println("Mecanico a cargo: " + mecanicoJefe.getNombre());
    }
}