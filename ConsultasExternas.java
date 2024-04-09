import java.util.ArrayList;

/**
 * Write a description of class ConsultasExternas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsultasExternas extends Unidad
{
    // instance variables - replace the example below with your own
    private ArrayList<Paciente> pacientes;

    /**
     * Constructor for objects of class ConsultasExternas
     */    
    public ConsultasExternas()
    {
        // initialise instance variables
        super("UCI",10);
    }

    
    public void nuevoPaciente(Paciente p){
    pacientes.add(p);
    }
    //public Paciente atender(){
    //System.outprint}
}
