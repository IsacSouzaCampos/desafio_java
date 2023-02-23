import java.util.Arrays;
import java.util.List;
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
                    result = recursiveFibonacci(position).get(1);
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

    public static List<Integer> recursiveFibonacci(int position) {
        List<Integer> list = Arrays.asList(new Integer[2]);
        if(position == 0) {
            list.set(1, 0);
            return list;
        } else if(position == 1) {
            list.set(0, 0);
            list.set(1, 1);
            return list;
        }

        list = recursiveFibonacci(position - 1);
        int temp = list.get(0);
        list.set(0, list.get(1));
        list.set(1, temp + list.get(1));

        return list;
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