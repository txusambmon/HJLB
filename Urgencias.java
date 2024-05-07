import java.util.*;

/**
 * Write a description of class Urgencias here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Urgencias extends Unidad
{
    // instance variables - replace the example below with your own
    private Queue<Paciente> pacientes;

    /**
     * Constructor for objects of class Urgencias
     */    
    public Urgencias()
    {
        // initialise instance variables
        super("Urgencias",20);
    }

    
    public void nuevoPaciente(Paciente p){
    pacientes.add(p);
    }
    public void atender(){
        if (pacientes.peek()!=null){
        Paciente p=pacientes.remove();
        System.out.println("Se ha atendido al paciente "+p.getNombre()+" con DNI "+p.getDni());
        }
    }
}
