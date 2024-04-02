
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    public String dni;
    public String nombre;
    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, String dni)
    {
        // initialise instance variables
        this.dni = dni;
        this.nombre= nombre;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getDni()
    {
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getInfo(){
        return "Nombre: "+nombre +"\nDNI: "+dni;
    }
    public void printInfo(){
        System.out.println(this.getInfo());
    }
}
