import java.util.Scanner;

public class Cliente {
    int numero;
    String agencia;
    String nomeCliente;
    float saldo;

    Scanner sc = new Scanner(System.in);
    
    public void dadosCliente(){
        System.out.println("Por favor, digite o número da Agência! ");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite seu nome! ");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite sua conta! ");
        numero = sc.nextInt();
        System.out.println("Por favor, digite seu Saldo! ");
        saldo = sc.nextFloat();
        

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco," + 
        "sua agência é "+ agencia + ", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque.");

        



    }
    
}
