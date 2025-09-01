public class ExCliente {
    public static void main(String[]args){

        cliente cliente1 = new cliente(13123, "Pedro", "(15)9999-9999","13513.431413-12","55.51334.3413");

        System.out.println("Cliente 1:" + "\n" + cliente1.getId() + "\n" + cliente1.getNome() + "\n" + cliente1.getTelefone() + "\n" + cliente1.getCpf() + "\n" + cliente1.getRg() );

    }
}

class cliente{
    private long id;
    private String nome, telefone, cpf, rg;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public cliente(long id, String nome, String telefone, String cpf, String rg){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
    }

}