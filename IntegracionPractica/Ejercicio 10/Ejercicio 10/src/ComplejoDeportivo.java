import java.util.ArrayList;
import java.util.List;

public abstract class ComplejoDeportivo {
    private String localizacion;
    private String jefeOrganizacion;
    private float areaOcupada;
    private List<Area> areas;
    private List<Evento> eventos;

    public ComplejoDeportivo(String localizacion, String jefeOrganizacion, float areaOcupada) {
        this.localizacion = localizacion;
        this.jefeOrganizacion = jefeOrganizacion;
        this.areaOcupada = areaOcupada;
        this.areas = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public void agregarArea(Area area) {
        this.areas.add(area);
    }

    public void agregarEvento(Evento evento) {
        this.eventos.add(evento);
    }

    public String getLocalizacion() {
        return localizacion;
    }
}