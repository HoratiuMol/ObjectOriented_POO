public class EjemploAutomovil {

    public static void main(String[] args) {

        Automovil subaru=new Automovil();


        subaru.fabricante="Subaru";
        subaru.modelo="Impresa";
        subaru.cilindrada=2.0;
        subaru.color="Blanco";


        System.out.println();

        Automovil mazda= new Automovil();
        mazda.fabricante="Mazda";
        mazda.modelo="BY-50";
        mazda.cilindrada=3.0;
        mazda.color="Rojo";

        System.out.println(subaru.detalle());
        System.out.println();
        System.out.println(mazda.detalle());
        System.out.println();
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

    }
}
