//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pais pais = new Pais("Republica");
        Provincia provinciaNorte = new Provincia("Norte");
        pais.agregarProvincia(provinciaNorte);

        Ciudad ciudadUno = new Ciudad("Ciudad Uno", 150000);
        ciudadUno.agregarImpuesto(new Impuesto("imp1", 10000));
        ciudadUno.agregarGasto(new Gasto("Mantenimiento", 15000));
        provinciaNorte.agregarCiudad(ciudadUno);

        Ciudad ciudadDos = new Ciudad("Ciudad Dos", 120000);
        ciudadDos.agregarImpuesto(new Impuesto("imp2", 20000));
        ciudadDos.agregarGasto(new Gasto("Mantenimiento", 10000));
        provinciaNorte.agregarCiudad(ciudadDos);

        Ciudad ciudadTres = new Ciudad("Ciudad Tres", 110000);
        ciudadTres.agregarImpuesto(new Impuesto("imp3", 5000));
        ciudadTres.agregarGasto(new Gasto("Mantenimiento", 15000));
        provinciaNorte.agregarCiudad(ciudadTres);

        SistemaControl sistema = new SistemaControl(pais);

        System.out.println("Ciudades con deficit (mas de 100k habitantes):");
        List<Ciudad> ciudadesDeficit = sistema.obtenerCiudadesConDeficit();
        for (Ciudad ciudad : ciudadesDeficit) {
            System.out.println(ciudad.getNombre());
        }

        System.out.println("Provincias con mas del 50% de sus ciudades (de mas de 100k hab) en deficit:");
        List<Provincia> provinciasDeficit = sistema.obtenerProvinciasConDeficit();
        for (Provincia provincia : provinciasDeficit) {
            System.out.println(provincia.getNombre());
        }
    }
}