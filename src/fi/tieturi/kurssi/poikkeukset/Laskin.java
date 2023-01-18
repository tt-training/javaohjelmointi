package fi.tieturi.kurssi.poikkeukset;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Laskin {
    private static final Scanner skanneri = new Scanner(System.in);
    private static final Laskin laskin = new Laskin();

    public static void main(String[] args) {
        for(; ;) {
            String laskutoimitus = lueLasku();
            try {
                String tulos = laskin.laske(laskutoimitus);
                System.out.println("Tulos: " + tulos);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Annoit huonon muotoisen laskutoimituksen, ei tarpeeksi osia. Käytä esim.\n\t\"3 + 4\"");
            } catch (IllegalArgumentException e) {
                System.err.println("Ei hyvä numero, unohditko välilyönnit? Viesti: " + e.getMessage());
            }
        }
    }

    // odottaa laskua muodossa:  "luku1 op luku2" Huom! välilyönnit tärkeitä
    public String laske(String lasku) {
        // Regex tekisi nätimmin, mutta mennään splitillä..
        String[] osat = lasku.split(" ");
        //if (osat.length != 3) throw JokuPoikkeus(); // tämäkin olisi ok
        int luku1;
        try {
            luku1 = Integer.valueOf(osat[0]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Eka luku ei numero", e);
        }
        int luku2 = Integer.valueOf(osat[2]);
        String op = osat[1];
        try {
            int tulos = switch (op) {
                case "+" -> laskin.plus(luku1, luku2);
                case "-" -> laskin.miinus(luku1, luku2);
                case "*" -> laskin.kerto(luku1, luku2);
                case "/" -> laskin.jako(luku1, luku2);
                default -> {
                    throw new NoSuchElementException("Huono operaattori: " + op);
                }
            };
            return String.valueOf(tulos);  // ""+tulos;
        } catch (ArithmeticException e) {
            return "Virhe: Nollalla jako";
        }
    }

    private static String lueLasku() {
        System.out.println("Anna laskutoimitus:");
        return skanneri.nextLine();
    }

    public int plus(int luku1, int luku2) {
        return luku1 + luku2;
    }
    public int miinus(int luku1, int luku2) {
        return luku1 - luku2;
    }
    public int kerto(int luku1, int luku2) {
        return luku1 * luku2;
    }
    public int jako(int luku1, int luku2) {
        return luku1 / luku2;
    }

}
