
public class ExEndereco {
    public static void main(String[] args) {

        endereco endereco1 = new endereco(2131321, 133, "314-3123" );
        endereco endereco2 = new endereco(42131, "Sorocaba", "Santa Rosalia", 30, "Próximo a praça Roberto Manuel" );

        System.out.println("Endereço 1: " + endereco1.getId() + ";\n" + endereco1.getNumero() + ";\n" + endereco1.getCep());
        System.out.println("Endereço 2: " + endereco2.getId() + ";\n" + endereco2.getCidade() + ";\n" + endereco2.getBairro() + ";\n" + endereco2.getNumero()+ ";\n" + endereco2.getComplemento() + "." );

    }
}

class endereco{
    private int id;
    private int numero;
    private String logradouro, complemento, bairro, cidade, cep, uf;

    public endereco(int id, int numero, String cep){
        this.id = id;
        this.numero = numero;
        this.cep = cep;
    }
    public endereco(int id, String cidade, String bairro, int numero, String complemento){
        this.id = id;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}





