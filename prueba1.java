import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Doctor {
    private String nombre;
    private Map<String, List<String>> calendario;

    public Doctor(String nombre) {
        this.nombre = nombre;
        this.calendario = new HashMap<>();
    }

    public void agendarCita(String fecha, String paciente) {
        if (!calendario.containsKey(fecha)) {
            calendario.put(fecha, new ArrayList<>());
        }
        calendario.get(fecha).add(paciente);
    }

    public void mostrarCalendario() {
        System.out.println("Calendario de citas del doctor " + nombre + ":");
        for (Map.Entry<String, List<String>> entry : calendario.entrySet()) {
            String fecha = entry.getKey();
            List<String> citas = entry.getValue();
            System.out.println("Fecha: " + fecha);
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

public class prueba1 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. García");

        Paciente paciente1 = new Paciente("Juan");
        Paciente paciente2 = new Paciente("María");

        doctor.agendarCita("2024-04-12", paciente1.getNombre());
        doctor.agendarCita("2024-04-15", paciente2.getNombre());
        doctor.agendarCita("2024-04-15", "Pedro"); // Agregando paciente directamente sin crear objeto Paciente

        doctor.mostrarCalendario();
    }
}
