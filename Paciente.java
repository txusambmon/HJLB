import java.util.*;

/**
 * Write a description of class Paciente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paciente extends Persona
{
    // instance variables - replace the example below with your own
    protected Historial historial;
    protected Date proxCita;
    protected Unidad unidad;
    protected boolean ingresado;
    protected int room;
    
    /**
     * Constructor for objects of class Paciente
     */
   
    public Paciente(String nombre,String dni){
        // initialise instance variables
        super(nombre,dni);
        this.historial= new Historial(this);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getInfo(){
        return "Nombre: "+nombre +"\nDNI: "+dni;
    }
    public void printInfo(){
        System.out.println(this.getInfo());
    }
    public boolean ingresado(){
        return ingresado;
    }
    protected void ingresar(Unidad unidad,int room){
        this.unidad=unidad;
        if(room>unidad.getCapacidad()){
        System.out.println("esa habitación no existe");        
        }else{
        this.room=room;
        }
        System.out.println("El paciente "+this.getNombre()+" ha sido ingresado en la habitación "
        +room+" en la unidad "+unidad.getNombre()); 
    }
}
