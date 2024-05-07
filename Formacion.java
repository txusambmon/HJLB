import java.util.*;

/**
 * Write a description of class Formacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Formacion extends Unidad
{
    // instance variables - replace the example below with your own
    public ArrayList<Estudiante> estudiantes;

    /**
     * Constructor for objects of class Formacion
     */
    public Formacion()
    {
        // initialise instance variables
        super("Formación",50);
        estudiantes= new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void nuevoEstudiante(Estudiante e){
    estudiantes.add(e);
    }
    
    public void printEstudiantes(){
        estudiantes.stream()
                .forEach(estudiante-> System.out.println(estudiante.getInfo()));
        
    }
    public List<Estudiante> getEstudiantes(){
        return estudiantes;
    }
    public void darClase(Personal p,Fecha f){
        System.out.println("clase con "+p.getNombre() +" el día "+f+" en turno de "+p.getTurno());
        p.calendario.agregarCita(f, new Cita(p,this,f));
    }
}
