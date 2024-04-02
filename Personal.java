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
    public String especialidad; 
    public String turnoTrabajo; 
    public Unidad unidad;
    /**
     * Constructor for objects of class Personal
     */
   
    public Personal(String nombre,String dni){
        // initialise instance variables
        super(nombre,dni);
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getInfo(){
        return "Nombre: "+nombre +"\nDNI: "+dni;
    }
    public void printInfo(){
        System.out.println(this.getInfo());
    }
}
