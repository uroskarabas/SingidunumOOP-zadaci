package oop_n01_pr01;

public class Veverica {
    private Ruka levaRuka, desnaRuka;
    private String ime;
    private String staDrzi;

    public Veverica(String ime) {
        this.ime = ime;
        this.staDrzi = "NISTA";
        this.levaRuka = new Ruka();
        this.desnaRuka = new Ruka();
    }

    public String getIme() {
        return ime;
    }

    public String getStaDrzi() {
        return this.staDrzi;
//        if (this.levaRuka.isSavijena() || this.desnaRuka.isSavijena()) {
//            return staDrzi;
//        } else {
//            return "Ne pridrzavam nista jer su mi obe ruke ispruzene.";
//        }
    }
    
    public void ispruziLevuRuku() {
        this.levaRuka.ispruzi();
        System.out.println("Leva ruka je ispruzena.");
        
        if (!this.desnaRuka.isSavijena()) {
            System.out.println("Ne mogu da pridrzavam vise " + this.staDrzi);
            this.staDrzi = "NISTA";
        }
    }
    
    public void ispruziDesnuRuku() {
        this.desnaRuka.ispruzi();
        System.out.println("Desna ruka je ispruzena.");
        
        if (!this.levaRuka.isSavijena()) {
            System.out.println("Ne mogu da pridrzavam vise " + this.staDrzi);
            this.staDrzi = "NISTA";
        }
    }
    
    public void savijLevuRuku() {
        this.levaRuka.savij();
        System.out.println("Leva Ruka je savijena.");
    }
    
    public void savijDesnuRuku() {
        this.desnaRuka.savij();
        System.out.println("Desna Ruka je savijena.");
    }
    
    public void pridrzi(String sta) {
        if ( this.levaRuka.isSavijena() || this.desnaRuka.isSavijena()) {
            this.staDrzi = sta;
            System.out.println("Pridrzavam " + sta);
        } else {
            System.out.println("Ne mogu da pridrzim " + sta + ", jer su mi obe ruke ispruzene!" );
        }
    }
    
        
        
}
