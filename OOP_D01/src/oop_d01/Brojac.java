package oop_d01;

final public class Brojac {
    private Registar nizi, visi;
    
    enum Smer {
        U_MESTU,
        NAPRED,
        NAZAD
    }

    public Brojac() {
        this.nizi = new Registar();
        this.visi = new Registar();
    }
    
    public void pomeriBrojac(Smer smer) {
        if ( smer.equals(smer.NAPRED) ) {
            this.nizi.uvecajBroj();
            System.out.println("Trenutna vrednost nizeg brojaca je: " + this.nizi);
            if ( this.nizi.getBroj() == 0) {
                this.visi.uvecajBroj();
            }
            System.out.println("Nizi registar: " + this.nizi.toString() + ", Visi registar: " + this.visi.toString());
        }
        
        if ( smer.equals(smer.NAZAD) ) {
            this.nizi.smanjiBroj();
            if ( this.nizi.getBroj() == 255) {
                this.visi.smanjiBroj();
            }
            System.out.println("Nizi registar: " + this.nizi.toString() + ", Visi registar: " + this.visi.toString());
        }
        else {
            System.out.println("Nizi registar: " + this.nizi.toString() + ", Visi registar: " + this.visi.toString());
        }
    }
    
    
}
