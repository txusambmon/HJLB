import java.util.*;

/**
 * Write a description of class hospital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hospital
{
    // instance variables - replace the example below with your own
    public List<Unidad> unidades;

    /**
     * Constructor for objects of class hospital
     */
    public Hospital()
    {
        // initialise instance variables
        unidades = new ArrayList<>();
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void agregarUnidad(Unidad unidad){
    unidades.add(unidad);
    }
    
    public void datos(Hospital hospital)
    {
        // put your code here
        Datos datos = new Datos();
        datos.datear(/*hospital*/);
    }
    
    public static void main(String[] args)
    {
        Hospital hospital=new Hospital();
        hospital.datos(hospital);
        
        Datos datos = new Datos();
        datos.datear(/*hospital*/);

        
    }
}
