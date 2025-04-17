public class Main {
    public static void main(String args[]) {
        String nomeFilme = "Shrek Para Sempre";
        int anoLancamento = 2010;
        float notaFilme = 8.6f;
        int estrelas = (int) notaFilme / 2;
        String sinopse = 
            """
            Shrek (Mike Myers) está entediado. Sua antiga vida de aventuras foi substituída
            pela de pacato pai de família. Casado com Fiona (Cameron Diaz) e pai de três
            filhos, Shrek sente falta da adrenalina e da liberdade que tinha no passado.
            Para recuperá-los, ele firma um pacto com Rumpelstiltiskin (Walt Dohrm). Imedia-
            tamente Shrek é levado a uma versão alternativa do Reino de Tão, Tão Distante,
            onde Fiona é uma temível ogro e ele não é mais reconhecido pelo Burro (Eddie
            Murphy) e o Gato de Botas (Antonio Bandera), seus melhores amigos.
            """;

        System.out.printf("Filme: %s\n\n", nomeFilme);
        System.out.printf("Ano de lançamento: %d\n\n", anoLancamento);
        System.out.printf("Estrelas: %d\n\n", estrelas);
        System.out.printf("Sinopse:\n\n%s", sinopse);
    }
}
