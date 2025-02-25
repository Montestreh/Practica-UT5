package Sonic_Hedgehog;

/**
 * Clase que representa a un personaje principal de la franquicia Sonic
 * @author Mario Montes
 * @version 1.2
 * @since 1.0
 */
public class SonicCharacter{
    private String nombre;
    private int velocidad;
    private int anillos;

    /**
     * Constructor para crear un personaje de Sonic
     * @param nombre Nombre del personaje (ej: "Sonic", "Tails")
     * @param velocidad Velocidad base en km/h
     * @param anillos Cantidad inicial de anillos
     */
    public SonicCharacter(String nombre, int velocidad, int anillos) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.anillos = anillos;
    }

    /**
     * Método para recolectar anillos durante el juego
     * @param cantidad Cantidad de anillos a agregar
     * @return Nuevo total de anillos en posesión
     */
    public int recolectarAnillos(int cantidad) {
        if(cantidad > 0) {
            this.anillos += cantidad;
        }
        return this.anillos;
    }

    /**
     * Calcula el tiempo estimado para recorrer una distancia
     * @param distancia Distancia en kilómetros
     * @param boost Multiplicador de velocidad (ej: 1.5 para x1.5 de velocidad)
     * @return Tiempo en minutos requerido
     */
    public double calcularTiempoRecorrido(double distancia, double boost) {
        double velocidadFinal = this.velocidad * boost;
        return (distancia / velocidadFinal) * 60;
    }

    /**
     * @deprecated Método antiguo para mostrar estado, usar getters en su lugar
     * @see SonicCharacter#getEstado()
     */
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre + 
                         " | Anillos: " + anillos + 
                         " | Velocidad: " + velocidad + "km/h");
    }

    // Getters y setters
    public String getEstado() {
        return "Nombre: " + nombre + 
             " | Anillos: " + anillos + 
             " | Velocidad: " + velocidad + "km/h";
    }

    public int getVelocidad() { return velocidad; }
    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }
    public int getAnillos() { return anillos; }
}

/**
 * Clase que representa a un jefe/enemigo principal (Dr. Robotnik)
 * @author TuNombre
 * @version 1.1
 * @since 1.0
 */
class JefeRobotnik {
    private String nombreRobot;
    private int nivelAmenaza;
    private int robotsDestruidos;

    public JefeRobotnik(String nombreRobot, int nivelAmenaza) {
        this.nombreRobot = nombreRobot;
        this.nivelAmenaza = nivelAmenaza;
        this.robotsDestruidos = 0;
    }

    /**
     * Realiza un ataque con el robot
     * @param potencia porcentaje de potencia del ataque (1-100)
     * @return Daño total producido por el ataque
     */
    public int atacar(int potencia) {
        int danioBase = nivelAmenaza * 10;
        return (int)(danioBase * (potencia / 100.0));
    }

    /**
     * Actualiza el nivel de amenaza al destruir robots
     * @param cantidadRobots cantidad de robots destruidos en el nivel
     * @return Nuevo nivel de amenaza actualizado
     */
    public int actualizarAmenaza(int cantidadRobots) {
        robotsDestruidos += cantidadRobots;
        nivelAmenaza = robotsDestruidos / 5 + 1;
        return nivelAmenaza;
    }

    /**
     * @deprecated Método antiguo de mejora, usar actualizarAmenaza
     * @param nivel Nuevo nivel a establecer manualmente
     */
    public void mejorarRobot(int nivel) {
        this.nivelAmenaza = nivel;
    }

    // Getters
    public String getNombreRobot() { return nombreRobot; }
    public int getNivelAmenaza() { return nivelAmenaza; }
}
