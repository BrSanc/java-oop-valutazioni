package org.lessons.java.valutazioni;

import java.math.BigDecimal;

public class Studente {
    private int id;
    private int percentualeAssenze;
    private double mediaVoti;

    //-------------Costruttori---------------------

    public Studente(int id, int percentualeAssenze, double mediaVoti) {
        this.id = id;
        this.percentualeAssenze = percentualeAssenze;
        this.mediaVoti = mediaVoti;
    }

    //-------------Getter----------------------------

    public int getId() {
        return id;
    }

    public int getPercentualeAssenze() {
        return percentualeAssenze;
    }

    public double getMediaVoti() {
        return mediaVoti;
    }


    //---------------Setter----------------------------




    //---------------------metodi-----------------------

    public boolean isPromosso(){
        boolean isPromosso = false;
        if (percentualeAssenze > 50){
            isPromosso = false;}
        if (percentualeAssenze <= 50 && percentualeAssenze >= 25 && mediaVoti > 2){
            isPromosso = true;}
        if (percentualeAssenze < 25 && mediaVoti >= 2) {
            isPromosso = true;
        } return isPromosso;
    }

    private String promossoBocciato(){
        String promossoBocciato;
        if (isPromosso()){
            promossoBocciato = "Promosso";
        }else {
            promossoBocciato = "Bocciato";
        }return promossoBocciato;
    }
    @Override
    public String toString() {
        return "Studente{" +
                "id: " + id + " | " +
                "percentualeAssenze: " + percentualeAssenze + " | " +
                "mediaVoti: " + mediaVoti + " | " +
                promossoBocciato() +
                '}';
    }
}
