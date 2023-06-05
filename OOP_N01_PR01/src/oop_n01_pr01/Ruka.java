package oop_n01_pr01;

public class Ruka {
    private boolean savijena;

    public Ruka() {
        this.savijena = false;
    }

    public boolean isSavijena() {
        return savijena;
    }
    
    public void savij() {
        this.savijena = true;
    }
    
    public void ispruzi() {
        this.savijena = false;
    }
}
