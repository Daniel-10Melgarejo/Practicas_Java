public class Principal {
    public static void main(String[] args){

        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta("Oscar");

        c1.setTitular("Daniel");
        c1.setCantidad(100);

        c2.ingresar(500);
        c2.retirar(100);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
