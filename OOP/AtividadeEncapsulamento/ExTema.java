import java.util.Locale;

public class ExTema {
    public static void main (String[]args){

        tema tema1 = new tema(124123, "Item Raro", "Vermleho", 143.33);

        System.out.println("Obj 1: " + "\n " + tema1.getId() + "\n " + tema1.getNome() + "\n " + tema1.getCor() + "\n " + tema1.getValorAluguel() );



    }
}

class tema{
    private long id;
    private String nome, cor;
    private double valorAluguel;

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;

    }

    public tema(long id, String nome, String cor, double valorAluguel){
        this.id = id;
        this.nome = nome;
        this.cor = cor;
        this.valorAluguel = valorAluguel;

    }
}