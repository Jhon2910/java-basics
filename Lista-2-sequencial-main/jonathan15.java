import java.util.Scanner;

public class jonathan15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do raio:");
        double raio = sc.nextDouble();
        double raioAoQuadrado = Math.pow(raio, 2);
        double area = 3.1416 * (raioAoQuadrado);

        if (raio <0){
            System.out.println("Digite um valor positivo!");
        }
        else {
            System.out.printf("A area da circumferencia é: %.2f",area);
        }
        sc.close();
    }
}
