package br.com.fiap.bean;

public class ContaPoupanca extends ContaBancaria{
    //Atributos
    private int diaDeRendimento;

    //Construtores
    public ContaPoupanca(){
    }

    public ContaPoupanca(String cliente, float saldo, int numConta, int diaDeRendimento) {
        super(cliente, saldo, numConta);
        this.diaDeRendimento = diaDeRendimento;
    }

    //Métodos Gettesr/Setters

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    // Métodos de Classe (particulars)
    public float novoSaldo () {
        return
    }
}
