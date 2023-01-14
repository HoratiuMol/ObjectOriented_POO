public class EjemploAutomovil {

    public static void main(String[] args) {

        Automovil subaru=new Automovil("Subaru", "Impresa");

        subaru.setCilindrada(2.0);
        subaru.setColor("Blanco");

        Automovil mazda= new Automovil("Mazda", "BY-50" , "Rojo");

        mazda.setCilindrada(3.0);
        System.out.println("");

        Automovil nissan=new Automovil("Nissan", "Navarra", "gris oscuro", 3.5, 50 );

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(nissan.detalle());
        System.out.println(mazda.detalle());

        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 60));

    }

    //principio de Encapsulamiento o de Oculktación (POLIMOFIRSMO)
}
