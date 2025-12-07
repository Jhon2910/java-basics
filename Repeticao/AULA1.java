import java.util.Scanner;

public class repeticao {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //Escrever na tela 100 vezes "Eu preciso estudadar"

        int quantidade = 1 ;

        System.out.print("Quantas vezes ?");
        int N = sc.nextInt();

        while (quantidade <= N){
            System.out.println(quantidade + " Eu preciso estudar mais!");
            quantidade = quantidade + 1;
        }
    }
}
