public class ContaPoupanca extends Conta {
    private double taxaDeJuros;

    public ContaPoupanca(String numero, double taxaDeJuros) {
        super(numero);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void renderJuros() {
        double juros = getSaldo() * taxaDeJuros;
        depositar(juros);
    }
}
