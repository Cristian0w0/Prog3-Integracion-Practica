import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Artista daVinci = new Artista("Leonardo da Vinci", "Italia", "Renacimiento");

        ColeccionPermanente coleccionPropia = new ColeccionPermanente(new Date(), 5000000.0f, true);

        Pintura monaLisa = new Pintura(1, daVinci, "La Gioconda", coleccionPropia, "Oleo", "Tabla de alamo");

        ColeccionExterna louvre = new ColeccionExterna("Museo del Louvre", "Museo", "Director");
        Prestamo prestamoEscultura = new Prestamo(louvre, new Date(), new Date());

        Escultura venus = new Escultura(2, null, "Venus de Milo", prestamoEscultura, "Marmol", 2.03f);

        Exposicion renacimientoYClasicos = new Exposicion("Obras Maestras", new Date(), new Date());
        renacimientoYClasicos.agregarObjeto(monaLisa);
        renacimientoYClasicos.agregarObjeto(venus);

        System.out.println("Exposicion creada: " + renacimientoYClasicos.getNombre());
        System.out.println("Pintura registrada: " + monaLisa.getTitulo());
        System.out.println("Artista de la pintura: " + monaLisa.getArtista().getNombre());
    }
}