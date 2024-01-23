public class Principal {
    public static void main(String[] args){

        Fecha f1 = new Fecha(7,4,1995);
        Fecha f2 = new Fecha(7,3,2005);
        Fecha f3 = new Fecha(7,7,2023);

        Persona p1 = new Persona("juan", "rodriguez",f1);
        Persona p2 = new Persona("ana", "ramirez",f2);
        Persona p3 = new Persona("lucia", "sanchez",f3);


        Persona[] personas = {p1,p2,p3};

        for (Persona p: personas){
            System.out.println(p.getFecha_nacimiento().toString());
        }

    }
}
