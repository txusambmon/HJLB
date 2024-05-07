import java.util.*;

 

public class Datos{
    
    public Datos(){}

public void datear(Hospital hospital){
    
    Pruebas pruebas = new Pruebas();
    Planta planta1= new Planta();
    Uci uci= new Uci();
    ConsultasExternas CE= new ConsultasExternas();
    Administracion administracion=new Administracion();
    UnidEspec cardio=new UnidEspec("Enfermedades Cardiovasculares");
    UnidEspec diabetes=new UnidEspec("Diabetes");
    Urgencias urgencias=new Urgencias();
    Formacion formacion=new Formacion();
    Cafeteria cafe=new Cafeteria();
    Aparcamiento parking=new Aparcamiento();
    
    hospital.agregarUnidad(pruebas);
    hospital.agregarUnidad(planta1);
    hospital.agregarUnidad(uci);
    hospital.agregarUnidad(CE);
    hospital.agregarUnidad(formacion); 
    hospital.agregarUnidad(administracion);
    hospital.agregarUnidad(cardio);
    hospital.agregarUnidad(diabetes);
    hospital.agregarUnidad(urgencias);
    hospital.agregarUnidad(cafe);
    hospital.agregarUnidad(parking);
    
    
    Servicio Gerencia = new Servicio("Gerencia");
    Servicio Medicina = new Servicio("Medicina");
    Servicio Enfermeria = new Servicio("Enfermeria");
    hospital.agregarServicio(Gerencia);
    hospital.agregarServicio(Medicina);
    hospital.agregarServicio(Enfermeria);
    
    Personal p1=new Personal("Pepe Gotera", "1234",Medicina,planta1);
    Personal p2=new Personal("Doctor Muerte", "666",Medicina,uci);
    Personal p3=new Personal("Doña FIga", "00",Gerencia,pruebas);
    Personal p4=new Personal("Kato Kito", "0001",Enfermeria,planta1);
    p1.setEspecialidad(Especialidad.CARDIOLOGIA);
    p1.setTurno(Turno.M);
    
     
    Estudiante e1=new Estudiante("zipi","73473",formacion);
    Estudiante e2=new Estudiante("zape","347",formacion);
    Estudiante e3=new Estudiante("zopo","742",formacion);
    formacion.nuevoEstudiante(e1);
    formacion.nuevoEstudiante(e2);
    formacion.nuevoEstudiante(e3);
}

}




