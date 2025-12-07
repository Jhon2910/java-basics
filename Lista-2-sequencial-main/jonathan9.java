import java.util.Scanner;

class jonathan9 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      System.out.print("Digite o numero de lados do poligono: ");
      int lados = teclado.nextInt();

      int diagonais = lados * (lados - 3)/2 ;

      System.out.printf("O número de diagonais é: %d", diagonais);
      
      teclado.close();
   }
}
