public class Cliente {
    private String nome;
    private String cpf;
    private IConta conta;

    public Cliente(String nome, String cpf, IConta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public IConta getConta() {
        return conta;
    }
}
