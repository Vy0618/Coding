package metodosAtividade;

class Carro{
    private String placa;
    private int numeroChassi;

    public Carro(String placa){
        this.placa = placa;

    }
    public Carro(int numeroChasshi){
        this.numeroChassi = numeroChassi;
    }

    public Carro(String placa, int numeroChassi){
        this.placa = placa;
        this.numeroChassi = numeroChassi;
    }



    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(int numeroChassi) {
        this.numeroChassi = numeroChassi;
    }
}




public class MetodoCarro{
    public static void main (String[]args){
        Carro carro1 = new Carro("cum69");
        Carro carro2 = new Carro("cic3301", 1243);




        System.out.println(carro1.getPlaca() + " // " + carro1.getNumeroChassi());
        System.out.println(carro2.getPlaca() + " // " + carro2.getNumeroChassi());



    }
}

