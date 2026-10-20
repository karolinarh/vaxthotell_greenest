import javax.swing.*;

import java.util.Scanner;


public class StartMenu {
    // Styr huvudmenyn och hanterar användarens menyval.

    public void showMainMenu(){
        VaxtHotell hotell = new VaxtHotell();
        Scanner scanner = new Scanner(System.in);
        hotell.addBefintligVaxt();

        boolean running = true;
        while (running) {
            VaxtHotell.printMeny();

            String val = scanner.nextLine();
            System.out.println("Du valde: " + val);
            System.out.println();

            switch (val) {
                case "1": hotell.printAllaVaxter();
                    break;
                case "2": hotell.hamtaVaxt();
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ogiltigt val, välj 1, 2 eller 3");

            }
        }
        scanner.close();
    }
  }




