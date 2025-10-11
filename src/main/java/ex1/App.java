package ex1;

import ex1.model.Cachorro;
import ex1.model.Gato;

public class App {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Lex", "Kangal", 4 ,"John");

        Gato gato = new Gato("Hebert", 6,"Persa");

        cachorro.latir();
        cachorro.mostrarDados();
        gato.exibirDados();

    }
}
