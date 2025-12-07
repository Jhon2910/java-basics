import java.util.Scanner;
    class jonathan12 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Caminhada em (km): ");
            double km = teclado.nextDouble();

            System.out.print("Medida da rua A (em metros): ");
            double a = teclado.nextDouble();

            System.out.print("Medida da rua B (em metros): ");
            double b = teclado.nextDouble();

            double kmconvertido = km * 1000;

            double tamanhoDoQuarteirao = a + b ;
            double voltas =kmconvertido / tamanhoDoQuarteirao ;
            System.out.printf("Dona Maria das Couve terá que dar %.2f voltas para completar a meta.", voltas);
        }
}
