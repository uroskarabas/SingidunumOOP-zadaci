package rs.ac.singidunum.igre.oop;

public class NepokretanObjekat extends Model{
    private String naziv;

    public NepokretanObjekat(double x, double y, double ugaoR, String slika, String naziv) {
        super(x, y, ugaoR, slika);
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "NepokretanObjekat{" + "naziv= " + naziv + ", x=" + this.getX() + ", y=" + this.getY() + 
                ", ugaoR=" + this.getUgaoR() + ", slika=" + this.getSlika() + "}.";
    }
    
    
    
}
