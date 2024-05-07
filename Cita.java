import java.util.*;
/**
 * Write a description of class cita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cita
{
    // paciente, medico, fecha...
    //instance variables - replace the example below with your own
    protected Paciente paciente;
    protected Personal personal;
    protected Unidad unidad;
    protected Fecha fecha;
    protected Estudiante estudiante;

    /**
     * Constructor for objects of class cita
     */
    public Cita(Paciente paciente,Personal personal,Unidad unidad,Fecha fecha)
    {
        // initialise instance variables
        this.paciente= paciente;
        this.personal=personal;
        this.unidad=unidad;
        this.fecha=fecha;
        personal.calendario.agregarCita(fecha, this);
        paciente.historial.nuevaCita(this);
    }
    public Cita(Personal personal,Unidad unidad,Fecha fecha)
    {
        // initialise instance variables        
        this.personal=personal;
        this.unidad=unidad;
        this.fecha=fecha;
        personal.calendario.agregarCita(fecha, this);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String print()
    {
        return paciente.getNombre()+" en la unidad " + unidad.getNombre();
    }
    public Fecha getFecha(){
        return this.fecha;
    }
    public void setEstudiante(Estudiante e){
    this.estudiante=e;
    }
    public String toString(){
        String s=new String();
    if(this.estudiante!=null){
        s="\nEstudiante: "+estudiante.getNombre();}    
    return "Información de la cita:\nFecha: "+this.fecha+"\nPaciente: "+this.paciente.getNombre()+
    "\nPersonal: "+this.personal.getNombre()+"\nUnidad: "+this.unidad.getNombre()+"\nTurno: "+this.personal.getTurno()+s;
    
     
    }
    public void printCita(){
    System.out.println(this.toString());
    }
}
