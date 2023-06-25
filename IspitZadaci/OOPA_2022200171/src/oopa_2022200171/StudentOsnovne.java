package oopa_2022200171;

public class StudentOsnovne extends Student {

    public StudentOsnovne(String ime, String prezime, String smer, String brojIndeksa) {
        super(ime, prezime, smer, brojIndeksa);
    }

    @Override
    public String toString() {
        if(!this.isValid()) {
            return "Ovaj objekat nije ispravan.";
        } else {
            return "Ja sam " + this.getIME() + " " + this.getPREZIME() + ". "
                    + "Student sam osnovnih studija na smeru " + this.getSMER() + ".";
        }
    }
    
}
