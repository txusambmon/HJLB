import java.util.ArrayList;

/**
 * Write a description of class Aparcamiento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aparcamiento extends Unidad
{
    // instance variables - replace the example below with your own
    private ArrayList<Persona> aparcados;

    /**
     * Constructor for objects of class Aparcamiento
     */    
    public Aparcamiento()
    {
        // initialise instance variables
        super("Aparcamiento",3);
    }

    
    public void nuevoPaciente(Persona p){
    aparcados.add(p);
    }
    public void aparcar(){
        System.out.println("Ha aparcado usted usando dos plazas, la proxima vez por favor use solo una");
    }
    //public Paciente atender(){
    //System.outprint}
}
