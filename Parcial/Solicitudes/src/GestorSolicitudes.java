import java.util.PriorityQueue;

public class GestorSolicitudes {
    public static void main(String[] args) {
        // Crear una cola de prioridad con el comparador personalizado
        PriorityQueue<Solicitud> colaSolicitudes = new PriorityQueue<>(new SolicitudComparator());

        // Añadir solicitudes a la cola
        colaSolicitudes.add(new Solicitud(1, "Reparar PC Gamer", 2));
        colaSolicitudes.add(new Solicitud(2, "Instalar software especializado", 3));
        colaSolicitudes.add(new Solicitud(3, "Revisión de red", 1));

        // Procesar las solicitudes en orden de prioridad
        while (!colaSolicitudes.isEmpty()) {
            Solicitud solicitud = colaSolicitudes.poll(); // Obtiene y remueve la solicitud con mayor prioridad
            System.out.println("Procesando: " + solicitud);
            // Aquí se podría añadir la lógica para asignar la solicitud a un técnico
        }
    }
}