public class Fecha {

    //atributos
    private int dia;
    private int mes;
    private int anho;

    //Constructor inicializado
    public Fecha(int dia, int mes, int anho){
        this.dia=dia;
        this.mes=mes;
        this.anho=anho;
    }


    //geters y seters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    //metodo toString

    @Override
    public String toString() {
        String resultado = "";
        if (dia < 10){
            resultado = resultado + "0" + dia;
        }
        else {
            resultado = resultado + dia;
        }
        resultado = resultado + "/";
        if (mes < 10){
            resultado = resultado + "0" + mes;
        }
        else {
            resultado = resultado + mes;
        }
        resultado = resultado + "/" + anho;

        return resultado;
    }
}
