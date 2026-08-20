import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Mineral nitrogeno = new Mineral("Nitrogeno", true);
        Mineral fosforo = new Mineral("Fosforo", false);
        Mineral potasio = new Mineral("Potasio", true);

        GranoGrueso maiz = new GranoGrueso("Maiz");
        maiz.agregarMineralRequerido(nitrogeno);
        maiz.agregarMineralRequerido(fosforo);

        Pastura alfalfa = new Pastura("Alfalfa");
        alfalfa.agregarMineralRequerido(potasio);

        Lote loteNorte = new Lote("Lote Norte");
        loteNorte.agregarMineral(nitrogeno);
        loteNorte.agregarMineral(fosforo);
        loteNorte.agregarMineral(potasio);

        Lote loteSur = new Lote("Lote Sur");
        loteSur.agregarMineral(potasio);
        loteSur.agregarSiembraHistorica(new SiembraHistorica(new Date(), new Pastura("Trebol")));

        Cooperativa cooperativa = new Cooperativa();
        cooperativa.agregarCerealDisponible(maiz);
        cooperativa.agregarCerealDisponible(alfalfa);

        Cereal consejoNorte = cooperativa.aconsejarCerealParaLote(loteNorte);
        if (consejoNorte != null) {
            System.out.println("Cereal aconsejado para Lote Norte: " + consejoNorte.getNombre());
        } else {
            System.out.println("No hay cereal apto para Lote Norte");
        }

        Cereal consejoSur = cooperativa.aconsejarCerealParaLote(loteSur);
        if (consejoSur != null) {
            System.out.println("Cereal aconsejado para Lote Sur: " + consejoSur.getNombre());
        } else {
            System.out.println("No hay cereal apto para Lote Sur");
        }
    }
}