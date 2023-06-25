package oopa_2022200171;

public class StudentFactory {
    
    public static Student getInstance(String brojIndeksa, String ime, String prezime) 
    {
        String petaCifra = brojIndeksa.substring(4, 5);
        if (petaCifra.equals("1") ||
            petaCifra.equals("2") ||
            petaCifra.equals("3") ||
            petaCifra.equals("4") ||
            petaCifra.equals("5") ) {
                return getOS(brojIndeksa, ime, prezime);
        } else if ( petaCifra.equals(6) ||
                    petaCifra.equals("7")) {
            return getMA(brojIndeksa, ime, prezime);
        } else {
            return getDR(brojIndeksa, ime, prezime);
        }
    }
    
    private static StudentOsnovne getOS(String brojIndeksa, String ime, String prezime) {
        String sestaCifra = brojIndeksa.substring(5, 6);
        String smer = "";
        
        switch(sestaCifra) {
            case "0": 
                smer = "Informatika i računarstvo";
                break;
            case "1": 
                smer = "Poslovna ekonomija";
                break;
            case "2": 
                smer = "Informatika i racunarstvo";
                break;
            case "3": 
                smer = "Informacione tehnologije";
                break;
            case "4": 
                smer = "Turizma i hotelijerstvo";
                break;
            case "5": 
                smer = "Softversko i info. inzenjerstvo";
                break;
            case "6": 
                smer = "Menadzment u sportu";
                break;
            case "7": 
                smer = "Fizicko vaspitanje i sport";
                break;
            case "8": 
                smer = "Turizam i hotelijerstvo";
                break;
            case "9": 
                smer = "Grupa smerova";
                break;
        }
        return new StudentOsnovne(ime, prezime, smer, brojIndeksa);
    }
    
    private static StudentMaster getMA(String brojIndeksa, String ime, String prezime) {
        String sestaCifra = brojIndeksa.substring(5, 6);
        String smer = "";
        
        switch(sestaCifra) {
            case "0": 
                smer = "Poslovna ekonomija";
                break;
            case "1": 
                smer = "Poslovna ekonomija";
                break;
            case "2": 
                smer = "Poslovna ekonomija";
                break;
            case "3": 
                smer = "Interna revizija i forenzika";
                break;
            case "4": 
                smer = "Inženjerski menadžment";
                break;
            case "5": 
                smer = "Savremene info. tehnologije";
                break;
            case "6": 
                smer = "Savremene info. tehnologije";
                break;
            case "7": 
                smer = "Savremene info. tehnologije";
                break;
            case "8": 
                smer = "Elektrotehnika i računarstvo";
                break;
            case "9": 
                smer = "Grupa smerova";
                break;
        }
        return new StudentMaster(ime, prezime, smer, brojIndeksa);
    }
    
    private static StudentDoktorske getDR(String brojIndeksa, String ime, String prezime) {
        String sestaCifra = brojIndeksa.substring(5, 6);
        String smer = "";
        
        switch(sestaCifra) {
            case "0": 
                smer = "Napredni sistemi zaštite";
                break;
            case "1": 
                smer = "Savrem. posl. odlučivanje";
                break;
            case "2": 
                smer = "Menadžment u turizmu";
                break;
            case "3": 
                smer = "Napredni sistemi zaštite";
                break;
            case "4": 
                smer = "Napredni sistemi zaštite";
                break;
            case "5": 
                smer = "Elektroteh. i računarstvo";
                break;
            case "6": 
                smer = "Elektroteh. i računarstvo";
                break;
            case "7": 
                smer = "Grupa smerova";
                break;
            case "8": 
                smer = "Grupa smerova";
                break;
            case "9": 
                smer = "Grupa smerova";
                break;
        }
        return new StudentDoktorske(ime, prezime, smer, brojIndeksa);
    }
}
