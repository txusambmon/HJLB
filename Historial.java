import java.util.*;

/**
 * Write a description of class Historial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Historial
{
    // instance variables - replace the example below with your own
    private Paciente paciente;
    ArrayList<Entrada> entradas;
    /**
     * Constructor for objects of class Historial
     */
    public Historial(Paciente paciente)
    {
        // initialise instance variables
        this.paciente=paciente;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void nuevaEntrada(Historial h)
    {
        // put your code here
        entradas.add(new Entrada(h));
    }
}
