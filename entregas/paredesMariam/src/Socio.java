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

public Socio(){
        this("", 0, "");
    }

public Socio(Socio socio){
        this(socio.nombre, socio.dni, socio.suscripcion);
        this.actividadActual = socio.actividadActual;
    }{
        this(socio.nombre, socio.dni, socio.suscripcion);
        this.actividadActual = socio.actividadActual;
    }

public Socio clone(){
        return new Socio(this);
    }

public String nombre() {
        return nombre;
    }

public int dni() {
        return dni;
    }

    public String suscripcion(){
        return suscripcion;
    } 

    public boolean equals(Socio socio) {
        assert socio != null;
        return this.dni == socio.dni;
    }

    public boolean tieneSuscripcion(String nombre, int dni, String suscripcion) {
        assert nombre != null;
        assert suscripcion != null;
        return tieneMismoNombre(nombre) && this.dni == dni && this.suscripcion.equals(suscripcion);
    }

    public boolean tieneMismoNombre(String nombre){
        assert nombre != null;
        return this.nombre.equals(nombre);
    } 

    public void agregarActividad(String actividades) {
        assert actividades != null;
        this.actividadActual = actividades;
    }

    public void reiniciarActividad() {
        this.actividadActual = "";
    }
    public void reiniciarReserva() {
        reiniciarActividad(); 
    }
    public String toString() {
        return nombre + " (DNI: " + dni + ") - Suscripción: " + suscripcion + 
               (actividadActual.isEmpty() ? "" : " - Actividad: " + actividadActual);
    }

    public void mostrar() {
        System.out.println(this.toString());
    }
}

