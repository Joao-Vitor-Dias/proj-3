package ex3.model;

import java.util.List;

public abstract class Developer {

    private String name;
    private Family family;
    private List<Technology> technologies;

    public Developer(String name, List<Technology> technologies) {
        this.name = name;
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return  "===============\n" +
                "Desenvoledor: " + getFamily() + "\n" +
                "Nome: " + name + '\n' +
                "Technologias: " + technologies;
    }

    public abstract void develop();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Family getFamily() {
        return family;
    }

    protected void setFamily(Family family) {
        this.family = family;
    }
}
