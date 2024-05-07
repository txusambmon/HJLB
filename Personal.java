import java.util.*;

/**
 * Write a description of class Personal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personal extends Persona
{
    // instance variables - replace the example below with your own
    public Servicio servicio;
    public Especialidad especialidad; 
    public Turno turno;
    public Unidad unidad;
    public Calendario calendario;
    /**
     * Constructor for objects of class Personal
     */
   
    public Personal(String nombre,String dni,Servicio servicio,Unidad unidad){
        // initialise instance variables
        super(nombre,dni);
        this.unidad=unidad;
        this.servicio=servicio;
        servicio.agregarPersonal(this);
        unidad.agregarPersonal(this);
        this.calendario=new Calendario();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    // Getter y Setter para 'servicio'
    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    // Getter y Setter para 'especialidad'
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    // Getter y Setter para 'turnoTrabajo'
    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    // Getter y Setter para 'unidad'
    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }
    
    public String getInfo(){
        return "Nombre: " + nombre + ", DNI: " + dni + ", Servicio: " + 
        servicio.getNombre() + ", Especialidad: " + especialidad + ", Turno de Trabajo: " + turno + ", Unidad: " + unidad.getNombre();
    }
    public void printInfo(){
        System.out.println(this.getInfo());
    }
    public void getCitas(Fecha f){
        int[] iarr = {1};
        calendario.getCitas(f).stream()
                            .forEach(c-> {
                                System.out.println("\ncita "+iarr[0]);
                                System.out.println(c.paciente.getNombre()+ " en la unidad "+c.unidad.getNombre());
                                iarr[0]++;
                            });        
        }        
    }

