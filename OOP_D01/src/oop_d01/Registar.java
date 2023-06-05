package oop_d01;

final public class Registar {
    private int broj;

    public Registar() {
        this.broj = 0;
    }

    public int getBroj() {
        return this.broj;
    }

    public void setBroj(int broj) {
        if (broj < 0 ) {
            this.broj = 0;
        } 
        else if (broj > 255) {
            this.broj = 255;
        }
        else {
            this.broj = broj;
        }
    }
    
    public void uvecajBroj() {
        if (this.broj > 255) {
            this.broj = 0;
        } 
        else {
            this.broj++; 
        }
    }
    
    public void smanjiBroj() {
        if (this.broj < 0) {
            this.broj = 255;
        } 
        else {
            this.broj--; 
        }
    }
    
    @Override
    public String toString() {
        return (String.format("%02X", this.broj));
    }
}
