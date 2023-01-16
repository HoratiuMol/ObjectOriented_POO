public class EjemploAutomovilStatic {

    public static void main(String[] args) {

        Automovil subaru=new Automovil("Subaru", "Impresa");

        subaru.setCilindrada(2.0);
        subaru.setColor(Automovil.COLOR_BLANCO);
        System.out.println("Velocidad maxima carretera : " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad : " + Automovil.VELOCIDAD_MAX_CIUDAD);

        Automovil mazda= new Automovil("Mazda", "BY-50" , Automovil.COLOR_ROJO);

        mazda.setCilindrada(3.0);
        System.out.println("");


        Automovil nissan=new Automovil("Nissan", "Navarra", Automovil.COLOR_GRIS, 3.5, 50 );
        Automovil nissan2=new Automovil("Nissan", "Navarra", Automovil.COLOR_GRIS, 3.5, 50 );
        Automovil.setColorPatente(Automovil.COLOR_AZUL);
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil auto = new Automovil();

        System.out.println(subaru.detalle());
        System.out.println(nissan.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan2.detalle());

        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("kilometros por litro = "  + Automovil.calcularConsumoEstatico(300,60));

    }

    //principio de Encapsulamiento o de Oculktación (POLIMOFIRSMO)
}
