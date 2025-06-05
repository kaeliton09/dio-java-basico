import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //variaveis
        String NomeCliente;
        int NumeroConta;
        String AgenciaConta;
        float SaldoConta;

        Scanner ler = new Scanner(System.in);

        //leitura de dados
        System.out.println("Por favor, digite o nome do cliente: ");
        NomeCliente = ler.nextLine();

        System.out.println("digite a agencia do cliente: ");
        AgenciaConta = ler.nextLine();

        System.out.println("digite o saldo da conta: ");
        SaldoConta = ler.nextFloat();

        System.out.println("digite o numero da conta: ");
        NumeroConta = ler.nextInt();

        //mostrando mensagem
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + AgenciaConta + ", conta " + NumeroConta + " e seu saldo " + SaldoConta +  " já está disponível para saque");
    }
}
