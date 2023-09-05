import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, Digite o numero da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o numero da sua agência com o Digito Verificador separado por hifén: ");
        String agencia = scanner.next();
              
        System.out.println("Digite o seu Primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite o saldo da sua conta: ");
        float saldo = scanner.nextFloat();

        System.out.println("Ola " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já esta disponivel para saque. ");


   
    }
}