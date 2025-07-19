package model;

public class Cliente {

    private String nome;
    private String cpf;
    private String senha;
    private Conta conta;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }


}
