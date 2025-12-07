import java.util.Scanner;

class jonathan4 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("Digíte o primeiro valor: ");
      double num1 = teclado.nextDouble();
      
      System.out.print("Digíte o primeiro peso: ");
      double peso1 = teclado.nextDouble();

      System.out.print("Digíte o segundo valor: ");
      double num2 = teclado.nextDouble();
      
      System.out.print("Digíte o segundo peso: ");
      double peso2 = teclado.nextDouble();

      System.out.print("Digíte o terceiro valor: ");
      double num3 = teclado.nextDouble();
      
      System.out.print("Digíte o terceiro peso : ");
      double peso3 = teclado.nextDouble();

      double SomaValorPeso = num1 * peso1 + num2 * peso2 + num3 * peso3;
      double peso = peso1 + peso2 + peso3;
      double media = SomaValorPeso / peso;
      
      System.out.printf("A média ponderada é: %.2f" ,media);
      
      teclado.close();
   }
}
