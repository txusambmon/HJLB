import java.util.ArrayList;

/**
 * Write a description of class Cafeteria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cafeteria extends Unidad
{
    // instance variables - replace the example below with your own
    private ArrayList<Persona> clientes;

    /**
     * Constructor for objects of class Cafeteria
     */    
    public Cafeteria()
    {
        // initialise instance variables
        super("Cafeteria",60);
    }

    
    public void nuevoCliente(Persona p){
    clientes.add(p);
    }
    public void cafe(){
    System.out.println("Se está tomando usted un cafe en la cafetería");}
    //public Paciente atender(){
    //System.outprint}
}
