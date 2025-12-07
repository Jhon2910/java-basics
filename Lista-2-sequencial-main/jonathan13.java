import java.util.Scanner;

public class jonathan13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int AnoDeInicio = 1930;
        int AnoDoCancelamento1 = 1942;
        int AnoDoCancelamento2 = 1946;
        
        System.out.print("Digite o ano atual: ");
        int anoAtual = teclado.nextInt();
        
        int numeroDeCopas = (anoAtual-AnoDeInicio)/4+1;

        if(anoAtual < AnoDeInicio){
            System.out.print("Nao ouve Copa do Mundo neste periodo");
        }
        else if(anoAtual >= AnoDoCancelamento2){
            System.out.printf("Até o ano de %d foram realzadas %d Copas do Mundo.", anoAtual, numeroDeCopas - 2);
        }
        else if (anoAtual >= AnoDoCancelamento1) {
            System.out.printf("Até o ano de %d foram realzadas %d Copas do Mundo.", anoAtual, numeroDeCopas - 1);
        }
        else {
            System.out.printf("Até o ano de %d foram realzadas %d Copas do Mundo.", anoAtual, numeroDeCopas);
        }
        teclado.close();
    }
}
