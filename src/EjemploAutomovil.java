public class EjemploAutomovil {

    public static void main(String[] args) {

        Automovil subaru=new Automovil("Subaru", "Impresa");

        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);


        Automovil mazda= new Automovil("Mazda", "BY-50" , Color.AZUL);

        mazda.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        System.out.println("");


        Automovil nissan=new Automovil("Nissan", "Navarra", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL), new Estanque(74) );

        Automovil nissan2=new Automovil("Nissan", "Navarra", Color.BLANCO, new Motor(3.0, TipoMotor.DIESEL), new Estanque(45) );

        Automovil auto = new Automovil();

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

    }

    //principio de Encapsulamiento o de Oculktación (POLIMOFIRSMO)
}
