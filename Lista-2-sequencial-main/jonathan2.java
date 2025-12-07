import java.util.Scanner;

public class jonathan2{
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("Digíte o valor:");
      int num1 = teclado.nextInt();
      
      int antecessor = num1 - 1;
      
      int sucessor = num1 + 1;
      
      System.out.printf("sucessor: %d",sucessor);
      System.out.printf("\nantecessor: %d",antecessor);
      
      teclado.close();
   }
}
