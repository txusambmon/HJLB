import java.util.*;
/**
 * Write a description of class Calendario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calendario
{
    private HashMap<Fecha,ArrayList<Cita>> calendario;

    /**
     * Constructor for objects of class Calendario
     */
    public Calendario()
    {
        this.calendario=new HashMap<>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void agregarCita(Fecha fecha, Cita cita) {
        if (!calendario.containsKey(fecha)) {
            calendario.put(fecha, new ArrayList<Cita>());
        }
        calendario.get(fecha).add(cita);
    }
    
    public ArrayList<Cita> getCitas(Fecha fecha) {
        return calendario.get(fecha);
    }
    public void printCalendario(){
        for (Map.Entry<Fecha, ArrayList<Cita>> entry : calendario.entrySet()) {
        System.out.println( entry.getKey() );
        int[] iarr = {1};
        this.getCitas(entry.getKey()).stream()
                            .forEach(c-> {
                                System.out.println("\ncita "+iarr[0]);
                                System.out.println(c.paciente.getNombre()+ " en la unidad "+c.unidad.getNombre());
                                iarr[0]++;
                            });
        /*int[] iarr = {1};
        System.out.println( entry.getValue().forEach(c-> {
                                System.out.println("\ncita "+iarr[0]);
                                System.out.println(c.paciente.getNombre()+ " en la unidad "+c.unidad.getNombre());
                                iarr[0]++;
                            }));*/
        }   
    }   
}
