package Quest02;

public class Main {

    public static void main(String[] args) {

        int N = 3;
        int M = 5;

        Matriz matriz;
        matriz = new Matriz(N,M);
        matriz.ValoresDaMatriz();
        matriz.MatrizOriginal();
        matriz.perimetro();
    }
}
