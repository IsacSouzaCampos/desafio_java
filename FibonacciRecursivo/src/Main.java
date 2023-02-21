import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("*** Sequência de Fibonacci ***\n");

        while(true) {
            try {
                System.out.print("Posição: ");
                int position = in.nextInt();

                if(position < 0) {
                    System.out.println("A posição informada deve ser um valor positivo!\n");
                    continue;
                }

                System.out.println("O valor da posição " + position + " é: " + Fibonacci(position));
                break;

            } catch (Exception e) {
                System.out.println("Informe um valor inteiro para a posição!\n");
                in.nextLine();
            }
        }
    }

    public static int Fibonacci(int num) {
        if(num == 0) {
            return 0;
        } else if(num == 1 || num == 2) {
            return 1;
        }

        return Fibonacci(num - 1) + Fibonacci(num - 2);
    }
}