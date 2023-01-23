import java.util.Map;
import java.util.concurrent.TimeUnit;

public class EjemploAutomovilStatic {

    public static void main(String[] args) {

        Automovil subaru=new Automovil("Subaru", "Impresa");

        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        System.out.println("Velocidad maxima carretera : " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad : " + Automovil.VELOCIDAD_MAX_CIUDAD);

        Automovil mazda= new Automovil("Mazda", "BY-50" , Color.ROJO);

        mazda.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        //mazda.setEstanque(new Estanque(50));
        System.out.println("");


        Automovil nissan=new Automovil("Nissan", "Navarra", Color.GRIS, new Motor(3.0, TipoMotor.DIESEL), new Estanque(45) );
        nissan.setTipo(TipoAutomovil.HATCHBACK);
        Automovil nissan2=new Automovil("Nissan", "Navarra", Color.GRIS, new Motor(3.0, TipoMotor.DIESEL), new Estanque(60) );
        nissan2.setTipo(TipoAutomovil.FURGON);
        Automovil.setColorPatente(Color.AZUL);
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil auto = new Automovil();

        System.out.println(subaru.detalle());
        System.out.println(nissan.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan2.detalle());

        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("kilometros por litro = "  + Automovil.calcularConsumoEstatico(300,60));

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println();
        System.out.println("tipo subaru = " + tipoSubaru.getNombre());

        System.out.println(mazda.calcularConsumo(300,70));

    }

    //principio de Encapsulamiento o de Oculktación (POLIMOFIRSMO)
}
