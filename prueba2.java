import java.util.*;

class Doctor {
    private String nombre;
    private Map<Calendar, List<String>> calendario;

    public Doctor(String nombre) {
        this.nombre = nombre;
        this.calendario = new HashMap<>();
    }

    public void agendarCita(Calendar fecha, String paciente) {
        if (!calendario.containsKey(fecha)) {
            calendario.put(fecha, new ArrayList<>());
        }
        calendario.get(fecha).add(paciente);
    }

    public void mostrarCalendario() {
        System.out.println("Calendario de citas del doctor " + nombre + ":");
        for (Map.Entry<Calendar, List<String>> entry : calendario.entrySet()) {
            Calendar fecha = entry.getKey();
            List<String> citas = entry.getValue();
            System.out.println("Fecha: " + fecha.getTime());
            System.out.println("Citas:");
            for (String cita : citas) {
                System.out.println("- " + cita);
            }
            System.out.println();
        }
    }
}

class Paciente {
    private String nombre;

    public Paciente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class prueba2 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. García");

        Paciente paciente1 = new Paciente("Juan");
        Paciente paciente2 = new Paciente("María");

        // Crear instancias de Calendar para representar fechas
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2024, Calendar.APRIL, 12); // 12 de abril de 2024

        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(2024, Calendar.APRIL, 15); // 15 de abril de 2024

        doctor.agendarCita(fecha1, paciente1.getNombre());
        doctor.agendarCita(fecha2, paciente2.getNombre());
        doctor.agendarCita(fecha2, "Pedro");

        doctor.mostrarCalendario();
    }
}
