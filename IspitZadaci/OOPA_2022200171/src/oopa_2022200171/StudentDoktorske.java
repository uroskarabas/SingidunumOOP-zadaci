package oopa_2022200171;

public class StudentDoktorske extends Student {

    public StudentDoktorske(String ime, String prezime, String smer, String brojIndeksa) {
        super(ime, prezime, smer, brojIndeksa);
    }

    @Override
    public String toString() {
        if(!this.isValid()) {
            return "Ovaj objekat nije ispravan.";
        } else {
            return "Zovem se " + this.getIME() + " " + this.getPREZIME() + ". "
                    + "Doktorand sam na smeru " + this.getSMER() + ".";
        }
    }
    
}
