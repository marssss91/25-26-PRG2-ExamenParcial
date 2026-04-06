package vistas.gimnasio;

public class Actividades {

    private String nombre;
    private String monitor;
    private String horario; 
    
    public Actividades(String nombre, String monitor, String horario) {
        assert nombre != null;
        assert monitor != null;
        assert horario != null;

        this.nombre = nombre;
        this.monitor = monitor;
        this.horario = horario;
    }

    public Actividades(Actividades actividades) {
        this(actividades.nombre, actividades.monitor, actividades.horario);
    }

    public Actividades clone() {
        return new Actividades(this);
    }

    public String fecha() {
        return horario;
    }

    public boolean estaEnActividad() {
        return !nombre.isEmpty();
    }

    public boolean estaPendiente() {
        return monitor.equals("Pendiente");
    }
    
    public boolean equals(Actividades actividades) 
    public void registrarActividad(String nombre, int dni) 

    public String toString() 

    public void mostrar() 