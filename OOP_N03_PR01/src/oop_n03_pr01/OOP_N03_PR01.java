package oop_n03_pr01;

import rs.ac.singidunum.igre.oop.Lav;
import rs.ac.singidunum.igre.oop.NepokretanObjekat;

public class OOP_N03_PR01 {

    public static void main(String[] args) {
         // pravimo "fantasy 2d igru" i radimo organizaciju koda
         // prvo sto trebamo znati jeste kako ta igra otprilike funkcionise da 
         // bi mogli rasporediti kod kako treba
         
         //     -(abstract) Model (x, y, ugao, slika)
         //         -(concrete/final) NepokretanObjekat (+ naziv)
         //         -(abstract) PokretanObjekat (+ brzina) *kreciSeVreme, *kreciSePut
         //             -(concrete) Igrac (+username, dizajn, zivot, snaga)
         //             -(abstract) Neprijatelj (+zivot, snaga, naziv)
         //                 -(concrete) Lav
         //                 -(concrete) Duh (+ UdeoVremenaKadaJeNevidiljiv)
         
         NepokretanObjekat drvo = new NepokretanObjekat(-8.4, 1.0, Math.toRadians(35), "assets/tree.res", "Obicno drvo");
         Lav lav1 = new Lav(10, 4.5, Math.toRadians(45), "assets/lav.res", 3, "obican lav", 100, 10);
         
         System.out.println(lav1);
         
         lav1.kreciSePut(10);
         
         System.out.println(lav1);
         
         lav1.okreniSe(180);
         
         System.out.println(lav1);
         
         lav1.kreciSePut(10);
         
         System.out.println(lav1);
    }
    
}
