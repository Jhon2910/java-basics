import java.util.Scanner;

class jonathan5{
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("Digite seu salário em (R$):");
      double salario = teclado.nextDouble();
      
      double gratificacao = salario * 0.10;
      
      double imposto = gratificacao * 0.5;
      
      double receber = salario + gratificacao - imposto ;
      
      System.out.printf("O valor a receber é : R$ %.2f ",receber);
      
      teclado.close();
   }
}
