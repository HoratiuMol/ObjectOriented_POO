public class Automovil{
    //estos son atributos, no métodos

    private String fabricante;
    private String modelo;
    private String color = "red";
    private double cilindrada;
    private int capacidadEstanque=40;


    //distintas formas de implementar, mediante constructor o mediante gettersetter

    public Automovil(String fabricante, String modelo){
        //no hace nada, tan solo nos permite crear un parámetro vacio
    }

    public Automovil(String fabricante, String modelo, String color){
        this(fabricante, modelo);
        this.color= color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public String detalle(){
//this se usa para atributo de clase no para atributo local

      return "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilindrada = " + this.cilindrada;
         //el return es importante para devolver ya que no es void

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

        return km/(porcentajeBencina*capacidadEstanque);


    }

    public float calcularConsumo(int km, int porcentajeBencina){

        return km/((porcentajeBencina/100f)*capacidadEstanque);

    }

    //si se tiene dos metodos llamados iguales pero ocn distintos parametro, se denomino "Sobrecarga de Métodos"
}
