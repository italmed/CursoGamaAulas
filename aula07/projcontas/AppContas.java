package projcontas;

import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroConta;
        double limite;
        int opcao;

        GerenciaContas contas = new GerenciaContas();
        //Conta conta = null;
        do {
            System.out.println("1-Novo conta corrente");
            System.out.println("2-Novo conta poupança");
            System.out.println("3-Novo conta especial");
            System.out.println("4-Mostrar saldo");
            System.out.println("5-Fazer saque");
            System.out.println("6-Fazer deposito");
            System.out.println("7-Sair");
            System.out.print("==> ");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número da conta corrente:");
                    numeroConta = in.nextInt();
                    contas.novaConta(new ContaCorrente(numeroConta));

                    break;

                case 2:
                    System.out.println("Informe o número da poupança:");
                    numeroConta = in.nextInt();
                    contas.novaConta(new ContaPoupanca(numeroConta));

                    break;

                case 3:
                    System.out.println("Informe o número da conta especial:");
                    numeroConta = in.nextInt();
                    System.out.println("Informe o limite:");
                    limite = in.nextDouble();
                    contas.novaConta(new ContaEspecial(numeroConta, limite));
                    break;

                case 4:
                    System.out.println("Informe o número da conta:");
                    numeroConta = in.nextInt();
                    System.out.println(contas.getInfo(numeroConta));
                    break;

                case 5:
                    System.out.println("Informe o número da conta:");
                    numeroConta = in.nextInt();
                    System.out.println(contas.saque(numeroConta));
                    break;

                case 6:
                    System.out.println("Informe o número da conta:");
                    numeroConta = in.nextInt();
                    System.out.println(contas.deposito(numeroConta));
                    break;

                case 7:
                    break;
                default:
                    System.out.println("opcao inválida");

            }

        } while (opcao != 7);

        in.close();
    }
}