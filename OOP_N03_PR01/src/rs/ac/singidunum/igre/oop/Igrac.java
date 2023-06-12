package rs.ac.singidunum.igre.oop;

public class Igrac extends PokretanObjekat{
    private String username, dizajn;
    private double zivot, snaga;

    public Igrac(double x, double y, double ugaoR, String slika, double brzina, String username, String dizajn, double zivot, double snaga) {
        super(x, y, ugaoR, slika, brzina);
        this.username = username;
        this.dizajn = dizajn;
        this.zivot = zivot;
        this.snaga = snaga;
    }

    public String getUsername() {
        return username;
    }

    public String getDizajn() {
        return dizajn;
    }

    public double getZivot() {
        return zivot;
    }

    public double getSnaga() {
        return snaga;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDizajn(String dizajn) {
        this.dizajn = dizajn;
    }

    public void setZivot(double zivot) {
        this.zivot = zivot;
    }

    public void setSnaga(double snaga) {
        this.snaga = snaga;
    }

    @Override
    public String toString() {
        return "Igrac{" + "username=" + username + ", dizajn=" + dizajn + ", zivot=" + zivot + ", snaga=" + snaga +
                ", nasledjeno: " + super.toString() + '}';
    }
    
    
}
