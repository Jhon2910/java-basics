import java.util.Scanner;

public class jonathan14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o a largura: ");
        double largura = sc.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble() ;
        double area = (largura * altura);
        double watz = area * 18;

        if (area <= 0) {
            System.out.print("Digite um numero positivo!");
        }
        else {
            System.out.printf("Sua casa tem %.2f m² e gasta %.2f W.", area, watz);
        }

        sc.close();
    }
}
