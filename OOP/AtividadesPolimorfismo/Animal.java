package AtividadesPolimorfismo;

public class Animal {
    public String nome, sexo, raca;

    public Animal(String nome, String sexo, String raca){
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
    }

    public void dormir(){
        System.out.println("Dormindo");
    }
    public void caminhar(){
        System.out.println("Caminhando");
    }
    public void correr(){
        System.out.println("Correndo");
    }
    public void emitirSom(){
        System.out.println("Emitindo");
    }



}
