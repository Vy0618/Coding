import java.util.Scanner;
public class objetoFuncionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        class funcionario{
           int dataadmissao;
           int datademissao;
           int telefone;
           String email;
           int datanascimento;
           String nivelescolaridade;
           char sexo;
           String endereco;
           int cpf;
           String nome;
           int debug;

            public void setDebug(int debug) {
                this.debug = debug;
            }

            public int getDebug() {
                return debug;
            }

            public void setDataadmissao(int dataadmissao) {
                this.dataadmissao = dataadmissao;
            }
            public int getDataadmissao() {
                return dataadmissao;
            }
            public void setDatademissao(int datademissao) {
                this.datademissao = datademissao;
            }
            public int getDatademissao() {
                return datademissao;
            }
            public void setTelefone(int telefone) {
                this.telefone = telefone;
            }
            public int getTelefone() {
                return telefone;
            }
            public void setEmail(String email) {
                this.email = email;
            }
            public String getEmail() {
                return email;
            }
            public void setDatanascimento(int datanascimento) {
                this.datanascimento = datanascimento;
            }
            public int getDatanascimento() {
                return datanascimento;
            }
            public void setNivelescolaridade(String nivelescolaridade) {
                this.nivelescolaridade = nivelescolaridade;
            }
            public String getNivelescolaridade() {
                return nivelescolaridade;
            }
            public void setSexo(char sexo) {
                this.sexo = sexo;
            }
            public char getSexo() {
                return sexo;
            }
            public void setEndereco(String endereco) {
                this.endereco = endereco;
            }
            public String getEndereco() {
                return endereco;
            }
            public void setCpf(int cpf) {
                this.cpf = cpf;
            }
            public int getCpf() {
                return cpf;
            }
            public void setNome(String nome) {
                this.nome = nome;
            }
            public String getNome() {
                return nome;
            }

        }

funcionario funcionario1 = new funcionario();
       




    }
}