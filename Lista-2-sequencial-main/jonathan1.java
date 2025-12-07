import java.util.Scanner;

class jonathan1{
   
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("Digíte o primeiro valor:");
      double num1 = teclado.nextDouble();
      
      System.out.print("Digíte o segundo valor:");
      double num2 = teclado.nextDouble();
      
      double soma = num1 + num2;
      
      double media = soma / 2;
      System.out.printf("A média dos números é : %.2f",media);
      
      teclado.close();
   }
}
