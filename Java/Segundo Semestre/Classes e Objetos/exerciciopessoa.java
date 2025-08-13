public class exerciciopessoa {
    public static void main(String[] args) {

        //parecia magia da primeira vez que vi isso em aula. estudando agora em casa, isso é ridiculamente fácil.
        //com certeza me darei mal no processo de replicar esse exercício no papel, apesar de agora entender
        //como funciona.

        class classPessoa {
            String Nome;
            int Idade;
            String Endereco;
            String Profissao;

            public String getNome() {
                return Nome;
            }
            public void setNome(String Nome){
                this.Nome = Nome;
            }


            public int getIdade(){
                return Idade;
            }
            public void setIdade(int Idade){
                this.Idade = Idade;
            }


            public String getEndereco(){
                return Endereco;
            }

            public void setEndereco(String Endereco){
                this.Endereco = Endereco;
            }
            public String getProfissao(){
                return Profissao;
            }
            public void setProfissao(String Profissao){
                this.Profissao = Profissao;
            }


        }
        classPessoa pessoa1 = new classPessoa();
        classPessoa pessoa2 = new classPessoa();

        //obj1

        pessoa1.setNome("Tom Cruise");
        pessoa1.setIdade(60);
        pessoa1.setEndereco("Cali");
        pessoa1.setProfissao("Ator");

        //obj2
        pessoa2.setNome("Messi");
        pessoa2.setIdade(35);
        pessoa2.setEndereco("Miami");
        pessoa2.setProfissao("Ator");

        System.out.println("---------- OBJ1 ----------");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getEndereco());
        System.out.println(pessoa1.getProfissao());

        System.out.println("---------- OBJ2 ----------");
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getEndereco());
        System.out.println(pessoa2.getProfissao());
    }
}
