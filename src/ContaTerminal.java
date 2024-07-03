import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        ContaBanco contaBanco = new ContaBanco();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco De Todos");
        System.out.println("Para criar uma conta digite seu nome: ");
        contaBanco.nomeCliente = scanner.next();
        System.out.println("Agora precisamos que digite sua agencia: ");
        contaBanco.agencia = scanner.next();
        System.out.println("Digite o nomero da conta: ");
        contaBanco.conta = scanner.nextInt();
        System.out.println("Ola " + contaBanco.nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agencia é " +
                contaBanco.agencia +" e sua conta " + contaBanco.conta + " como bonus já tem disponivel em sua conta R$: " +
                contaBanco.saldo);

    }
}
