import java.util.*;

/**
 * Write a description of class Servicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Servicio
{
    // instance variables - replace the example below with your own
    private int x;
    private String nombre;
    public List<Personal> personal;
    
   

    /**
     * Constructor for objects of class Servicio
     */
    public Servicio(String nombre)
    {
        this.nombre=nombre;
        personal = new ArrayList<Personal>();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombre(){
        return nombre;
    }
    public String getInfo(){
        return "Nombre: "+nombre;
    }
    public void printInfo(){
        System.out.println(this.getInfo());
    }
    public void agregarPersonal(Personal empleado){
    personal.add(empleado);
    }
    public void getPersonal(){
        personal.stream()
                .forEach(empleado-> System.out.println(empleado.getInfo()));
        
    }
    public List<Personal> getEmpleados(){
        return personal;
    }
}
