
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    public int id;
    public String nombre;
    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, int id)
    {
        // initialise instance variables
        this.id = id;
        this.nombre= nombre;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getId()
    {
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getInfo(){
        return "Nombre: "+nombre +"\nId: "+id;
    }
    public void printInfo(){
        System.out.println(this.getInfo());
    }
}
