import java.util.*;
/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Nivel2
     */
    public Nivel2(){ }

    /**Este metodo realiza y demuestra todas las funciones solicitadas en el nivel 2: 
     *Dar de alta a los empleados del hospital, asignando cada uno a una unidad.
     *Dar de alta a los pacientes.
     * 
     */
    public void nivel2(Hospital hospital)
    {
        System.out.println("\n*NIVEL 2\n");
        System.out.println("\n*Damos de alta un nuevo empleado, y lo asignamos a una unidad\n");
        Personal n2a=new Personal("Yomiro Tukoko", "6664",
        hospital.servicios.get(1),hospital.unidades.get(3));
        n2a.setTurno(Turno.T);
        System.out.println("Hemos dado de alta a "+ n2a.getNombre()+ " con DNI "+
        n2a.getDni()+" en el servicio de "+ n2a.getServicio().getNombre() + 
        " y en la unidad de "+
        n2a.getUnidad().getNombre());
        System.out.println("\n*Damos de alta un nuevo paciente\n");
        Paciente p2a=new Paciente("Toyma Lito","00001");
        System.out.println("Hemos dado de alta como paciente a "+ p2a.getNombre()+ " con DNI "+
        p2a.getDni());
        Paciente p3a=new Paciente("Medu L To","00002");
        
        System.out.println("\n*Creamos una cita para el paciente\n");
        Fecha fecha1= new Fecha(20,10,2025);
        Fecha fecha2= new Fecha(12, 01, 2013);
        Cita cita1= new Cita(p2a,n2a,hospital.unidades.get(2),fecha1);
        System.out.println("Hemos creado una cita para "+ p2a.getNombre()+ " con el Dr "+
        n2a.getNombre()+" en la unidad de "+ hospital.unidades.get(3).getNombre() + 
        " y con fecha "+ fecha1.toString());
        Cita cita2= new Cita(p3a,n2a,hospital.unidades.get(1),fecha1);
        System.out.println("\n*Comprobamos el calendario de citas del doctor para ese dia\n");
        n2a.getCitas(fecha1);
        System.out.println("\n*Y el historial del paciente\n");
        p2a.historial.printCitas();
        
        System.out.println("\n*Cuando tenemos la cita ingresamos al paciente y generamos la entrada en el historial\n");
        p2a.historial.nuevaEntrada(p2a.historial, fecha1,"golpes","Locura cronica","Ingreso permanente",n2a);
        p2a.historial.printEntradas(fecha1);
        hospital.unidades.get(1).ingresar(p2a);
        hospital.unidades.get(1).getPacientes();
        
        System.out.println("\n*Y cuando se recupera le damos el alta \n");
        hospital.unidades.get(1).darAlta(p2a);
        hospital.unidades.get(1).getPacientes();
        
        System.out.println("\n*Damos de alta un estudiante, y comprobamos los estudiantes de la unidad \n");
        Estudiante e5=new Estudiante("MuLis To","101010",hospital.unidades.get(4));
        Formacion uf= (Formacion) hospital.unidades.get(4);
        uf.nuevoEstudiante(e5);
        uf.printEstudiantes();
        System.out.println("\n*Damos la clase\n");
        Personal p5=new Personal("Sinko Fia", "03201",hospital.servicios.get(2),uf);
        p5.setEspecialidad(Especialidad.CARDIOLOGIA);
        p5.setTurno(Turno.M);
        uf.darClase(p5,fecha2);
        System.out.println("\n*También podemos asignarlos a una cita\n");
        cita2.setEstudiante(e5);
        cita2.printCita();
        
        System.out.println("\n*Podemos ver todo el calendario del personal y modificarlo como ya hemos visto antes\n");
        n2a.calendario.printCalendario();
        
        
        System.out.println("\n*Para las busquedas simples, podemos listar los pacientes, personal y estudiantes de una unidad\n");
        hospital.unidades.get(1).getNombre();
        hospital.unidades.get(1).getPersonal();
        hospital.unidades.get(1).getPacientes();
        System.out.println("\n*También podemos buscar por el nombre o el DNI\n");


        hospital.unidades.forEach(u->{Unidad un=(Unidad) u;
            u.buscarPersonalDni("0001");});
        System.out.println("\nFin Nivel 2");
        
    }
}
