package oop_d02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Price {
    final private double rsd;

    private Price(double rsd) {
        this.rsd = rsd;
    }
    
    public static Price fromRSD(double rsd) {
        return new Price(rsd);
    }
    
    public static Price fromEUR(double euro) throws IOException {
        return new Price(euro * procitajKursEvra());
    }
    
    public double toRSD() {
        return this.rsd;
    }
    
    public double toEUR() throws IOException {
        return this.rsd / procitajKursEvra();
    }
    
    // pomocni metod koji nije deo wrapper klase, probao sam prvo sa filereader
    private static double procitajKursEvra() throws IOException {
//        String sadrzaj = new String(Files.readAllBytes(Path.of("EUR.kurs.txt")));
        String sadrzaj = Files.readString(Path.of("EUR.kurs.txt"));
        return Double.parseDouble(sadrzaj.trim());

//        try {
//            FileReader fr = new FileReader("EUR.kurs.txt");
//            double i = (double)fr.read();
//            fr.close();
//            return i;
//        } catch (FileNotFoundException ex) {
//            System.out.println("Fajl nije pronadjen!");
//            System.exit(1);
//        }
//        return i;
    }
    
     
}
