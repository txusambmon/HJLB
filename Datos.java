import java.util.*;

 

public class Datos{
    
    public Datos(){}

public void datear(Hospital hospital){
    
    Unidad U1 = new Unidad("U1",100);
    Unidad Planta1= new Unidad("Planta1",20);
    Uci uci= new Uci();
    hospital.agregarUnidad(U1);
    hospital.agregarUnidad(uci);
    hospital.agregarUnidad(Planta1);
    
    Servicio Gerencia = new Servicio("Gerencia");
    Servicio Medicina = new Servicio("Medicina");
    Servicio Enfermeria = new Servicio("Enfermeria");
    hospital.agregarServicio(Gerencia);
    hospital.agregarServicio(Medicina);
    hospital.agregarServicio(Enfermeria);
    
    Personal p1=new Personal("Pepe Gotera", "1234",Medicina,U1);
    Personal p2=new Personal("Doctor Muerte", "666",Medicina,uci);
    Personal p3=new Personal("Doña FIga", "00",Gerencia,U1);
    Personal p4=new Personal("Kato Kito", "0001",Enfermeria,Planta1);
    Formacion formacion=new Formacion();
    hospital.agregarUnidad(formacion);  
    Estudiante e1=new Estudiante("zipi","73473",formacion);
    Estudiante e2=new Estudiante("zape","347",formacion);
    Estudiante e3=new Estudiante("zopo","742",formacion);
    
}

}




