import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumerosPrimos {
    int type;
    List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NumerosPrimos numerosPrimos = new NumerosPrimos();

        System.out.println("*** Lista de Números Primos ***\n");

        numerosPrimos.setListPrimeNumbersType();

        while(true) {
            try {
                System.out.print("Listar primos até o número: ");
                int num = in.nextInt();

                if(num < 1) {
                    System.out.println("O número informado deve ser maior que zero!\n");
                    continue;
                }

                if(numerosPrimos.type == 1) {
                    System.out.println("\nListagem Recursiva");
                    numerosPrimos.listPrimeNumbersRecursive(num);
                } else {
                    System.out.println("\nListagem Linear");
                    numerosPrimos.listPrimeNumbersLinear(num);
                }

                Collections.sort(numerosPrimos.list);
                System.out.println("A lista de primos até o número " + num + " é: " + numerosPrimos.list);
                break;

            } catch (Exception e) {
                System.out.println("Informe um valor inteiro!\n");
                in.nextLine();
            }
        }
    }

    protected void setListPrimeNumbersType() {
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
        this.type = type;
    }

    public void listPrimeNumbersLinear(int num) {
        boolean isPrime;

        if(num < 2) { return; }
        
        // Passa por cada um dos números de 2 em 2, pois apenas 2 é par e primo, para checar se são primos
        for(int i = 2; i < num + 1; i++) {
            isPrime = true;

            // Feita divisão por cada valor até a raíz quadrado do número atual. Só é preciso ir até a raíz quadrada
            // pois não há como os dois valores que compõe um número composto serem maiores do que sua raíz quadrada
            for (Integer j : this.list) {
                // Se alguma das divisões tiver resto 0 (se for exata), o número testado não é primo
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                this.list.add(i);
            }
        }
    }

    public void listPrimeNumbersRecursive(int num) {
        if(num < 2) { return; }

        this.list.add(2);
        this.listPrimeNumbersRecursive(3, num);
    }

    public void listPrimeNumbersRecursive(int current, int max) {
        boolean isPrime = true;

        // As mesmas lógicas usadas no método linear valem aqui para o recursivo
        for(Integer j : this.list) {
            if(current % j == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            list.add(current);
        }

        if(current == max) {
            return;
        }

        this.listPrimeNumbersRecursive(current + 1, max);
    }
}