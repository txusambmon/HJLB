import java.util.*;

/**
 * Write a description of class Paciente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paciente extends Persona
{
    // instance variables - replace the example below with your own
    public Historial historial;
    public Date proxCita;
    public Unidad unidad;
    /**
     * Constructor for objects of class Paciente
     */
   
    public Paciente(String nombre,int id){
        // initialise instance variables
        super(nombre,id);
        this.historial= new Historial(this);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getInfo(){
        return "Nombre: "+nombre +"\nid: "+id;
    }
    public void printInfo(){
        System.out.println(this.getInfo());
    }
}
