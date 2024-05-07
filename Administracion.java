import java.util.ArrayList;

/**
 * Write a description of class Administracion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administracion extends Unidad
{
    // instance variables - replace the example below with your own
    private ArrayList<Personal> personal;

    /**
     * Constructor for objects of class Administracion
     */    
    public Administracion()
    {
        // initialise instance variables
        super("Administracion",30);
    }

    
    public void nuevoPersonal(Personal p){
    personal.add(p);
    }
    //public Paciente atender(){
    //System.outprint}
}
