package rs.ac.singidunum.igre.oop;

abstract public class Model {
    private double x, y, ugaoR;
    private String slika; // putanja do slike

    public Model(double x, double y, double ugaoR, String slika) {
        this.x = x;
        this.y = y;
        this.ugaoR = ugaoR;
        this.slika = slika;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getUgaoR() {
        return ugaoR;
    }

    public String getSlika() {
        return slika;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setUgaoR(double ugaoR) {
        this.ugaoR = ugaoR;
    }
    
    public void okreniSe(double ugaoStepeni) {
        double noviUgao = Math.toDegrees(ugaoR);
        noviUgao += ugaoStepeni;
        this.setUgaoR(Math.toRadians(noviUgao));
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    @Override
    public String toString() {
        return "Model{" + "x=" + x + ", y=" + y + ", ugaoR=" + ugaoR + ", slika=" + slika + '}';
    }
    
}
