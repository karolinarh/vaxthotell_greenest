
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VaxtHotell {

    private List<Vaxt> vaxter = new ArrayList<>();
    //Inkapsling

    public static void printMeny(){
        System.out.println("\nVälkommen till Växthotellet Greenest!");
        System.out.println("1.Visa alla incheckade växter");
        System.out.println("2.Sök efter växtens vätskebehov");
        System.out.println("3.Avsluta programmet\n");

    }

    public void addBefintligVaxt() {
        vaxter.add(new Palm("Laura", 5));
        vaxter.add(new Palm("Olof", 1));
        vaxter.add(new Kaktus("Igge", 0.2));
        vaxter.add(new Köttatande("Meatloaf", 0.7)); //polymorfism
    }

    public void printAllaVaxter(){
        for (Vaxt vaxt: vaxter) {
            System.out.println(vaxt.getVaxtNamn() + "-" + vaxt.getClass().getSimpleName());
        }
    }

        public void hamtaVaxt() {
        String vaxtNamn = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

        if (vaxtNamn == null) {
            JOptionPane.showMessageDialog(null,"Programmet avslutas");
            return;
        }

        for (Vaxt vaxt: vaxter) {
            if (vaxt.getVaxtNamn().equalsIgnoreCase(vaxtNamn.trim())) {
                JOptionPane.showMessageDialog(null,  vaxt.toString());
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Växten finns inte incheckad på hotellet, vänligen kontrollera namnet.");
    }

}



