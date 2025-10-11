package ex1.model;

public class Cachorro extends Animal{

    private String raca;
    private String dono;

    // Construtor
    public Cachorro(String nome, int idade,String raca, String dono) {
        super(nome,idade);
        this.raca = raca;
        this.dono = dono;
    }

    @Override
    public void emitirSom(){
        super.emitirSom();
        System.out.printf("%s está latindo: Au Au !!!\n", getNome());
    }

    @Override
    public void alimentar(){
        System.out.println("Alimento cachorro ...");
    }

    public void mostrarDados(){

        System.out.println("================");
        System.out.println("Nome do cachorro: " + getNome());
        System.out.println("Idade do cachorro: " + getIdade());
        System.out.println("Raça do cachorro: " + getRaca());
        System.out.println("Nome do dono do cachorro: " + getDono());
        System.out.println("================");

    }


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

}

