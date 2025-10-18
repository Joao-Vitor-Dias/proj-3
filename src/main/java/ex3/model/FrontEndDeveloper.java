package ex3.model;

import java.util.List;

public class FrontEndDeveloper extends Developer{

    public FrontEndDeveloper(String name, List<Technology> technologies) {
        super(name, technologies);
        setFamily(Family.FRONT_END);
    }

    @Override
    public void develop() {
        System.out.println(getName() + " está desenvolvendo o frontend ...");
    }
}
