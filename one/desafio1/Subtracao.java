public class Subtracao {
    public static void main(String args[]) {
        int x, y, difference;

        if (args.length != 2) {
            System.out.println("Entrada inválida. Por favor, digite 2 números.");
            return;
        }

        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
        } catch (NumberFormatException exception) {
            System.out.println("Entrada inválida. Por favor, digite números válidos.");
            return;
        }

        difference = x - y;

        System.out.println("Resultado: " + x + " - " + y + " = " + difference);
    }
}
