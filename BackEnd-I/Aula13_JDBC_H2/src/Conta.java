public class Conta {
    private int id;
    private String nome;
    private String numeroConta;
    private double saldo;

    public Conta(int id, String nome, String numeroConta, double saldo) {
        this.id = id;
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double aumentarSaldo(double valor) {
        this.saldo += valor;
        return this.saldo;
    }
}
