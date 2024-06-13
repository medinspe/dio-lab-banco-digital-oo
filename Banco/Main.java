public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        IConta contaCorrente = new ContaCorrente("12345", 0.50);
        IConta contaPoupanca = new ContaPoupanca("67890", 0.01);

        Cliente cliente1 = new Cliente("João Silva", "111.111.111-11", contaCorrente);
        Cliente cliente2 = new Cliente("Maria Souza", "222.222.222-22", contaPoupanca);

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        contaCorrente.depositar(1000.00);
        contaPoupanca.depositar(500.00);

        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo()); // 1000.0
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo()); // 500.0

        contaCorrente.sacar(200.00);
        ((ContaPoupanca) contaPoupanca).renderJuros();

        System.out.println("Saldo Conta Corrente após saque: " + contaCorrente.getSaldo()); // 799.5
        System.out.println("Saldo Conta Poupança após juros: " + contaPoupanca.getSaldo()); // 505.0

        contaCorrente.transferir(300.00, contaPoupanca);

        System.out.println("Saldo Conta Corrente após transferência: " + contaCorrente.getSaldo()); // 498.0
        System.out.println("Saldo Conta Poupança após receber transferência: " + contaPoupanca.getSaldo()); // 805.0
    }
}
