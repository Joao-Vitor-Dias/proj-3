package ex1.model;

public class Cachorro {

    private String nome;
    private String raca;
    private int idade;
    private String dono;

    // Construtor
    public Cachorro(String nome, String raca, int idade, String dono) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.dono = dono;
    }

    public void latir(){
        System.out.printf("%s está latindo: Au Au !!!\n", getNome());
    }

    public void mostrarDados(){

        System.out.println("================");
        System.out.println("Nome do cachorro: " + getNome());
        System.out.println("Idade do cachorro: " + getIdade());
        System.out.println("Raça do cachorro: " + getRaca());
        System.out.println("Nome do dono do cachorro: " + getDono());
        System.out.println("================");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

}

