import java.util.*;

 

public class Datos{
    
    public Datos(){}

public void datear(Hospital hospital){
    
    Unidad UCI = new Unidad("UCI",10);
    Unidad Planta1= new Unidad("Planta1",20);
    hospital.agregarUnidad(UCI);
    hospital.agregarUnidad(Planta1);
}

}




