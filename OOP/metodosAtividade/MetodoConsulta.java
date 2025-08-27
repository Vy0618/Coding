package metodosAtividade;

import org.w3c.dom.CDATASection;

import java.util.Date;

public class MetodoConsulta{
    public static void main (String[]args){
        Date data = new Date(125,9,13);
        Consulta consulta1 = new Consulta(data,"DR. Estranho", "Paciente Doente");
        Consulta consulta2 = new Consulta("Dr. Ruim");
        System.out.println("Consulta 1:");
        System.out.println(consulta1.getData());
        System.out.println(consulta1.getNomeDentista());
        System.out.println(consulta1.getNomePaciente());
        System.out.println('\n');
        System.out.println("Consulta 2:");
        System.out.println(consulta2.getNomeDentista());
    }
}

class Consulta{
    private Date data;
    private String nomeDentista;
    private String nomePaciente;

    public Consulta(Date data, String nomeDentista, String nomePaciente){
        this.data = data;
        this.nomeDentista = nomeDentista;
        this.nomePaciente = nomePaciente;
    }
    public Consulta(String nomeDentista){
        this.nomeDentista = nomeDentista;

    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomeDentista() {
        return nomeDentista;
    }

    public void setNomeDentista(String nomeDentista) {
        this.nomeDentista = nomeDentista;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
}
