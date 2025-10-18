package ex3;

import ex3.model.*;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Technology tecJava = new Technology(Family.BACK_END, "Java");
        Technology tecDotNet = new Technology(Family.BACK_END, "DotNet");
        Technology tecReact = new Technology(Family.FRONT_END, "React");

        BackEndDeveloper backDevEnd1 = new BackEndDeveloper("John", List.of(tecJava, tecReact));
        BackEndDeveloper backDevEnd2 = new BackEndDeveloper("Hebert", List.of(tecDotNet));
        FrontEndDeveloper frontDevEnd1 = new FrontEndDeveloper("Truman", List.of(tecReact));

        Team team1 = new Team("Time 1",List.of(backDevEnd1,backDevEnd2,frontDevEnd1));

        team1.showTeam();

        System.out.println("=======" + team1.getName() + " =======");
        for (Developer developer: team1.getDevelopers()){

            developer.develop();

        }

    }

}
