import java.util.Scanner;

public class jonathan19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero positivo: ");
        double n = sc.nextDouble();

        if (n <= 0){
            System.out.print("digite apenas numeros positivos: ");
        }
        else {
            double quadrado = Math.pow(n, 2);
            double cubo = Math.pow(n, 3);
            double RaizQuadrada= Math.sqrt(n);
            double RaizCubica = Math.cbrt(n);

            System.out.printf("O numero %.2f elevado ao quadrado e: %.2f",n,quadrado);
            System.out.printf("\nO numero %.2f elevado ao cubo e: %.2f",n,cubo);
            System.out.printf("\nA raiz quadrada e: %.2f", RaizQuadrada);
            System.out.printf("\nA raiz cubica e: %.2f", RaizCubica);
        }

        sc.close();
    }
}
