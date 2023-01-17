package fi.tieturi.kurssi;

import java.io.Serializable;
import java.util.Arrays;

public class Uusi extends Object
        implements Rajapinta, Serializable, AutoCloseable {
    private int luku = 42; // positiivinen kokonaisluku
    AutoCloseable[] taul = new AutoCloseable[5];
    public Uusi() {
        taul[0] = new Uusi();
    }

    public Uusi(int luku) {
        this.luku = luku;
    }


    void metofd() {
        Object [] t= new Object[8];
        t[1] = 1;
        Integer i = Integer.valueOf(5);
        t[0] = i;
        ((String)t[0]).toUpperCase();
    }
    public void isoiksi(String s) {
        s = s.toUpperCase();
    }


    public int getLuku() {
        return luku;
    }

    public void setLuku(int luku) {
        if (luku <= 0) {
            System.err.println("Vain positiivinen kokonaisluku kelpaa, ei: " + luku);
            return;
        }
        this.luku = luku;
    }

    public void setLuku(String luku) {
        this.luku = Integer.parseInt(luku);
    }

    public static void main(String[] args) {
        System.out.println("1 + 2 = " + (1 + 2) );
        String luku = "1";
        if (args.length >= 1) {
            luku = args[0];
        }
        Uusi olio = new Uusi(768);
        System.out.println("luku: " + olio.luku);
        olio.setLuku(luku);
        //olio.luku = -7;
        System.out.println("luku: " + olio.getLuku());

        Integer arvo = null;

        if (olio != null) {
            arvo = 4;
        }
        System.out.println(arvo);
    }

    @Override
    public void teeJotain() {

    }

    @Override
    public void close() throws Exception {
        joku(new Object());
    }

    void joku(Object o) {
        o.toString();
    }

    @Override
    public String toString() {
        Sisäinen sis = new Sisäinen();
        return "Uusi{" +
                "luku=" + luku +
                ", taul=" + Arrays.toString(taul) +
                '}';
    }

    public static class Sisäinen {
        void foo() {
        }
    }

}
