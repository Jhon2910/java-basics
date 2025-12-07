import java.util.Scanner;

public class jonathan {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero positivo : ");
        int n = sc.nextInt();
        int h = 1;
        int i,soma;

        while (h <= n){
            soma = h ++;
            i = 1;
            if (h == n){
                System.out.printf(" ");
            }
            else if (soma > 2){
                System.out.printf(" - %d/%d + %d/%d",i,soma,i,(soma + 1));
            }
            else {
                System.out.print("h = ");
                System.out.printf("1 - %d/%d + %d/%d",i,h,i,soma);
            }
            h++; //quase la
        }

    }
}
