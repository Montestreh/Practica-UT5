package Sonic_Hedgehog;

public class Sonic_Main 
{

	 public static void main(String[] args) 
	 {
	        // Crear instancia de Sonic
	        SonicCharacter sonic = new SonicCharacter("Sonic", 300, 0);
	        
	        // Crear instancia de Robotnik
	        JefeRobotnik robotnik = new JefeRobotnik("Eggman MK-I", 5);
	        
	        // Sonic recolecta anillos
	        sonic.recolectarAnillos(50);
	        System.out.println("Estado de Sonic: " + sonic.getEstado());
	        
	        // Robotnik ataca
	        int danio = robotnik.atacar(80);
	        System.out.println("¡Robotnik ataca! Daño causado: " + danio);
	        
	        // Calcular tiempo de recorrido con boost
	        double tiempo = sonic.calcularTiempoRecorrido(10, 1.5);
	        System.out.println("Tiempo estimado para 10km: " + tiempo + " minutos");
	        
	        // Robotnik mejora su amenaza
	        robotnik.actualizarAmenaza(15);
	        System.out.println("Nivel de amenaza de Robotnik: " + robotnik.getNivelAmenaza());
	    }
	
}
