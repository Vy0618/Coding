import java.util.Scanner;
public class ObjetoConvenio {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);



        class Convenio {

    String nome;
    String plano;
    Double tarifa;


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
public void setPlano(String plano){
        this.plano = plano;
}
public String getPlano(){
       return plano;
}
public void setTarifa(Double tarifa){
        this.tarifa = tarifa;
}

    public Double getTarifa() {
        return tarifa;
    }
}

Convenio convenio1 = new Convenio();

        System.out.println("Entre com o nome do cliente: ");
        String nome = scan.nextLine();
        System.out.println("Entre com o nome do plano: ");
        String nomePlano = scan.nextLine();
        System.out.println("Entre com a tarifa do plano: ");
        Double tarifa = scan.nextDouble();

        convenio1.setNome(nome);
        convenio1.setPlano(nomePlano);
        convenio1.setTarifa(tarifa);

        System.out.println("Nome do cliente: " + convenio1.getNome());
        System.out.println("Nome do plano: " + convenio1.getPlano());
        System.out.println("Tarifa do plano: R$" + convenio1.getTarifa());


    }
}
