package ex1;

import ex1.model.Cachorro;

public class App {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Lex", "Kangal",4,"John");

        cachorro.latir();
        cachorro.mostrarDados();

    }
}
