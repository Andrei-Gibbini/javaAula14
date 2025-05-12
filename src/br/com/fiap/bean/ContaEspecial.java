package br.com.fiap.bean;

public class ContaEspecial extends ContaBancaria{
    //Atributos
    private float limite;

    //Construtores
    public ContaEspecial (){
    }

    public ContaEspecial(String cliente, float saldo, int numConta, float limite) {
        super(cliente, saldo, numConta);
        this.limite = limite;
    }

    //Métodos Getters/Setters

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    //Métodos de classe (particulares)
    public float sacar() {

    }
}
