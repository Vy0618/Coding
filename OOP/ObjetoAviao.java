import java.util.Scanner;
public class ObjetoAviao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        class Aviao{
            String tipo;
            String cor;
            int velocidade;
            int qntdAssentos;

            public void setTipo(String tipo){
                this.tipo = tipo;
            }

            public String getTipo() {
                return tipo;
            }

            public void setCor(String cor){
                this.cor = cor;
            }
            public String getCor(){
                return cor;
            }

            public void setVelocidade(int velocidade){
                this.velocidade = velocidade;
            }

            public int getVelocidade() {
                return velocidade;
            }

            public void setQntdAssentos(int qntdAssentos) {
                this.qntdAssentos = qntdAssentos;
            }

            public int getQntdAssentos() {
                return qntdAssentos;
            }
        }


        System.out.println("Entre com o tipo de avião: ");//]
        String tipo = scan.nextLine();
        System.out.println("Entre com a cor do avião: ");
        String cor = scan.nextLine();
        System.out.println("Entre com a velocidade do avião: ");
        int velocidade = scan.nextInt();
        System.out.println("Entre com a quantidade de assento: ");
        int qntdAssentop = scan.nextInt();

        Aviao Aviao1 = new Aviao();

        Aviao1.setTipo(tipo);
        Aviao1.setCor(cor);
        Aviao1.setVelocidade(velocidade);
        Aviao1.setQntdAssentos(qntdAssentop);


        System.out.println("Modelo: " + Aviao1.getTipo());
        System.out.println("Cor: " + Aviao1.getCor());
        System.out.println("Velocidade: " + Aviao1.getVelocidade() + " Km/h");
        System.out.println("Quantidade de Assentos: " + Aviao1.getQntdAssentos());





        }
    }
