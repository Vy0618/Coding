public class objetoPaciente {
    public static void main(String[] args) {

        class paciente{
            int telefone;
            String email;
            int datanascimento;
            String nivelescolaridade;
            char sexo;
            String endereco;
            int cpf;
            String nome;


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




    }
}
