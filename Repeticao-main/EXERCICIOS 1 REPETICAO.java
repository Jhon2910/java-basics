/*EXERCICIO

  1) P.A.Q imprima aa sequencia abaixo 
     -> 1; 2; 3; 4; 5; 6; ... N;

*/

import java.util.Scanner;

public class repeticao {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


        int quantidade = 1 ;

        System.out.print("Quantas vezes ?");
        int N = sc.nextInt();

        while (quantidade <= N){
            System.out.println(quantidade);
            quantidade = quantidade + 1;
        }
    }
}

*/
  /*
  2)idem 1.
  1;3;5;7; N
  */

  import java.util.Scanner;

public class repeticao {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


        int quantidade = 1 ;

        System.out.print("Quantas vezes ?");
        int N = sc.nextInt();

        while (quantidade <= N){
            System.out.println(quantidade);
            quantidade = quantidade + 2;
        }
    }
}
  
  */
