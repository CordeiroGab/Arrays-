package Quest03;

import java.util.Scanner;

public class Matriz {

    private int [][] B;
    private int [][] A;

    public void matrizConst() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de linhas da matriz: ");
        int linha = sc.nextInt();

        System.out.print("Número de colunas da matriz: ");
        int coluna = sc.nextInt();




            B = new int[linha][coluna];
            A = new int[linha][coluna];

        System.out.print("Digite os elementos de B: ");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                B[i][j] = sc.nextInt();
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Digite os elementos de A: ");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                A[i][j] = sc.nextInt();
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }


                    }
    public void  multiplicacao() {

        int linhaB = B.length;
        int colunaB = B[0].length;
        int linhaA = A.length;
        int colunaA = A[0].length;

        int[][] resultado = new int[linhaB][linhaA];
        for (int i = 0; i < linhaB; i++) {
            for (int j = 0; j < linhaA; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < linhaA; k++) {
                    resultado[i][j] += B[i][k] * A[k][j];
                }
            }
        }
        System.out.println("Resultado:");
        for (int i = 0; i < linhaB; i++) {
            for (int j = 0; j < linhaA; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }

    }


}







