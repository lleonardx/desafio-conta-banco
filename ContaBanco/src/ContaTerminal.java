import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu Nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da sua Agência: ");
        String agencia = scanner.next();

        int numero = 1021;
        double saldo = 237.48;

        //Dados do Usuario
        System.out.println("Olá" + nome + "" + " . Obrigado por criar uma conta em nosso banco." );
        System.out.println("Sua agência é: " + agencia + "" + ", conta: " + numero + ".");
        System.out.println("e seu saldo: " + saldo + "" + ", está disponivel para saque.");      
        

    }
}
