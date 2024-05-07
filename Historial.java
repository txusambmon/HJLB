import java.util.*;

/**
 * Write a description of class Historial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Historial
{
    // instance variables - replace the example below with your own
    protected Paciente paciente;
    protected ArrayList<Entrada> entradas;
    protected ArrayList<Cita> citas;
    /**
     * Constructor for objects of class Historial
     */
    public Historial(Paciente paciente)
    {
        this.paciente=paciente;
        entradas= new ArrayList<>();
        citas= new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void nuevaEntrada(Historial h,Fecha f)
    {
        // put your code here
        entradas.add(new Entrada(h,f));
    }
    public void nuevaEntrada(Historial h,Fecha f,String t,String d,String i,Personal p)
    {
        // put your code here
        entradas.add(new Entrada(h,f,t,d,i,p));
    }
    public void nuevaCita(Cita c)
    {
        citas.add(c);
    }
    public ArrayList<Cita> getCitas() {
        return citas;
    }
    public void printCitas(){
        citas.stream()
                            .forEach(c-> {
                                System.out.println(c.getFecha());
                                System.out.println("Cita con Dr "+c.personal.getNombre()+ " en la unidad "+c.unidad.getNombre());
                            });        
        }  
    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }
    public void printEntradas(Fecha f){
        int[] iarr = {1};
        this.entradas.stream()
                            .forEach(e-> {
                                System.out.println("entrada "+iarr[0]);
                                System.out.println(e);
                                iarr[0]++;
                            });        
        }  
}
