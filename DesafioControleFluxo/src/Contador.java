import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("DIGITE O PRIMEIRO PARAMETRO ");
        int parametroUm = terminal.nextInt();
        System.out.println("DIGITE O SEGUNDO PARAMETRO");
        int parametroDois = terminal.nextInt();
        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O SEGUNDO PARAMETRO DEVE SER MAIOR QUE O PRIMEIRO");

        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();

        } else {
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("IMPRIMINDO O NUMERO " + i);
            }
        }
    }
}
