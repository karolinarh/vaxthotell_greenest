
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VaxtHotell {
    // Lagrar hotellets växter och hanterar sökning efter en växt.

    private List<Vaxt> vaxter = new ArrayList<>();
    //Inkapsling: private gör att listan bara kan nås direkt inom VaxtHotell.


    public static void printMeny(){  // Visar huvudmenyn och returnerar användarens val, eller null vid Avbryt.
        System.out.println("\nVälkommen till Växthotellet Greenest!");
        System.out.println("1.Visa alla incheckade växter");
        System.out.println("2.Sök efter växtens vätskebehov");
        System.out.println("3.Avsluta programmet\n");

    }

    public void addBefintligVaxt() {   //Metod som lägger till befintliga växterna i listan
        vaxter.add(new Palm("Laura", 5));
        vaxter.add(new Palm("Olof", 1));
        vaxter.add(new Kaktus("Igge", 0.2));
        vaxter.add(new Köttatande("Meatloaf", 0.7)); //polymorfism
    }

    public void printAllaVaxter(){
        for (Vaxt vaxt: vaxter) { // Går igenom ett växtobjekt i taget i listan och printar ut alla incheckade växter.
            System.out.println(vaxt.getVaxtNamn() + "-" + vaxt.getClass().getSimpleName());
        }
    }

        public void hamtaVaxt() {  //Metod som frågar efter ett växtnamn och visar växtens vätskebehov om den hittas.
        String vaxtNamn = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

        if (vaxtNamn == null) {
            JOptionPane.showMessageDialog(null,"Programmet avslutas");
            return;
        }

        for (Vaxt vaxt: vaxter) { // Går igenom ett växtobjekt i taget i listan.
            if (vaxt.getVaxtNamn().equalsIgnoreCase(vaxtNamn.trim())) {
                /* Jämför namnen oavsett stora och små bokstäver.
                trim() tar bort mellanslag i början och slutet av användarens svar.
                 */
                JOptionPane.showMessageDialog(null,  vaxt.toString());
                // Visar växtens beskrivning och avslutar sökmetoden.
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Växten finns inte incheckad på hotellet, vänligen kontrollera namnet.");
    }

}



