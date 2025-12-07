import java.util.Scanner;

class jonathan11 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double salario = teclado.nextDouble();

        System.out.print("Digite o valor da conta1 :");
        double conta1 = teclado.nextDouble();

        System.out.print("Digite o valor da conta2 :");
        double conta2 = teclado.nextDouble();

        double juros = (conta1 + conta2) * 0.02;
        double resto = salario - juros - conta1 - conta2 ;

        System.out.printf("O restante do seu salário e : %.2f\n", resto);
        teclado.close();
    }
}
