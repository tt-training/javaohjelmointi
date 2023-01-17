package fi.tieturi.kurssi.kokoelmat;

import fi.tieturi.kurssi.Henkilo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

class List {

}

public class H2 {
    public static void main(String[] args) {
        java.util.List<Henkilo> henkilos = new ArrayList<>();
        Henkilo etsittava = new Henkilo("Hilppa", "Hakala", 14);
        henkilos.add(etsittava);
        luoHenkilot(henkilos);
        System.out.println(henkilos);

        if (henkilos.contains(etsittava)) {
            System.out.println(etsittava + " löytyi");
        } else {
            System.out.println(etsittava + " ei löytynyt");
        }
    }

    private static void luoHenkilot(final Collection<Henkilo> kokoelma) {
        kokoelma.add(new Henkilo("Seppo", "Hovi", 94));
        kokoelma.add(new Henkilo("Oskari", "Olematon", -3));
    }
}
