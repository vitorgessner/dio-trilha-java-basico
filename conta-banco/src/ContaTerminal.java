import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String resultado = "";
        Scanner myObj = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);

        System.out.println("Por favor, digite o nome da agência");
        String agencia = myObj.nextLine();

        System.out.println("Por favor, digite o número da agência");
        int numero = myObj.nextInt();

        System.out.println("Por favor, digite o seu nome");
        String nome = myObj2.nextLine();

        System.out.println("Por favor, digite o seu saldo");
        double saldo = myObj.nextDouble();

        resultado = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(resultado);
    }
}
