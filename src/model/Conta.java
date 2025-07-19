package model;

import validacao.ValidarTransacao;

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
        ValidarTransacao.validarDeposito(valor);

        this.saldo += valor;
    }

    public void sacarSaldo(double valor) {
        ValidarTransacao.validarSaque(valor, this.saldo);
        this.saldo -= valor;
    }

    public void transferirValor(Conta destino, double valor) {
        ValidarTransacao.validarTransferencia(valor, this.saldo);
        this.saldo -= valor;
        destino.saldo += valor;
    }

}
