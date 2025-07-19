package model;

public class Conta {

    private int numero;
    private double saldo;
    private Cliente titular;

    public Conta() {
    }

    public Conta(int numero, Cliente titular) {
        this.numero = numero;
        this.saldo = 0.0;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void depositarSaldo(double valor) {
        this.saldo += valor;
    }

    public void sacarSaldo(double valor) {
        this.saldo -= valor;
    }

}
