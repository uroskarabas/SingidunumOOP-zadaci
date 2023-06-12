package rs.ac.singidunum.igre.oop;

abstract public class Neprijatelj extends PokretanObjekat {
    private String naziv;
    private double zivot, snaga;

    public Neprijatelj(double x, double y, double ugaoR, String slika, double brzina, String naziv, double zivot, double snaga) {
        super(x, y, ugaoR, slika, brzina);
        this.naziv = naziv;
        this.zivot = zivot;
        this.snaga = snaga;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getZivot() {
        return zivot;
    }

    public double getSnaga() {
        return snaga;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setZivot(double zivot) {
        this.zivot = zivot;
    }

    public void setSnaga(double snaga) {
        this.snaga = snaga;
    }

    @Override
    public String toString() {
        return "Neprijatelj{" + "naziv=" + naziv + ", zivot=" + zivot + ", snaga=" 
                + snaga + ", nasledjeno: " + super.toString() + '}';
    }
    
    
    
}
