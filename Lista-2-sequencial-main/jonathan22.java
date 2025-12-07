import java.util.Scanner;

public class jonathan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double A = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double B = sc.nextDouble();

        System.out.printf("O valor do primeiro é: %.2f ",A);
        System.out.printf("\nO valor do segundo é: %.2f",B);

        double troca = A;

        A = B ;
        B = troca;

        System.out.printf("\nO primeiro valor agora é: %.2f ",A);
        System.out.printf("\nO segundo valor agora é: %.2f",B);

        sc.close();
    }
}
