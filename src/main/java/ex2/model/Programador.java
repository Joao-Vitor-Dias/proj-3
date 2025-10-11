package ex2.model;

public class Programador {

    private String nome;
    private int idade;
    private String especializacao;
    private Stack stack;
    private boolean empregado;

    public Programador(String nome, int idade, String especializacao, Stack stack, boolean eEmpregado) {
        this.nome = nome;
        this.idade = idade;
        this.especializacao = especializacao;
        this.stack = stack;
        this.empregado = eEmpregado;
    }

    @Override
    public String toString() {
        return  "=================" +
                "\nNome: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nEspecialização: " + getEspecializacao() +
                "\nStack: " + stack +
                "\n" +  isEmpregado() +
                "=================\n"
                ;
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

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public Stack getStack() {
        return stack;
    }

    public void setStack(Stack stack) {
        this.stack = stack;
    }

    public String isEmpregado() {
        return this.empregado ? "Está empregado!\n" : "Está desempregado!\n";
    }

    public void setEmpregado(boolean eEmpregado) {
        this.empregado = eEmpregado;
    }
}
