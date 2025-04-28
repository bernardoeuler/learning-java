public class SwitchCase {
    public static void main(String args[]) {
        if (validateArgs(args) == 1) {
            System.exit(1);
        }

        char weekDayNumber = (char) Integer.parseInt(args[0]);

        System.out.printf("Hoje é %s.\n", getWeekDay(weekDayNumber));
    }

    public static String getWeekDay(char weekDayNumber) {
        switch (weekDayNumber) {
            case 0:
                return "segunda-feira";
            case 1:
                return "terça-feira";
            case 2:
                return "quarta-feira";
            case 3:
                return "quinta-feira";
            case 4:
                return "sexta-feira";
            case 5:
                return "sábado";
            case 6:
                return "domingo";
            default:
                return "";
        }
    }

    protected static int validateArgs(String args[]) {
        if (args.length != 1) {
            System.out.println("Entrada inválida. Digite um número.");
            return 1;
        }

        try {
            int number = Integer.parseInt(args[0]);

            if (number < 0 || number > 6) {
                System.out.println("Entrada inválida. O número deve estar entre 0 e 6.");
                return 1;
            }
        } catch (NumberFormatException exception) {
            System.out.println("Entrada inválida. O número deve ser um inteiro de 0 a 6.");
            return 1;
        }

        return 0;
    }
}
