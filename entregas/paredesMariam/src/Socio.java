package vistas.gimnasio;

public class Socio {
    private String nombre;
    private int dni;
    private String suscripcion;
    private String actividadActual;

public Socio(String nombre, int dni, String suscripcion) {
        assert nombre != null;
        assert dni > 0;
        assert suscripcion != null;

        this.nombre = nombre;
        this.dni = dni;
        this.suscripcion = suscripcion;
        this.actividadActual = "";
    }
public Socio(String nombre, int dni){
        this(nombre, dni, "Básica");
    }

public Socio()

public Socio(Socio socio)

public Socio clone()

public String nombre() 

public int dni() 

    public String suscripcion() 

    public boolean equals(Socio socio) 

    public boolean tieneSuscripcion(String nombre, int dni, String suscripcion) 

    public boolean tieneMismoNombre(String nombre) 

    public void agregarActividad(String actividades) 

    public void reiniciarActividad() 

    public void reiniciarReserva() 
    public String toString() 

    public void mostrar() 
