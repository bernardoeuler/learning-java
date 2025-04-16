public class Soma {
    public static void main(String args[]) {
        int x, y, sum;

        if (args.length != 2) {
            System.out.println("Entrada inválida. Por favor, insira 2 números.");
            return;
        }

        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        } catch (NumberFormatException exception) {
            System.out.println("Entrada inválida. Por favor, insira números válidos.");
            return;
        }

        sum = x + y;

        System.out.println("Resultado: " + x + " + " + y + " = " + sum);
    }
}
