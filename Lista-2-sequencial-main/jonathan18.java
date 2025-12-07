import java.util.Scanner;

public class jonathan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salario minimo em (R$):");
        double salario = sc.nextDouble() ;

        System.out.print("Digite o valor de quillowatts consumido: ");
        double KW = sc.nextDouble();

        double ValorPorKW = salario/5;

        double total = ValorPorKW * KW;

        double descontoFinal = total * 0.85;

        System.out.printf("O valor a ser pago por quillowatt é: R$%.2f ", ValorPorKW);
        System.out.printf("\nO valor total do consumo do quillowatt é: R$%.2f", total);
        System.out.printf("\nO valor a ser pago com o desconto é: R$%.2f ", descontoFinal);

        sc.close();
    }
}
