public class Main {
    public static void main(String[] args) {
        ParqueNacional nahuelHuapi = new ParqueNacional("Nahuel Huapi");

        Area areaBosque = new Area("Bosque de Arrayanes", 15.5f);
        nahuelHuapi.agregarArea(areaBosque);

        Entrada entradaPrincipal = new Entrada(1);
        nahuelHuapi.agregarEntrada(entradaPrincipal);

        Vehiculo camioneta = new Vehiculo("4x4", "AB123CD");

        Personal empleadoMultitarea = new Personal("12345678", "Carlos Lopez");

        Guarda cargoGuarda = new Guarda(areaBosque, camioneta);
        Investigador cargoInvestigador = new Investigador("Biologo");

        empleadoMultitarea.asignarCargo(cargoGuarda);
        empleadoMultitarea.asignarCargo(cargoInvestigador);

        nahuelHuapi.contratarPersonal(empleadoMultitarea);

        System.out.println("Parque nacional registrado: " + nahuelHuapi.getNombre());
        System.out.println("Empleado contratado: " + empleadoMultitarea.getNombre());

        for (Cargo cargo : empleadoMultitarea.getCargos()) {
            System.out.println("Cargo asignado: " + cargo.getDenominacion());
        }
    }
}