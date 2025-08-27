package metodosAtividade;

public class MetodoAnimal{
    public static void main (String[]args){
        Animal animal1 = new Animal("Grande", "preto",20);
        Animal animal2 = new Animal("pequeno");


        System.out.println("Animal 1: " + animal1.getPorte() + " e cor " + animal1.getCor() );
        System.out.println("Animal 2: " +animal2.getPorte());

    }
}



class Animal{
    private String porte;
    private String cor;
    private int peso;

    public Animal(String porte, String cor, int peso){
        this.porte = porte;
        this.cor = cor;
        this.peso = peso;
    }



    public Animal(String porte){
        this.porte = porte;
    }
    public Animal(int peso){
        this.peso = peso;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }




}