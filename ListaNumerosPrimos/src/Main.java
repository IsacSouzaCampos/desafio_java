import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("*** Lista de Números Primos ***\n");

        int type = getListPrimeNumbersType();

        while(true) {
            try {
                System.out.print("Listar primos até o número: ");
                int num = in.nextInt();

                if(num < 1) {
                    System.out.println("O número informado deve ser maior que zero!\n");
                    continue;
                }

                List<Integer> result;
                if(type == 1) {
                    System.out.println("\nListagem Recursiva");
                    result = listPrimeNumbersRecursive(num);
                } else {
                    System.out.println("\nListagem Linear");
                    result = listPrimeNumbersLinear(num);
                }

                Collections.sort(result);
                System.out.println("A lista de primos até o número " + num + " é: " + result);
                break;

            } catch (Exception e) {
                System.out.println("Informe um valor inteiro!\n");
                in.nextLine();
            }
        }
    }

    private static int getListPrimeNumbersType() {
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

    public static List<Integer> listPrimeNumbersLinear(int num) {
        List<Integer> list = new ArrayList<>();

        if (num < 2) {
            return list;
        }

        list.add(2);

        boolean isPrime;
        for (int i = 3; i < num + 1; i += 2) {
            isPrime = true;

            for (int j = 2; j <= Math.pow(i, 0.5); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                list.add(i);
            }
        }

        return list;
    }

    public static List<Integer> listPrimeNumbersRecursive(int num) {
        List<Integer> list = new ArrayList<>();

        if (num < 2) {
            return list;
        }

        boolean isPrime = true;

        for (int j = 2; j <= Math.pow(num, 0.5); j++) {
            if (num % j == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            list.add(num);
        }

        list.addAll(listPrimeNumbersRecursive(num - 1));
        return list;
    }
}