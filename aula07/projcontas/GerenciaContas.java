package projcontas;
import java.util.Scanner;

import java.util.ArrayList;

public class GerenciaContas {
    // essa classe será responsável por cuidar das contas
    private ArrayList<Conta> listaContas;
    Scanner in = new Scanner(System.in);

    public GerenciaContas() {
        listaContas = new ArrayList<>();
    }

    public void novaConta(Conta conta) {
        listaContas.add(conta);
    }

    public String getInfo(int numeroConta){
        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                return c.exibir();
            }
        }
        return ("Esta conta não existe.");
    }

    public String saque(int numeroConta){

        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                System.out.println("Informe o valor do saque:");
                double sacar = in.nextDouble();
                if (c.saque(sacar)){
                    return "Saque realizado.";
                } else{
                    return "Saldo insuficiente.";
                }
            }
  
        }
        return ("Esta conta não existe.");
    }

    public String deposito(int numeroConta){
        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                System.out.println("Informe o valor do depoisto:");
                double valor = in.nextDouble();
                if (c.depositar(valor)){
                   return "Deposito realizado.";
                } else {
                    return "Deposito não realizado.";
                }
            }
        }
        return ("Esta conta não existe."); 
    }
}