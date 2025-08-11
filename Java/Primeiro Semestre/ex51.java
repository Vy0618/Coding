import java.util.Random;
public class ex51
{
    public static void main(String[] args) {
        int[] num = new int [10];
        Random numero = new Random();
        int numMaior = 0;
        int numMenor = 0 ;
        int totalN = 0;

        for (int i = 0; i < num.length ; i++){
            num[i]= numero.nextInt(100);
            System.out.println("o "+ i +" º numero é de: "+ num[i]);
            totalN += num[i];
            if(num[i] < numMenor){
                numMenor = num[i];
            } else if(num[i] > numMaior){
                numMaior = num[i];
            }

        }
        double media = totalN / 10;
        System.out.println("o maior numero é: " + numMaior);
        System.out.println("o menor numero é: " + numMenor);
        System.out.println("a media é de: " + media);


    }
}