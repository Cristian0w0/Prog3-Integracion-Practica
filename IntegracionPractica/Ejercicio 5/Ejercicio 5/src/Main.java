public class Main {
    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad("Mendoza");

        Restaurante rest1 = new Restaurante("El Gourmet");
        rest1.agregarSucursal(new Sucursal("Centro"));
        ciudad.agregarRestaurante(rest1);

        Restaurante rest2 = new Restaurante("La Parrilla");
        ciudad.agregarRestaurante(rest2);

        Plato plato1 = new Plato("Asado");
        Plato plato2 = new Plato("Pastas");

        rest1.agregarPlato(plato1);
        rest1.agregarPlato(plato2);
        rest2.agregarPlato(plato1);

        Persona persona = new Persona("Juan");
        persona.agregarRestauranteHabitual(rest1);
        persona.agregarRestauranteOcasional(rest2);

        persona.registrarDegustacion(plato1, rest1, false);
        persona.registrarDegustacion(plato1, rest2, true);

        System.out.println("Resultados de las degustaciones:");
        for (Degustacion deg : persona.getDegustaciones()) {
            if (deg.isLeGusta()) {
                System.out.println("Le gusto el plato " + deg.getPlato().getNombre() + " en el restaurante " + deg.getRestaurante().getNombre());
            } else {
                System.out.println("No le gusto el plato " + deg.getPlato().getNombre() + " en el restaurante " + deg.getRestaurante().getNombre());
            }
        }
    }
}