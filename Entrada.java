import java.util.*;

/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada
{
    // instance variables - replace the example below with your own
    public Historial h;
    public Personal firmante;
    public Fecha fecha;
    public String tratamiento;
    public String diagnostico;
    public String indicaciones;

    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(Historial h,Fecha f)
    {
        this.h= h;
        this.fecha=f;
        this.tratamiento="NA";
        this.diagnostico="NA";
        this.indicaciones="NA";
    }
    public Entrada(Historial h,Fecha f,String t,String d,String i,Personal p)
    {
        this.h= h;
        this.fecha=f;
        this.tratamiento=t;
        this.diagnostico=d;
        this.indicaciones=i;
        this.firmante=p;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }
    
    public String toString()
    {
        return fecha.toString()+"\nTratamiento: "+ tratamiento +"\nDiagnostico: "+
        diagnostico+"\nFdo:"+ firmante.getNombre();
    }
}
