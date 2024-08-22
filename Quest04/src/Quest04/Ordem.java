package Quest04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ordem {

    public void ordenar() {

        Scanner sc = new Scanner(System.in);


        System.out.print("Número de linhas da matriz: ");
        int linhas = sc.nextInt();

        System.out.print("Número de colunas da matriz: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.print("Número Manual (1)\nNúmero aleatório (2) ");
        int esc = sc.nextInt();
        if (esc == 1) {
            manualMatriz(matriz,sc);
        } else if (esc == 2) {
            aleatoriaMatriz(matriz);

        }else {
            System.out.print("Número invalido");
            return;
        }
        System.out.print("Crescente(1)\nDecrescente(2)\n ");
        int ord = sc.nextInt();
        System.out.println("_________________");
        System.out.println("Matriz:");
        exibir(matriz);
        System.out.println("_________________");

        if (ord == 1) {
            ordenarMatriz(matriz,true);
        }else if (ord == 2) {
            ordenarMatriz(matriz,false);
        }
        {
        }
        System.out.println("_________________");
        System.out.println("Matriz Ordenada:");
        exibir(matriz);
        System.out.println("_________________");
    }

    private static void manualMatriz(int[][] matriz, Scanner sc) {
        System.out.println("Dígite os números: ");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                matriz[linha][coluna] = sc.nextInt();
            }
        }
    }
    private static void aleatoriaMatriz(int[][] matriz) {
        Random r = new Random();

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                matriz[linha][coluna] = r.nextInt(100);

            }
        }
   }
   private static void exibir(int[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
             System.out.println();
        }
   }
   private static void ordenarMatriz(int[][] matriz, boolean crescente) {
        int[] lista = new int[matriz.length * matriz[0].length];
        int index= 0;

        for(int [] linha : matriz){
            for(int numb : linha){
                lista[index++] = numb;
            }
        }
       Arrays.sort(lista);
        if(!crescente){
            for(int i = 0; i < lista.length/2; i++){
                int desc = lista[i];
                lista[i] = lista[lista.length - i - 1];
                lista[lista.length - i - 1] = desc;
            }

        }
        index = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = lista[index++];
            }
        }


   }

}


