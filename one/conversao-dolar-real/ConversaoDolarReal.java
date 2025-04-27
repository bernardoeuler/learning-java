public class ConversaoDolarReal {
    public static void main(String args[]) {
        double cotacaoDolarReal = 5.68;
        double valorEmDolares = 10;
        double valorEmReais = valorEmDolares * cotacaoDolarReal;

        System.out.printf("Cotação do dólar hoje: %.2f\nValor em dólares para conversão: %.2f\nValor convertido para reais: %.2f\n", cotacaoDolarReal, valorEmDolares, valorEmReais);
    }
}
