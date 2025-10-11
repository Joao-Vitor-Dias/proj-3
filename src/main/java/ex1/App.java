package ex1;

import ex1.model.Cachorro;
import ex1.model.Gato;

public class App {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Perguer",12 ,"Doberman","EU");

        cachorro.emitirSom();

        cachorro.mostrarDados();

    }
}
