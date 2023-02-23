import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("*** Sequência de Fibonacci ***\n");

        int type = getFibonacciType();

        while(true) {
            try {
                System.out.print("Posição: ");
                int position = in.nextInt();

                if(position < 0) {
                    System.out.println("A posição informada deve ser um valor positivo!\n");
                    continue;
                }

                int result;
                if(type == 1) {
                    System.out.println("\nFibonacci Recursivo");
                    result = recursiveFibonacci(position);
                } else {
                    System.out.println("\nFibonacci Linear");
                    result = linearFibonacci(position);
                }

                System.out.println("O valor da posição " + position + " é: " + result);
                break;

            } catch (Exception e) {
                System.out.println("Informe um valor inteiro para a posição!\n");
                in.nextLine();
            }
        }
    }

    public static int getFibonacciType() {
        Scanner in = new Scanner(System.in);
        int type;

        while(true) {
            try {
                System.out.println("Deseja rodar a versão Recursiva ou Linear?");
                System.out.print("[1] Recursiva\n[2] Linear\n\nOpção: ");
                type = in.nextInt();

                if(type < 1 || type > 2) {
                    System.out.println("Informe um tipo válido!");
                    continue;
                }

                break;
            } catch (Exception e) {
                System.out.println("Informe um tipo válido!");
                in.nextLine();
            }
        }
        return type;
    }

    public static int recursiveFibonacci(int num) {
        if(num == 0) {
            return 0;
        } else if(num == 1 || num == 2) {
            return 1;
        }

        // Seguindo a fórmula (Fn = Fn-1 + Fn-2)
        return recursiveFibonacci(num - 1) + recursiveFibonacci(num - 2);
    }

    public static int linearFibonacci(int position) {
        if(position == 0) {
            return 0;
        } else if(position == 1 || position == 2) {
            return 1;
        }

        double sqrt5 = Math.sqrt(5);
        double v1    = Math.pow((1 + sqrt5) / 2, position);
        double v2    = Math.pow((1 - sqrt5) / 2, position);
        double result = (v1 - v2) / sqrt5;

        return (int) result;
    }
}