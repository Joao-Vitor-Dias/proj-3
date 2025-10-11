package ex1.model;

public class Gato {

    private String nome;
    private int idade;
    private String raca;

    // Construtor
    public Gato(String nome, int idade, String raca){

        this.nome = nome;
        this.idade = idade;
        this.raca = raca;

    }

    public void exibirDados(){

        System.out.println("================");
        System.out.println("Nome do gato: " + getNome());
        System.out.println("Idade do gato: " + getIdade());
        System.out.println("Raça do gato: " + getRaca());
        System.out.println("================");

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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

}
