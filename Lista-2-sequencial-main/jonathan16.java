import java.util.Scanner;

public class jonathan16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o(s) minito(s): ");
        int min = sc.nextInt();
        int hora = min / 60;
        int minuto = min % 60;

        if (min < 0) {
            System.out.print("Digite um valor positivo!");
        } else {
            System.out.printf("Sao %d horas e %d minutos", hora, minuto);
        }
        sc.close();
    }
}
