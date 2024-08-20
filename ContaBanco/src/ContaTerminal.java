
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //SOLICITANDO ENTRADAS DO USUÁRIO
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o seu número da sua conta:");
        int numero = scanner.nextInt();

        System.out.print("Digite o número da sua agência:");
        String agencia = scanner.next();

        System.out.print("Digite o seu nome:");
        String nomeCliente = scanner.next();

        System.out.print("Digite o seu saldo:");
        Double saldo = scanner.nextDouble();

        scanner.close();

        // IMPRIMINDO TEXTO FINAL COM ENTRADAS DIGITADAS
       System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero  + " e seu saldo " + saldo + " já está disponível para saque.");
    }

}



