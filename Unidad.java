import java.util.*;

/**
 * Write a description of class Unidad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Unidad
{
    // instance variables - replace the example below with your own
    public String nombre;
    public int capacidad;
    public int ocupacion;
    public ArrayList<Personal> personal;
    public ArrayList<Paciente> pacientes;
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
        personal = new ArrayList<Personal>();
        pacientes=new ArrayList<Paciente>();
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
        if (this.ocupacion+y <= this.capacidad){
        this.ocupacion=this.ocupacion+y;}else{
        System.out.println("Excede la capacidad de la Unidad");
    }
    }
    public void agregarPersonal(Personal empleado){
        personal.add(empleado);
    }
    public void getPersonal(){
        System.out.println("El personal de esta unidad:");
        personal.stream()
                .forEach(empleado-> System.out.println(empleado.getInfo()));
        
    }
    public List<Personal> getEmpleados(){
        return personal;
    }
    
    public void nuevoPaciente(Paciente p){
    pacientes.add(p);
    }
    public void ingresar(Paciente p){
    this.nuevoPaciente(p);
    this.ocupar(1);
    }
    public void quitarPaciente(Paciente p){
    pacientes.remove(p);
    }
    public void desocupar(){
    this.ocupacion=this.ocupacion-1;
    }
    public void darAlta(Paciente p){
    this.quitarPaciente(p);
    this.desocupar();
    }
    public void getPacientes(){
        System.out.println("Los pacientes de esta planta:\n");
        if(pacientes.size()==0){
            System.out.println("La planta está vacia\n");
        }
        else{
        pacientes.stream()
                .forEach(p-> {
                    System.out.println(p.getNombre());
                    //List<Personal> empleados= servicio.getEmpleados();
                    //empleados.forEach(empleado->System.out.println(empleado.getInfo()));
                });
            }
    //public Paciente atender(){
    //System.outprint}
    }
    public void buscarPersonalNombre(String b){
        System.out.println("Buscando: "+b);
        personal.stream()
                .forEach(persona->{ 
                    if(persona.getNombre().equals(b)){
                        System.out.println(persona.getInfo());}
                    });
        
    }
    public void buscarPersonalDni(String b){
        System.out.println("Buscando: "+b);
        personal.stream()
                .forEach(persona->{ 
                    if(persona.getDni().equals(b)){
                        System.out.println(persona.getInfo());}
                    });
        
    }
    public void buscarPacienteNombre(String b){
        System.out.println("Buscando: "+b);
        pacientes.stream()
                .forEach(persona->{ 
                    if(persona.getNombre().equals(b)){
                        System.out.println(persona.getInfo());}
                    });
        
    }
    public void buscarPacienteDni(String b){
        System.out.println("Buscando: "+b);
        pacientes.stream()
                .forEach(persona->{ 
                    if(persona.getDni().equals(b)){
                        System.out.println(persona.getInfo());}
                    });
        
    }
}
