public class Automovil{
    //estos son atributos, no métodos

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private double cilindrada;
    private Estanque estanque;
    private  Persona propietario;
    private Rueda[] ruedas;
    private int indiceRuedas;
    private Motor motor;

    private Persona conductor;

    private TipoAutomovil tipo;

    private  static  int capacidadEstanqueEstatico=30;

    private static Color colorPatente=Color.NARANJO;//al ser STATIC le pertenece a la clase y no al objeto
    private static int ultimoId; //al ser int parte de 0, no hace falta inicializar

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120; //cte que no se puede modificar
    public static final int VELOCIDAD_MAX_CIUDAD=60; //es constante, y no se puede declarar dentro de una clase


    public static final  String COLOR_ROJO="rojo";
    public static final  String COLOR_AMARILLO="amarillo";
    public static final  String COLOR_AZUL="azul";
    public static final  String COLOR_BLANCO="blanco";
    public static final  String COLOR_GRIS="gris";


    //distintas formas de implementar, mediante constructor o mediante gettersetter

    public Automovil(){
        //no hace nada, tan solo nos permite crear un parámetro vacio
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo){
        this();
        this.fabricante= fabricante;
        this.modelo=modelo;
    }

    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante, modelo);
        this.color= color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Estanque estanque, Persona propietario, Rueda[] ruedas, Motor motor) {
        this(fabricante, modelo, color, motor, estanque);
        this.propietario = propietario;
        this.ruedas = ruedas;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.estanque = estanque;
    }


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public static  Color getColorPatente(){
        return colorPatente;
    }
    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }


    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public Estanque getEstanque() {
        if(estanque==null){
            this.estanque = new Estanque(50);
        }

        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil  addRueda(Rueda rueda){
        if(indiceRuedas < this.ruedas.length) { //este if se asegura que como maximo agreaga 5, da igual cuantas ruedas querramos mandar
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Automovil(Persona propietario) {
        this.propietario = propietario;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public String detalle(){
//this se usa para atributo de clase no para atributo local



      String detalle= "\nauto.fabricante = " + this.getFabricante() +
                "\nauto.modelo = " + this.getModelo();
      if(this.getTipo()!=null) {
          detalle += "\nauto.tipo = " + this.getTipo().getDescripcion();
      }
               detalle += "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.motor.getCilindrada() +
                "\nauto.patenteColor= "+ colorPatente +
                "\nauto.id = " + this.id;

      if(conductor != null){
          detalle += "\nConductor Subaru: " + conductor;
      }

      if(getRuedas() != null) {
          for (Rueda r : this.getRuedas()) {
              detalle += "\n" + r.getFabricante() + ", aro: " + r.getAro() + " ancho: " + r.getAncho();
          }
      }
         //el return es importante para devolver ya que no es void
        return  detalle;

    }

    public String acelerar(int rpm){
        return  "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";

    }

    public String frenar(){

        return   this.fabricante + " " + this.modelo + "frenando ";

    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar=this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){

        return km/(porcentajeBencina*estanque.getCapacidad());

    }

    public static float calcularConsumoEstatico(int km, float porcentajeBencina){

        return km/(porcentajeBencina*Automovil.capacidadEstanqueEstatico);

    }

    public float calcularConsumo(int km, int porcentajeBencina){

        return km/((porcentajeBencina/100f)*this.getEstanque().getCapacidad());

    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj){
            return true;
        }

        if(!(obj instanceof Automovil)){
            return false;
        }

        Automovil a=(Automovil) obj; //debremos tener el objeto a tipo Automovil porque siempre comparas mismos tipos
        return (this.fabricante != null && this.modelo != null
        && this.fabricante.equals(a.getFabricante()) && this.modelo.equals((a.getModelo())));
    }

    @Override
    public String toString() {
        return "Automovil{ id " + this.id +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + estanque.getCapacidad() +
                '}';
    }
    //si se tiene dos metodos llamados iguales pero ocn distintos parametro, se denomino "Sobrecarga de Métodos"


    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }
}
