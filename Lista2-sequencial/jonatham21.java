import java.util.Scanner;

public class jonathan21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida do ângulo: ");
        double angulo = sc.nextDouble();

        System.out.print("Digite a altura da parede: ");
        double altura = sc.nextDouble();

        double radianos = Math.toRadians(angulo);

        double medida = (altura / Math.sin(radianos));

        System.out.printf("A a medida da escada para que a ponta da parede possa ser alcançada é: %.2f\n", medida);

        sc.close();
    }
}
