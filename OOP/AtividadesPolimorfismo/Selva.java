package AtividadesPolimorfismo;

public class Selva {
    public static void main(String[] args) {

        Lobo lobo = new Lobo("Sif", "m","Cinzento");
        lobo.emitirSom();
        Leao leao = new Leao("Scarface", "m", "Leao Africano");
        leao.emitirSom();

    }
}
