
/**
 * Write a description of class Fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int ano;

    /**
     * Constructor for objects of class Fecha
     */
    public Fecha(int d,int m,int a)
    {
        // initialise instance variables
        this.dia=d;
        this.mes=m;
        this.ano=a;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getDia()
    {
       return dia;
    }
    public int getMes()
    {
       return mes;
    }
    public int getAno()
    {
       return ano;
    }
    public String toString()
    {
       return " "+dia+"-"+mes+"-"+ano;
    }
    public void print()
    {
       System.out.println(this.toString());
    }
}
