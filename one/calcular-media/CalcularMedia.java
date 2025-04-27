public class CalcularMedia {
    public static void main(String args[]) {
        if (args.length != 2) {
            System.out.println("Entrada inválida. Digite dois números inteiros.");
            return;
        }

        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);
        float media = (x + y) / 2;

        System.out.printf("A média das notas %.2f e %.2f é igual a %.2f.\n", x, y, media);
    }
}
