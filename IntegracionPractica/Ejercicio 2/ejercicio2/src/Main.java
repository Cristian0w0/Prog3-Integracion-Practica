public class Main {
    public static void main(String[] args) {
        Continente america = new Continente("America");

        Pais argentina = new Pais("Argentina");
        Pais chile = new Pais("Chile");

        america.agregarPais(argentina);
        america.agregarPais(chile);

        argentina.agregarPaisLimitrofe(chile);
        chile.agregarPaisLimitrofe(argentina);

        Provincia mendoza = new Provincia("Mendoza");
        Provincia sanJuan = new Provincia("San Juan");

        argentina.agregarProvincia(mendoza);
        argentina.agregarProvincia(sanJuan);

        mendoza.agregarProvinciaLimitrofe(sanJuan);
        sanJuan.agregarProvinciaLimitrofe(mendoza);
        mendoza.agregarPaisLimitrofe(chile);

        Ciudad buenosAires = new Ciudad("Buenos Aires");
        argentina.setCapital(buenosAires);

        Ciudad ciudadMendoza = new Ciudad("Mendoza Ciudad");
        mendoza.agregarCiudad(ciudadMendoza);
        mendoza.setCapital(ciudadMendoza);

        Ciudad sanRafael = new Ciudad("San Rafael");
        mendoza.agregarCiudad(sanRafael);

        System.out.println("Continente registrado: " + america.getNombre());
        System.out.println("Capital del pais: " + argentina.getCapital().getNombre());
        System.out.println("Capital de la provincia: " + mendoza.getCapital().getNombre());
        System.out.println("Cantidad de ciudades en la provincia: " + mendoza.getCiudades().size());
        System.out.println("Pais limitrofe de la provincia: " + mendoza.getPaisesLimitrofes().get(0).getNombre());
    }
}