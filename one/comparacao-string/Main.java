public class Main {
    public static void main(String args[]) {
        String usuario = "bernardo";
        String senha = "123456";

        if (args.length != 2) {
            System.out.println("Entrada inválida. Digite seu usuário e senha.");
            return;
        }

        if (args[0].equals(usuario) && args[1].equals(senha)) {
            System.out.println("Bem vindo de novo, " + usuario + "!");
            System.out.println("Você entrou no sistema com sucesso.");
        } else {
            System.out.println("Credenciais incorretas. Tente novamente mais tarde.");
        }
    }
}
