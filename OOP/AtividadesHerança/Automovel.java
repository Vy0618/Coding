package AtividadesHerança;

public class Automovel extends ClasseVeiculo {
    String numeroPortas;
    String motor;

    public void setNumeroPortas(String numeroPortas){this.numeroPortas = numeroPortas;}
    public String getNumeroPortas(){return numeroPortas;}

    public String getMotor() {return motor;}

    public void setMotor(String motor) {this.motor = motor;}

    public Automovel(String marca, String modelo, String ano, String numeroPortas, String motor, String cor){
        super(marca,modelo, ano, cor);
      this.numeroPortas = numeroPortas;
      this.motor = motor;
    }
}
