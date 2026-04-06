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

    public Gimnasio(String actividades, String monitor) {
        this(actividades, monitor, "01/01/2025", 0);
    }

    public Gimnasio() {
        this("", "", "", 0);
    }

    public Gimnasio(Gimnasio gimnasio) {
        this(gimnasio.actividades, gimnasio.monitor, gimnasio.fecha, gimnasio.ocupacion);
    }

    public Gimnasio clone() {
        return new Gimnasio(this);
    }

    public String monitor() {
        return monitor;
    }

    public String actividades() {
        return actividades;
    }

    public void hacerReservas() {
        this.ocupacion++;
    }

    public void consultarReservas() {
        System.out.println("Ocupación actual: " + ocupacion);
    }
    public void cancelarReservas() {
        if (ocupacion > 0) {
            this.ocupacion--;
        }
    }

    public void inscribirSocios(){
        hacerReservas(); 
    }

    public void verReservas() {
        this.mostrar();
    }

    public void verSocios(String nombre) {
        assert nombre != null;
        System.out.println("Buscando socio: " + nombre + " en " + actividades);
    }
    public String toString(){
        return "Gimnasio - " + actividades + " | Monitor: " + monitor + " | Fecha: " + fecha + " | Reservas: " + ocupacion;
    } 

    public void mostrar() {
        System.out.println(this.toString());
    }
}
