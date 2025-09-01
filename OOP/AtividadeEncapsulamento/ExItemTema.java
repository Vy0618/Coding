public class ExItemTema {
    public static void main (String args[]){


        itemTema item1 = new itemTema(413413, "Chapéu de Aniversário", "Chapéu cônico feito de papelão");
        itemTema item2 = new itemTema("Chapéu de Palha", "Chapéu caipira feito de palha");

        System.out.println("Item 1: " + item1.getId() +"\n" + item1.getNome() +"\n" + item1.getDescricao() +"\n");
        System.out.println("Item 2: " + item2.getNome() +"\n" + item2.getDescricao());

    }
}

class itemTema{
    private long id;
    private String nome;
    private String descricao;



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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }
    public itemTema(long id, String nome, String descricao){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;

    }
    public itemTema(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;

    }
}