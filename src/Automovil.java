public class Automovil{
    //estos son atributos, no métodos

    String fabricante;
    String modelo;
    String color = "red";
    double cilindrada;


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
}
