package fi.tieturi.kurssi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        koodi();
        if (1==1)
            return;

        Uusi olio = new Uusi();
        olio.setLuku(-2);
        Uusi.Sisäinen sis = new Uusi.Sisäinen();
    }

    static void koodi() {
        String nimi = "Tommi";
        String toinen = new String("Tommi");
        if ( nimi.equals(toinen)) {
            System.out.println("Samat");
        } else {
            System.out.println("Erit: '" + nimi + "' ja '" + toinen + "'");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nimi).append("!");
        nimi = sb.toString();
        List lista = new ArrayList();
        lista.add(2);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
