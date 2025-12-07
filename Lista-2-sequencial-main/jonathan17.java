import java.util.Scanner;

public class jonathan17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Diigite um numero com casas dicimais: ");
        double num = sc.nextDouble();
        int inteiro = (int) num;
        double fracionaria = num - inteiro;

        System.out.printf("A parte inteira do numero %.2f é %d e a parte fracionaria é %.2f.",num,inteiro,fracionaria);
        sc.close();
    }
}
