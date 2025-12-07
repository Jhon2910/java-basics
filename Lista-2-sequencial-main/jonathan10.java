import java.util.Scanner;

  class jonathan10{
      public static void main (String[]args){
          Scanner teclado = new Scanner(System.in);

          System.out.print("Digíte o depósito : ");
          double c = teclado.nextDouble();

          System.out.print("Digíte a porcenagem : ");
          double i = teclado.nextDouble();
          double porcentagem = i / 100 ;

          System.out.print("Digíte a quantidade de anos : ");
          double n = teclado.nextDouble();

          double m = c * (1 + porcentagem) * n;
          System.out.printf("Seu depósito foi : R$%.2f%nA porcentagem é : %.2f%nO tempo (em anos é): %.2f%nO total acumulado é de : R$%.2f",c,porcentagem,n,m);

          teclado.close();
      }
  }
