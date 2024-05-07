import java.util.ArrayList;

/**
 * Es la unidad de hospitalización.
 * 
 */
public class Pruebas extends Unidad
{
    // instance variables - replace the example below with your own
    private ArrayList<Paciente> pacientes;

    /**
     * Constructor for objects of class Pruebas
     */    
    public Pruebas()
    {
        // initialise instance variables
        super("Pruebas",90);
    }

    
    public void nuevoPaciente(Paciente p){
    pacientes.add(p);
    }
    //public Paciente atender(){
    //System.outprint}
}
