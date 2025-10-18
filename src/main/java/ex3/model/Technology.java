package ex3.model;

public class Technology {

    Family family;
    String name;

    public Technology(Family family, String name) {
        this.family = family;
        this.name = name;
    }

    @Override
    public String toString() {
        return  getFamily() + ": " + getName();
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
