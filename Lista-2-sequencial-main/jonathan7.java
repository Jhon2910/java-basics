import java.util.Scanner;

class jonathan7 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("Digite o valor da altura do retângulo em (metros): ");
      double altura = teclado.nextDouble();
      
      System.out.print("Digite o valor da base do retângulo em (metros): ");
      double base = teclado.nextDouble();
      
      double area = altura * base;
      double perimetro = altura * 2 + base * 2 ;
      
      System.out.printf("A area do retângulo é: %.2f m²%nO perimetro é: %.2f m", area,perimetro);
      
      teclado.close();
   }
}
