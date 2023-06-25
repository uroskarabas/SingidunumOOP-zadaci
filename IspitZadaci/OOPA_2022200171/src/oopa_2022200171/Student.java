package oopa_2022200171;

abstract public class Student implements Validatable {
    private final String IME, PREZIME, SMER, BROJ_INDEKSA;

    public Student(String ime, String prezime, String smer, String brojIndeksa) {
        this.IME = ime;
        this.PREZIME = prezime;
        this.SMER = smer;
        this.BROJ_INDEKSA = brojIndeksa;
    }

    public String getIME() {
        return IME;
    }

    public String getPREZIME() {
        return PREZIME;
    }

    public String getSMER() {
        return SMER;
    }

    public String getBROJ_INDEKSA() {
        return BROJ_INDEKSA;
    }

    @Override
    public boolean isValid() {
        return this.IME.length() > 2 && 
               this.PREZIME.length() > 2 &&
               this.SMER.length() > 2 &&
               this.BROJ_INDEKSA.length() == 10;
    }
    
    @Override
    public abstract String toString();
}
