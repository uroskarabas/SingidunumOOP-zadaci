package oop_d01;

import java.util.Scanner;
//import static oop_d01.Brojac.Smer.NAPRED;

public class OOP_D01 {
    public static void main(String[] args) {
        Brojac brojac = new Brojac();
                
        Scanner s = new Scanner(System.in);
        String smerBrojaca = "";
        while ( "".equals(smerBrojaca) ) {
            System.out.println("Da li zelite da pomerite brojac NAPRED, NAZAD, ili U_MESTU?");
            smerBrojaca = s.nextLine().trim().toUpperCase();
            System.out.println(smerBrojaca);
            if ( smerBrojaca != "NAPRED" || smerBrojaca != "NAZAD" || smerBrojaca != "U_MESTU") {
                System.out.println("Pogresno unet smer, probajte ponovo.");
                smerBrojaca = "";
            }
            System.out.println(smerBrojaca);
        }
        
        int pomeraj = 0;
        while (pomeraj == 0) {
            System.out.println("Koliko koraka treba da se ponovi pomeranje brojaca?");
            pomeraj = s.nextInt();
            if (pomeraj <= 0) {
                pomeraj = 0;
                        
            }
        }
        
        
        for(int i = 0; i < pomeraj; i++) {
            if (smerBrojaca == "NAPRED") {
                brojac.pomeriBrojac(Brojac.Smer.NAPRED);
            }
        }
        
        
        

    }
    
}
