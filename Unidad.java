
/**
 * Write a description of class Unidad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Unidad
{
    // instance variables - replace the example below with your own
    public String nombre;
    public int capacidad;
    public int ocupacion;
    //meter relaciones personal y pacientes y estudiantes
    
    /**
     * Constructor for objects of class Unidad
     */
    public Unidad(String nombre, int capacidad)
    {
        // initialise instance variables
        this.nombre=nombre;
        this.capacidad=capacidad;
        this.ocupacion=0;
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
    public int getCapacidad(){
        return capacidad;
    }
    public int getOcupacion(){
        return ocupacion;
    }
    public int getLibres(){
        return capacidad-ocupacion;
    }
    public String getInfo(){
        return "Nombre: "+nombre +"\nCapacidad: "+capacidad+"\nOcupacion: "+ocupacion+"\nLibres: "+this.getLibres();
    }
    public void printInfo(){
        System.out.println(this.getInfo());
    }
    public void ocupar(int y)
    {
        // put your code here
        if (this.ocupacion+y <= this.capacidad){
        this.ocupacion=this.ocupacion+y;}else{
        System.out.println("Excede la capacidad de la Unidad");
    }
}
}
