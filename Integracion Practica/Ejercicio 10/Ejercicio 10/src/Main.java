import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Sede sedeOlimpica = new Sede(5000000.0f);

        Polideportivo poliSur = new Polideportivo("Zona Sur", "Maria Gomez", 15000.5f);
        sedeOlimpica.agregarComplejo(poliSur);

        Area areaAtletismo = new Area("Atletismo", "Centro");
        poliSur.agregarArea(areaAtletismo);

        Evento carrera100m = new Evento("Carrera 100 metros", new Date(), 10, 8);
        poliSur.agregarEvento(carrera100m);

        Material vallas = new Material("Vallas");
        carrera100m.agregarMaterial(vallas);

        Comisario comisarioPrincipal = new Comisario("Juan Perez");
        carrera100m.agregarComisario(comisarioPrincipal);
        comisarioPrincipal.agregarEvento(carrera100m);

        System.out.println("Numero de complejos en la sede: " + sedeOlimpica.getNumeroComplejos());
        System.out.println("Evento registrado: " + carrera100m.getNombre());
        System.out.println("Comisario a cargo: " + comisarioPrincipal.getNombre());
    }
}