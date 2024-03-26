import java.util.*;

/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada
{
    // instance variables - replace the example below with your own
    public Historial h;
    //public  profesional firmante;
    public Date fecha;
    public String tratamiento;
    public String diagnostico;
    public String indicaciones;

    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(Historial h)
    {
        this.h= h;
        this.fecha=new Date();
        this.tratamiento="NA";
        this.diagnostico="NA";
        this.indicaciones="NA";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String print()
    {
        return "tratamiento: "+ tratamiento+"\n Diagnostico: "+ 
        "diagnostico: " + diagnostico;
    }
}
