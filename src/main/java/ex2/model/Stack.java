package ex2.model;

import java.util.List;

public class Stack {

    private List<String> tecnologias;

    public Stack(List<String> tecnologias) {
        this.tecnologias = tecnologias;
    }

    @Override
    public String toString() {
        return "" + tecnologias ;
    }

    public List<String> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<String> tecnologias) {
        this.tecnologias = tecnologias;
    }
}
