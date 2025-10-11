package ex2;

import ex2.model.IO;
import ex2.model.Programador;
import ex2.model.Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        Stack stack = new Stack(List.of("Java","Spring Boot","MySQL","React","Linux"));

        Programador programador = cadastrarProgramador();

        IO.println(programador);

    }

    public static Programador cadastrarProgramador(){
        IO.println("Digite seu nome: ");
        String nome = sc.next();
        IO.println("Digite sua idade: ");
        int idade = sc.nextInt();
        IO.println("Digite sua especializacao: ");
        String especializacao = sc.next();
        IO.println("Digite se você está empregado (s/n): ");
        String empregadoString = sc.next();

        IO.println("============");
        IO.println("Agora digite sua stack");
        String stackUserInput = sc.next();

        return new Programador(
                nome,
                idade,
                especializacao,
                new Stack(transformarStringParaLista(stackUserInput)),
                verificarSeEmpregado(empregadoString)
        );

    }

    public static List<String> transformarStringParaLista(String string){

        return Arrays.stream(string.split(",")).toList();

    }

    public static boolean verificarSeEmpregado(String op){

        return op.equalsIgnoreCase("s");

    }

}

