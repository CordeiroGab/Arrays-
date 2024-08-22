package Quest05;

import java.util.Scanner;

public class Calculadora {


    public void calculadora() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int num = sc.nextInt();

        if (num <= -1) {
            System.out.println("O número não pode ser negativo");
        } else {
            System.out.print("Resultado:" + calculo(num));


        }

    }

    private static int calculo(int num) {

        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }

        else {
            return calculo(num - 1) + calculo(num - 2);
        }
    }
}




