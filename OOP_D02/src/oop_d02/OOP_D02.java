package oop_d02;

import java.io.IOException;
import java.util.Scanner;

public class OOP_D02 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite cenu proizvoda u dinarima:");
        double cenaRsd = sc.nextDouble();
        sc.nextLine();
        sc.close();
        double cenaEur = Price.fromRSD(cenaRsd).toEUR();
        System.out.println("Cena proizvoda koju ste uneli u rsd iznosi " + cenaEur + " evra.");
    }
    
}
