import java.util.*;
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Persona
{
    // instance variables - replace the example below with your own
    public Unidad unidad;

    /**
     * Constructor for objects of class Estudiante
     */
    public Estudiante(String nombre,String dni,Unidad unidad)
    {
        super(nombre,dni);// initialise instance variables
        this.unidad=unidad;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
}
