public class empleado {
    //LOS ATRIBUTOS SON PRIVADOS Y LOS METODOS SON PUBLICOS

    //atributos
    private String dni;
    private String nombre;
    private Double salario;

    //atributos estaticos o de clase
    private static int numero = 0;


    //metodos
    public empleado(){ //CONSTRUCTOR
        numero++;
    }
    public empleado(String dni, String nombre, double salario){//CONSTRUCTOR INICIALIZANDO VALORES
        this.dni = dni;
        this.nombre = nombre;
        this.salario = salario;

        numero++;
    }

    public static int getNumero(){
        return numero;
    }
    public void incrementarSalario(double incremento){
        salario = salario + incremento;
    }

    public String imprimirDatos(){
        return this.dni + "," + this.nombre + "," + this.salario;
    }

    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
