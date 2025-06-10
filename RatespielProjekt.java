package de.bbq.ratespielprojekt;

import java.util.Scanner;
import java.util.Random;

public class RatespielProjekt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean nochmalSpielen = true;

        while (nochmalSpielen) {
            int geheimZahl = random.nextInt(11);

            System.out.println("Ich habe eine Zahl zwischen 0 und 10 ausgedacht. Rate sie!");

            int eingabe;

            while (true) {
                System.out.print("Gebe die Zahl ein und drücke die Enter-Taste: ");
                eingabe = scanner.nextInt();

                if (eingabe == geheimZahl) {
                    System.out.println("Richtig!");
                    break;
                } else {
                    System.out.println("Falsch! Versuch es noch mal!");
                }
            }

            System.out.print("Noch mal spielen? Wenn ja, tippe 1 (und Enter), sonst egal was (und Enter): ");
            int nochmal = scanner.nextInt();

            if (nochmal == 1) {
                nochmalSpielen = true;
            } else {
                nochmalSpielen = false;
                System.out.println("Tschüss! Bis zum nächsten Mal :-)");
            }
        }

        scanner.close();
    }
}
 
