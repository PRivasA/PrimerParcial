import java.util.PriorityQueue;
import java.util.Comparator;

// Clase para representar una solicitud
class Solicitud {
    int id;
    String descripcion;
    int prioridad; // La prioridad más baja significa más urgente

    public Solicitud(int id, String descripcion, int prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}

// Comparador para determinar la prioridad de las solicitudes
class SolicitudComparator implements Comparator<Solicitud> {
    @Override
    public int compare(Solicitud s1, Solicitud s2) {
        return s1.prioridad - s2.prioridad;
    }
}

