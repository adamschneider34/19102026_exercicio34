import java.util.Scanner;

// Boa tarde professor! Escrevi esse programa para que o primeiro termo da sequência seja
// correspondente ao 0 em vez do 1, diferentemente de como você fez na aula. Espero que tudo
// esteja certo. Muito obrigado pela atenção!

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anterior = 0;
        int atual = 1;
        int proximo;
        int i = 2;

        System.out.println("Digite qual termo você deseja");
        int n = scanner.nextInt();

        switch (n) {
            case 0:
                atual = 0;
                break;
            case 1:
                atual = 1;
                break;
            case 2:
                atual = 1;
                break;

            default:
                while (n >= i) {
                    proximo = anterior + atual;
                    anterior = atual;
                    atual = proximo;
                    i++;
                }
        }

        System.out.println("O termo é:" + atual);

        scanner.close();
    }
}