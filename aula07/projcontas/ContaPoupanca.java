package projcontas;

public class ContaPoupanca extends Conta {
    private static double taxa; // um único atributo para todos os objetos

    public ContaPoupanca(int numeroConta) {
        super(numeroConta);
    }

    public static void setTaxa(double taxaPoup) {
        if (taxaPoup > 0) {
            taxa = taxaPoup;
        }
    }

    public double getTaxa() {
        return taxa;
    }

    @Override
    public boolean saque(double valor) {
        if (valor + 0.1f <= getSaldo()) {
            return super.saque(valor + 0.1f);
        } else {
            return false;
        }
    }

    @Override
    public String exibir() {
        return "CP " + getNumero() + " saldo:  " + getSaldo();
    }

}