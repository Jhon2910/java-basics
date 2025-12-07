import java.util.Scanner;

public class jonathan24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o coeficiente A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o coeficiente B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o coeficiente C: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b,2) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("X positivo e igual: %.2f", x1);
        System.out.printf("\nX negativo e igual: %.2f", x2);

        sc.close();
    }
}
