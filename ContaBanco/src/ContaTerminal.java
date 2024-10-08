import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldoConta;
   

        System.out.print("Por favor, digite o número da Agência !");
            agencia = scanner.nextLine();
        System.out.print("Por favor, digite seu nome !");
            nomeCliente = scanner.nextLine();
        System.out.print("Por favor, digite o número da conta !");
            numeroConta = scanner.nextInt();
        System.out.print("Por favor, digite o saldo da conta !");
            saldoConta = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numeroConta + " e seu saldo atual: " + saldoConta +  ",já está disponível para saque");
        scanner.close();
    }
}
