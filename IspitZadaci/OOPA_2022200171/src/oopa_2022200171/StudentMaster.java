package oopa_2022200171;

public class StudentMaster extends Student {

    public StudentMaster(String ime, String prezime, String smer, String brojIndeksa) {
        super(ime, prezime, smer, brojIndeksa);
    }

    @Override
    public String toString() {
        if(!this.isValid()) {
            return "Ovaj objekat nije ispravan.";
        } else {
            return "Moje ime je " + this.getIME() + " " + this.getPREZIME() + ". "
                    + "Student sam smera " + this.getSMER() + " na master akademskim"
                    + " studijama.";
        }
    }
    
}
