public class EjemploAutomovilEnum {

    public static void main(String[] args) {

        Automovil subaru=new Automovil("Subaru", "Impresa");

        subaru.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        subaru.setColor(Color.BLANCO);

        Automovil mazda= new Automovil("Mazda", "BY-50" , Color.AZUL);

        mazda.setMotor(new Motor(2.0, TipoMotor.DIESEL));
        System.out.println("");


        Automovil nissan=new Automovil("Nissan", "Navarra", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL), new Estanque(74)  );

        Automovil nissan2=new Automovil("Nissan", "Navarra", Color.BLANCO, new Motor(3.0, TipoMotor.DIESEL), new Estanque(74) );

        Automovil auto = new Automovil();
        mazda.setTipo(TipoAutomovil.COUPE);
        subaru.setTipo(TipoAutomovil.FURGON);

        System.out.println("son iguales? " + (nissan==nissan2));
        System.out.println("son iguales con equals y Override? " + (nissan.equals(nissan2)));

        System.out.println(auto.equals("fecha"));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println(nissan.detalle());
        System.out.println(mazda.detalle());

        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 0.6f));

        System.out.println("kilometros por litro " + subaru.calcularConsumo(300, 60));

        TipoAutomovil tipo= subaru.getTipo();
        System.out.println();
        System.out.println("tipo subaru = " + tipo.getNombre());
        System.out.println("tipo subaru descripcion= " + tipo.getDescripcion());


        tipo = mazda.getTipo();
        switch (tipo){
            case CONVERTIBLE->
                System.out.println("El auto es deportivo y descapotable de dos puertas");
            case COUPE->
                System.out.println("El auto es pequeño de dos puertas");
            case FURGON ->
                System.out.println("Utilitario de transporte de empresas");
            case HATCHBACK->
                System.out.println("MEdiano y compato de aspecto deportivo");
            case PICKUP->
                System.out.println("Automovil de doble cabina o camioneta");
            case SEDAN ->
                System.out.println("Automovil mediano");
            case STATION_WAGON ->
                System.out.println("Autmovil más grande, con maleta grande");

        }

        TipoAutomovil[] tipos= TipoAutomovil.values();
        for(TipoAutomovil ta:tipos){
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + " , " + ta.getDescripcion() + " , " +
                    ta.getNumeroPuertas());
            System.out.println();
        }

    }

    //principio de Encapsulamiento o de Oculktación (POLIMOFIRSMO)
}
