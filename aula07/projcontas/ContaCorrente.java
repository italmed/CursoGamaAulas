package projcontas;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor-0.1f);
    }

    @Override
    public boolean saque(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            super.saque(valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String exibir() {
        return "CC " + getNumero() + " saldo:  " + getSaldo();
    }
    
}