package rs.ac.singidunum.igre.oop;

abstract public class PokretanObjekat extends Model {
    private double brzina;

    public PokretanObjekat(double x, double y, double ugaoR, String slika, double brzina) {
        super(x, y, ugaoR, slika);
        this.brzina = brzina;
    }

    public double getBrzina() {
        return brzina;
    }

    public void setBrzina(double brzina) {
        this.brzina = brzina;
    }
    
    @Override
    public String toString() {
        return "PokretanObjekat{" + "brzina= " + brzina + ", x=" + this.getX() + ", y=" + this.getY() + 
                ", ugaoR=" + this.getUgaoR() + ", slika=" + this.getSlika() + "}.";
    }
    
    public void kreciSePut(double put) {
        double dX = Math.cos(this.getUgaoR()) * put;
        double dY = Math.sin(this.getUgaoR()) * put;
        
        this.setX(this.getX() + dX);
        this.setY(this.getY() + dY);
    }
    
    public void kreciSeVreme(double sekunde) {
        double put = this.getBrzina() * sekunde;
        this.kreciSePut(put);
    }
    
}
