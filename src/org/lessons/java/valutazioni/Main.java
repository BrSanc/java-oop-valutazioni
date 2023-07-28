package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studente> studentArray= new ArrayList<Studente>();
        ArrayList<Studente> studentiPromossi = new ArrayList<Studente>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int id = i + 1;
            int percentualeAssenze = random.nextInt(1,100);
            double mediaVoti = random.nextDouble(1,5);

            Studente studente = new Studente(id,percentualeAssenze,mediaVoti);
            studentArray.add(studente);
        }


        System.out.println("LISTA STUDENTI: ");
        for (Studente s: studentArray) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("STUDENTI PROMOSSI: ");
        int count = 0;
        for (Studente s: studentArray) {
            if (s.isPromosso() == true) {
                studentiPromossi.add(s);
                System.out.println(s);
                count += 1;
            }
        }
        System.out.println("Studenti promossi: " + count);






    }
}
