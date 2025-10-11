package ex1.model;

public class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }

    void emitirSom(){

        System.out.println("Som de animal !!!");

    }

    void alimentar(){

        System.out.println("Alimentando");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
