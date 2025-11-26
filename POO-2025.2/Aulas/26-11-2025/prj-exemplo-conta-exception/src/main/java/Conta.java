

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws ContaException {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            throw new ContaException("Saldo insuficiente");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

}
