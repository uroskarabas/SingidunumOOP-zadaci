package oop_n02_pr01;

public class Put {
    final private double metar;

    private Put(double metar) {
        this.metar = metar;
    }
    
    public static Put fromMeters(double m) {
        return new Put(m);
    }
    
    public static Put fromKilometers(double km) {
        return new Put(km * 1000.);
    }
    
    public static Put fromCentimeters(double cm) {
        return new Put(cm / 100.);
    }
    
    public double toMeters() {
        return this.metar;
    }
    
    public double toKilometers() {
        return this.metar / 1000.;
    }
    
    public double toCentimeters() {
        return this.metar * 100.;
    }
    
}
