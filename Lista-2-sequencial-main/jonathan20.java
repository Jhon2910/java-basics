import java.util.Scanner;

public class jonathan20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero de horas trabalhadas: ");
        double horas = sc.nextDouble();

        System.out.print("Digite o valor do salario minimo(R$): ");
        double salario = sc.nextDouble();

        System.out.print("Digite o numero de horas extras trabalhadas: ");
        double extras = sc.nextDouble();

        double HoraTrabalhada = salario * 0.125;
        double HorasExtras = salario * 0.25;
        double SalarioBruto = horas * HoraTrabalhada;
        double SalarioExtras = extras * HorasExtras;
        double TotalSalario = SalarioBruto + SalarioExtras;

        System.out.printf("O valor a ser pago por hora trabalhada é :R$%.2f ",HoraTrabalhada);
        System.out.printf("\nO valor pago por hora extra é :R$%.2f ",HorasExtras);
        System.out.printf("\nO valor bruto a ser pago é :R$%.2f ",SalarioBruto);
        System.out.printf("\nA quantia a receber por hora extra é :R$%.2f ",SalarioExtras);
        System.out.printf("\nO Salario Total a receber é :R$%.2f ",TotalSalario);

        sc.close();
    }
}
