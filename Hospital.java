import java.util.*;

/**
 * Write a description of class hospital here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hospital
{
    // instance variables - replace the example below with your own
    public List<Unidad> unidades;
    public List<Servicio> servicios;

    /**
     * Constructor for objects of class hospital
     */
    public Hospital()
    {
        // initialise instance variables
        unidades = new ArrayList<Unidad>();
        servicios = new ArrayList<Servicio>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void agregarUnidad(Unidad unidad){
    unidades.add(unidad);
    }
    public void agregarServicio(Servicio servicio){
    servicios.add(servicio);
    }
    public void datos(Hospital hospital)
    {
        // put your code here
        Datos datos = new Datos();
        datos.datear(this);
    }
    public void getUnidades(){
        unidades.stream()
                .forEach(unidad-> {
                    System.out.println(unidad.getNombre());
                    List<Personal> empleados= unidad.getEmpleados();
                    empleados.forEach(empleado->System.out.println(empleado.getInfo()));
                });
        
    }
    public void getFormacion(){
        unidades.stream()
                .forEach(unidad-> {
                    if(unidad.getNombre().equals("Formación")){
                    System.out.println(unidad.getNombre());
                    //List<Estudiante> estudiantes= unidad.getEstudiantes();
                   // estudiantes.forEach(estudiante->System.out.println(estudiante.getInfo()));
                }
                });
        
    }
    public void getServicios(){
        servicios.stream()
                .forEach(servicio-> {
                    System.out.println(servicio.getNombre());
                    List<Personal> empleados= servicio.getEmpleados();
                    empleados.forEach(empleado->System.out.println(empleado.getInfo()));
                });
        //servicios.stream()
               // .forEach(servicio-> System.out.println(servicio.getEmpleados()));
                         
                //servicio.stream()
                      //  .forEach(empleado-> empleado.printinfo()));
    }
    public static void main(String[] args)
    {
        Hospital hospital=new Hospital();
        hospital.datos(hospital);
        //new InterfazHospital(hospital);
        //new Inp();
        hospital.getUnidades();
        
        hospital.getServicios();

        
    }
}
