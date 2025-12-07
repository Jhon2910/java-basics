import java.util.Scanner;

public class jonathan23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pessoas = 3000;

        int novelaA = 1450;
        int novelaB = 1150;
        int novelaC = 900;
        int novelaAB = 350;
        int novelaAC = 400;
        int novelaBC = 300;
        int novelaABC = 100;

        int somenteAB= novelaAB - novelaABC;
        int somenteAC = novelaAC - novelaABC;
        int somenteBC = novelaBC - novelaABC;

        int somenteA = novelaA - novelaAB - somenteAC - novelaABC;
        int somenteB = novelaB - novelaAB - somenteBC - novelaABC;
        int somenteC = novelaC- somenteAC - somenteBC - novelaABC;

        int total = somenteA + somenteB + somenteC + somenteAB + somenteAC + somenteBC + novelaABC;

        int NaoGostam = pessoas- total;

        System.out.println("Pessoas que gostam Apenas da novela A:" + somenteA);
        System.out.println("Pessoas que gostam Apenas da novela B:" + somenteB);
        System.out.println("Pessoas que gostam Apenas da novela C:" + somenteC);
        System.out.println("Pessoas que gostam de A e B:" + somenteAB);
        System.out.println("Pessoas que gostam de A e C:" + somenteAC);
        System.out.println("Pessoas que gostam de B e C:" + somenteBC);
        System.out.println("Total de pessoas que gostam de alguma novela:" +total);
        System.out.println("Total de pessoas que não gostam de nenhuma novela:" +NaoGostam);

        sc.close();
    }
}
