package oop_n02_pr01;

public class Brzina {
    final private double metriUSekundi;
    // metri u sekundi, kilometri na sat, milja na sat

    private Brzina(double metriUSekundi) {
        this.metriUSekundi = metriUSekundi;
    }
    
    public static Brzina fromMetraUSekundi(double mus) {
        return new Brzina(mus);
    }
    
    public static Brzina fromKilometaraNaSat(double kns) {
        return new Brzina(kns / 3.6);
    }
    
    public static Brzina fromMiljaNaSat(double mns) {
        return new Brzina(mns / 2.237);
    }
    
    public double toMetraUSekundi() {
        return this.metriUSekundi;
    }
    
    public double toKilometaraNaSat() {
        return this.metriUSekundi * 3.6;
    }
    
    public double toMiljaNaSat() {
        return this.metriUSekundi * 2.237;
    }
}
