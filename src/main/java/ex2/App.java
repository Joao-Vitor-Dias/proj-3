package ex2;

import ex2.model.Programador;
import ex2.model.Stack;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Stack stack = new Stack(List.of("Java","Spring Boot","MySQL","React","Linux"));

        Programador programador = new Programador("João",18,"BackEnd",stack,true);

        System.out.println(programador);

    }

}
