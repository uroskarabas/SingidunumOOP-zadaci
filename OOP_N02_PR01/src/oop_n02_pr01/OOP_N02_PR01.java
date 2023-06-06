package oop_n02_pr01;

public class OOP_N02_PR01 {
    public static void main(String[] args) {
        // Ucimo kako da izrazimo merne jedinice u Javi
        // ako je brzina kretanja izrazena u km/h a vreme kretanja u sekunde onda 
        // ovo dole nece raditi, nego moramo dodati /3600 da bi radilo kako treba.
        double brzinaKretanja = 30.5; // km/h <- ako uklonimo ovo km/h programer ne bi znao koja je jedinica mere
        double vremeKretanja = 130.98; // s
//        double predjeniPut = brzinaKretanja * vremeKretanja / 3600.; // ???
        double predjeniPut = izracunajPredjeniPut(brzinaKretanja, vremeKretanja / 3600.);
        System.out.println("Predjeni put je " + predjeniPut + " km.");
        
        // sada napravimo primerak wrapper klase ali ne preko konstruktora nego
        // pomocu kontruktorske funkcije, koju mi odaberemo, a imamo sekunde,minute i sate
        Vreme vreme1 = Vreme.fromSeconds(130.98);
        // ako nam sad trebaju sati iz ovih sekundi mi mozemo uraditi samo ovako
        double sati = vreme1.toHours();
        // a mozemo uraditi i shorthand ovako >> //
        // >> double sati = Vreme.fromSeconds(130.98).toHours;
        
        Put put1 = Put.fromKilometers(10);
        System.out.println("Ovaj put je dugacak " + put1.toMeters() + " metara.");
        
        
        // ovo dole je objektno orijentisan pristup
        Brzina b = Brzina.fromKilometaraNaSat(30.5);
        Vreme v = Vreme.fromSeconds(130.98);
        Put p = predjeniPut(b, v);
        System.out.println("Predjeni put je " + p.toKilometers() + " km.");
        System.out.println("Predjeni put je " + p.toMeters() + " m.");
        System.out.println("Predjeni put je " + p.toCentimeters() + " cm.");
        
    }
    
    public static Put predjeniPut(Brzina brzina, Vreme vreme) {
        return Put.fromMeters(brzina.toMetraUSekundi() * vreme.toSeconds());
    }
    
    
    // ovako je vise za proceduralno programiranje, ali mi radimo ovde objektno tako da cemo koristiti
    // sad wrapper klase ili klase omotaci
    public static double izracunajPredjeniPut(double brzinaKmpH, double vremeH) {
        return brzinaKmpH * vremeH;
    }
}
