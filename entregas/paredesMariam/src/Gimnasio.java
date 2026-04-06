package vistas.gimnasio;

public class Gimnasio {

    private String actividades;
    private String monitor;
    private String fecha;
    private int ocupacion;

    public Gimnasio(String actividades, String monitor, String fecha, int ocupacion) {
        assert actividades != null;
        assert monitor != null;
        assert fecha != null;
        assert ocupacion >= 0;

        this.actividades = actividades;
        this.monitor = monitor;
        this.fecha = fecha;
        this.ocupacion = ocupacion;
    }

    public Gimnasio(String actividades, String monitor) 

    public Gimnasio() 

    public Gimnasio(Gimnasio gimnasio) 

    public Gimnasio clone() 

    public String monitor() 

    public String actividades() 

    public void hacerReservas() 

    public void consultarReservas() 
    public void cancelarReservas() 

    public void inscribirSocios()

    public void verReservas() 

    public void verSocios(String nombre) 
    public String toString() 

    public void mostrar() 
