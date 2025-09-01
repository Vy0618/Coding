package AtividadesHerança;

public class ClasseMoto extends ClasseVeiculo {

        int cilindrada;

        public ClasseMoto(String marca, String modelo, String ano, String cor, int cilindrada){
            super(marca, modelo, ano, cor);
            this.cilindrada = cilindrada;
        }

        public void setCilindrada(int cilindrada){this.cilindrada = cilindrada;}
        public int getCilindrada(){return cilindrada;}

    }



