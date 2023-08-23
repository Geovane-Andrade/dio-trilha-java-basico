import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Conhecer e importar a classe Scanner
        //Exibir as mensagens para nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada.

        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        Scanner teclado2 = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = teclado.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = teclado.next();
        System.out.println("Por favor, digite o valor que tem em saldo!");
        double saldo = teclado.nextDouble();
        System.out.println("Por favor, digite seu nome completo!");
        String nomeCliente = teclado2.nextLine();

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero +
                " e seu saldo " + saldo + " já está disponível para saque.");

    }
}