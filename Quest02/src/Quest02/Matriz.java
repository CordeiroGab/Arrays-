package Quest02;

import java.util.Random;

public class Matriz {

   public int N,M;
   private int[][] matriz;
   private Random random = new Random();


   public Matriz(int N, int M){
       this.N = N;
       this.M = M;
       this.matriz = new int[N][M];

   }

   public void ValoresDaMatriz(){
       for (int i = 0; i < N; i++) {
           for (int j = 0; j < M; j++) {
               matriz[i][j]=random.nextInt(100);
           }
       }

   }
   public void MatrizOriginal(){

       System.out.println("Matriz");

       for (int i = 0; i < N; i++) {
           for (int j = 0; j < M; j++) {
               System.out.print(matriz[i][j] + " ");
           }
           System.out.println();
       }
   }

   public void perimetro(){

       System.out.println("Matriz mostrada");

       for (int i = 0; i < N; i++) {
           for (int j = 0; j < M; j++) {
               if(i == 0|| i == N - 1 || j == 0||j == M - 1){
                  System.out.print(matriz[i][j]+ " ");
               }else {
               System.out.print("-  ");
           }

       }
           System.out.println();
   }



}
}



