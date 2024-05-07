import java.util.ArrayList;

/**
 * Es la unidad de hospitalización.
 * 
 */
public class Planta extends Unidad
{
    // instance variables - replace the example below with your own
    //public ArrayList<Paciente> pacientes;
    //a unidad
    
    
    //private HashMap<Integer,Paciente> distro;

    /**
     * Constructor for objects of class Planta
     */    
    public Planta()
    {
        // initialise instance variables
        super("Hospitalización",20);
        //pacientes=new ArrayList<Paciente>();
        //A unidad
        
        
        //this.distro=new HashMap<>();
    }

    /* a unidad
    public void nuevoPaciente(Paciente p){
    pacientes.add(p);
    }
    public void ingresar(Paciente p){
    this.nuevoPaciente(p);
    this.ocupar(1);
    }
    public void getPacientes(){
        System.out.println("Los pacientes de esta planta\n");
        pacientes.stream()
                .forEach(p-> {
                    System.out.println(p.getNombre());
                    //List<Personal> empleados= servicio.getEmpleados();
                    //empleados.forEach(empleado->System.out.println(empleado.getInfo()));
                });
    //public Paciente atender(){
    //System.outprint}
    }*/
}
