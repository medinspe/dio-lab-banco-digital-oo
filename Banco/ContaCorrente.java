public class ContaCorrente extends Conta {
    private double taxaDeOperacao;

    public ContaCorrente(String numero, double taxaDeOperacao) {
        super(numero);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + taxaDeOperacao;
        super.sacar(valorComTaxa);
    }

    @Override
    public void transferir(double valor, IConta destino) {
        double valorComTaxa = valor + taxaDeOperacao;
        super.transferir(valorComTaxa, destino);
    }
}
