package org.lessons.java.valutazioni;

import java.util.Scanner;

public class MainException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;

        while(repeat) {
            try {
                System.out.println("Inserisci la percentuale assenze: ");
                int percentualeAssenze = scan.nextInt();

                System.out.println("Inserisci la media voti: ");
                double mediaVoti = scan.nextDouble();

                Studente s = new Studente(1, percentualeAssenze, mediaVoti);
                System.out.println(s);
                repeat = false;
            }catch (NumberFormatException e){
                System.out.println("Inserisci un numero valido: ");
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }

        scan.close();



    }
}
