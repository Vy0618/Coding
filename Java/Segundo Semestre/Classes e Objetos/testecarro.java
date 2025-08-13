public class testecarro {
    public static void main (String[]args){

         class classcarro {

            String modelo;
            int ano;
            public void setModelo(String modelo) {
                this.modelo = modelo;
            }
            public String getModelo() {
                return modelo;
            }
            public void setAno(int ano) {
                this.ano = ano;
            }
            public int getAno(){
                return ano;
            }
        }

        /////////////////////////////////////////////////////////////////////////////

        classcarro carro1 = new classcarro();
        classcarro carro2 = new classcarro();

        carro1.setModelo("Toyota");
        carro1.setAno(1989);
        carro2.setModelo("Chevrolet");
        carro2.setAno(1970);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAno());


    }
}
