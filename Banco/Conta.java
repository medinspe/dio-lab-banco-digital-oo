public abstract class Conta implements IConta {
    private String numero;
    private double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    @Override
    public String getNumero() {
        return numero;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    @Override
    public void transferir(double valor, IConta destino) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }
}
