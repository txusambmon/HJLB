import java.util.ArrayList;

/**
 * Write a description of class UnidEspec here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UnidEspec extends Unidad
{
    // instance variables - replace the example below with your own
    private ArrayList<Paciente> pacientes;

    /**
     * Constructor for objects of class UnidEspec
     */    
    public UnidEspec(String s)
    {
        // initialise instance variables
        super(s,10);
    }

    
    public void nuevoPaciente(Paciente p){
    pacientes.add(p);
    }
    //public Paciente atender(){
    //System.outprint}
}
