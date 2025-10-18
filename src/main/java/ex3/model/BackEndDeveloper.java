package ex3.model;

import java.util.List;

public class BackEndDeveloper extends Developer{

    public BackEndDeveloper(String name, List<Technology> technologies) {
        super(name, technologies);
        setFamily(Family.BACK_END);
    }


    @Override
    public void develop() {

        System.out.println(getName() + " está desenvolvendo o backend ...");

    }

}
