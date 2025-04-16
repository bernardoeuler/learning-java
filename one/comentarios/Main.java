// Este programa calcula a média das notas de um aluno
public class Main {
    public static void main(String args[]) {
        // Declaração das variáveis
        float nota1, nota2, nota3, media;
        String mediaFormatada;

        //Notas das três provas do aluno
        nota1 = 7.9f;
        nota2 = 5.8f;
        nota3 = 9.6f;

        // Calculo e formatação da média
        media = (nota1 + nota2 + nota3) / 3;
        mediaFormatada = String.format("%.2f", media);

        // Exibição da média no terminal
        System.out.println("A média das três notas do aluno foi " + mediaFormatada);
    }
}
