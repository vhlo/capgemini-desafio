import java.util.Scanner;

public class questao1 {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Valor de entrada:"); //cria um scanner para pedir o valor de entrada
        int n = myObj.nextInt();

        ValidaTriangulo2(n);
    }

    public static void ValidaTriangulo2(int n) {
        int i, j;
        for (i = 0; i < n; i++) {//Trabalho de loop externo para linhas
            for (j = 2 * (n - i); j >= 0; j--) {//loop interno funciona por espaço
                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {//loop interno para colunas
                System.out.print("* ");
            }

            System.out.println();//joga o cursor em uma nova linha após imprimir cada linha
        }
    }


}