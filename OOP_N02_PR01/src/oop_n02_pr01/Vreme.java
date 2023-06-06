package oop_n02_pr01;

public class Vreme {
    //napravili smo prvo clan podatak koji mi zelimo da cuvamo tu vrednost
    // u ovom slucaju smo se odlucili za sekunde
    final private double sekunde;
    
    // napravili smo privatan konstruktor(mora biti privatan jer je wrapper klasa)
    private Vreme(double sekunde) {
        this.sekunde = sekunde;
    }
    
    // napravili smo javne staticke konstruktorske metode za dobivanje odredjenih
    // mernih jedinica od nase vrednosti
    public static Vreme fromSeconds(double s) {
        return new Vreme(s);
    }
    
    public static Vreme fromMinutes(double m) {
        return new Vreme(m * 60.);
    }
    
    public static Vreme fromHours(double h) {
        return new Vreme(h * 3600.);
    }
    
    // onda smo napravili getere za te vrednosti
    public double toSeconds() {
        return this.sekunde;
    }
    
    public double toMinutes() {
        return this.sekunde / 60.;
    }
    
    public double toHours() {
        return this.sekunde / 3600.;
    }
    
}
