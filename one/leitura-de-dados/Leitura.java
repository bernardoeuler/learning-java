import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");
        String nomeFilme = leitura.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoLancamento = leitura.nextInt();
        
        System.out.println("Diga sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble();
        
        System.out.println("\nNome do filme: " + nomeFilme);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);

        leitura.close();
    }
}
