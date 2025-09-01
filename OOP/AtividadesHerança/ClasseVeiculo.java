package AtividadesHerança;

public class ClasseVeiculo {


    public ClasseVeiculo(String marca, String modelo, String ano, String cor){
     this.marca = marca;
     this.modelo = modelo;
     this.ano = ano;
     this.cor = cor;
    }


        private String marca, modelo, ano, cor;


        //getters e setters

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

