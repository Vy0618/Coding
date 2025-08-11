public class objectPessoa {
    public static void main(String[] args) {
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
