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
}

}




