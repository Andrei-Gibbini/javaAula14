package br.com.fiap.bean;

public class ContaBancaria {
    //Atributos
    private String cliente;
    private int numConta;
    private float saldo;

    //Construtores
    public ContaBancaria() {
    }

    public ContaBancaria(String cliente, float saldo, int numConta) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.numConta = numConta;
    }

    //Métodos Getteres/Setters

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
     //Métodos de classe (particulares)
    public float sacar(float valor) {
    }
    public float depositar(float valor) {
        return
    }
}
