public class Persona {

    private String nombre;
    private String apellido;
    Fecha fecha_nacimiento;

    public Persona(String nombre1, String apellido1, Fecha fecha_nacimiento1){
        this.nombre = nombre1;
        this.apellido = apellido1;
        this.fecha_nacimiento = fecha_nacimiento1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento.toString() +
                '}';
    }
}
