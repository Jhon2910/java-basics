import java.util.Scanner;

class jonathan8 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("Digite o valor da base maior (em metros): ");
      double baseM = teclado.nextDouble();

      System.out.print("Digite o valor da base menor (em metros): ");
      double basem = teclado.nextDouble();

      System.out.print("Digite o valor da altura (em metros): ");
      double altura = teclado.nextDouble();

      System.out.print("Digite o valor do metro quadrado (em R$): ");
      double ValormetroQuadrado = teclado.nextDouble();

      double area = ((baseM + basem) / 2) * altura;
      double preco = area * ValormetroQuadrado;

      System.out.printf("O valor da area é : %.2fm²%nO valor médio de venda é : R$%.2f", area,preco);
      
      teclado.close();
   }
}
