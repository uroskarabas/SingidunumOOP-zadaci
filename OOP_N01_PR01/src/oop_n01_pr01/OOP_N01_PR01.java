package oop_n01_pr01;

public class OOP_N01_PR01 {
    public static void main(String[] args) {
        Veverica chip = new Veverica("Chip");
        
        chip.savijDesnuRuku();
        chip.ispruziDesnuRuku();
        chip.savijLevuRuku();
//        chip.ispruziLevuRuku();
        
        chip.pridrzi("LESNIK");
        
        chip.ispruziLevuRuku();
        
        chip.pridrzi("LESNIK");
        
        System.out.println("Veverica pridrzava " + chip.getStaDrzi());
        
//        chip.savijLevuRuku();
//        chip.savijDesnuRuku();
//        chip.ispruziLevuRuku();
        
    }
    
}
