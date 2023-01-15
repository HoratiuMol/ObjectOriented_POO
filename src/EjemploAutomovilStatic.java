public class EjemploAutomovilStatic {

    public static void main(String[] args) {

        Automovil subaru=new Automovil("Subaru", "Impresa");

        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda= new Automovil("Mazda", "BY-50" , "Rojo");

        mazda.setCilindrada(3.0);
        System.out.println("");


        Automovil nissan=new Automovil("Nissan", "Navarra", "gris oscuro", 3.5, 50 );

        Automovil nissan2=new Automovil("Nissan", "Navarra", "gris oscuro", 3.5, 50 );

        Automovil.setColorPatente("azul");

        Automovil auto = new Automovil();

        System.out.println(subaru.detalle());
        System.out.println(nissan.detalle());
        System.out.println(mazda.detalle());

        System.out.println(nissan2.detalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());

    }

    //principio de Encapsulamiento o de Oculktación (POLIMOFIRSMO)
}
