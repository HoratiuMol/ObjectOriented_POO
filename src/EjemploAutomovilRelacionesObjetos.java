public class EjemploAutomovilRelacionesObjetos {

    public static void main(String[] args) {



        Persona conductorSubaru = new Persona("luci", "martinza");
        Automovil subaru=new Automovil("Subaru", "Impresa");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        Rueda[] ruedasSub= new Rueda[5];
        for(int i=0;i<ruedasSub.length;i++){
            subaru.addRueda(new Rueda("Yokohama",17,7.5));
        }


        Rueda[] ruedaMaz = {new Rueda("Michelin",18,10.5)};
        Persona pato = new Persona("Pato","Rodriguez");
        Automovil mazda= new Automovil("Mazda", "BY-50" , Color.ROJO);
        mazda.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        mazda.setEstanque(new Estanque(50));
        mazda.setConductor(pato);
        for(int i=0; i<ruedaMaz.length;i++){
            mazda.addRueda(new Rueda("Michelin",18,10.5));
        }
        //mazda.setRuedas(ruedaMaz);



        Automovil nissan=new Automovil("Nissan", "Navarra", Color.GRIS, new Motor(3.0, TipoMotor.DIESEL), new Estanque(45) );
        nissan.setTipo(TipoAutomovil.HATCHBACK);
        nissan.addRueda(new Rueda("Pireli",20,11.5))
                .addRueda(new Rueda("Pireli",20,11.5))
                .addRueda(new Rueda("Pireli",20,11.5))
                .addRueda(new Rueda("Pireli",20,11.5))
                .addRueda(new Rueda("Pireli",20,11.5));


        Rueda[] ruedaNissan2 = {new Rueda("Pirelli",16,11.5),
                new Rueda("Pirelli",16,11.5),
                new Rueda("Pirelli",16,11.5),
                new Rueda("Pirelli",16,11.5),
                new Rueda("Pirelli",16,11.5),
                new Rueda("Pirelli",16,11.5)};
        Persona lalo= new Persona("lalo", "Rodrigeuz");
        Automovil nissan2= new Automovil("Nissan", "Toreto");
        nissan2.setTipo(TipoAutomovil.FURGON);
        Automovil.setColorPatente(Color.AZUL);
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil auto = new Automovil();
       // nissan2.setRuedas(ruedaNissan2);


        System.out.println("conductorSubaru = " + conductorSubaru);
        System.out.println("Ruedas subaru : ");
        for(Rueda r: subaru.getRuedas()){
            System.out.println(r.getFabricante()+ " , aro: " + r.getAro() + ", ancho " + r.getAncho());
        }



    }

    //principio de Encapsulamiento o de Oculktación (POLIMOFIRSMO)
}
