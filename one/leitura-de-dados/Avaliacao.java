import java.util.Scanner;

class Avaliacao {
    public static void main(String args[]) {
        Scanner leitura = new Scanner(System.in);
        float mediaNotas = 0f;
        float somaNotas = 0f;
        int quantidadeNotas = 3;

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            somaNotas += leitura.nextFloat();
        }

        mediaNotas = somaNotas / quantidadeNotas;

        System.out.printf("A média das notas foi de: %.2f\n", mediaNotas);
    }
}
