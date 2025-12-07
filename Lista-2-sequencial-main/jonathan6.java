import java.util.Scanner;

class jonathan4 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("Digite o salário fixo : R$ ");
      double salario = teclado.nextDouble();
      
      double comissao = salario * 0.04;
      
      double salarioBruto = salario + comissao;
      
      System.out.printf("O valor a receber é: R$ %.2f:" ,salarioBruto);
      
      teclado.close();
   }
}
