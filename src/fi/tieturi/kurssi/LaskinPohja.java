package fi.tieturi.kurssi;

import java.util.Scanner;

public class LaskinPohja {
    private static final Scanner skanneri = new Scanner(System.in);
    private static final LaskinPohja laskin = new LaskinPohja();

    public static void main(String[] args) {
        for(; ;) {
            String laskutoimitus = lueLasku();
            int tulos = laske(laskutoimitus);
            System.out.println("Tulos: " + tulos);
        }
    }

    // odottaa laskua muodossa:  "luku1 op luku2" Huom! välilyönnit tärkeitä
    public static int laske(String lasku) {
        // Regex tekisi nätimmin, mutta mennään splitillä..
        String[] osat = lasku.split(" ");
        int luku1 = Integer.valueOf(osat[0]);
        int luku2 = Integer.valueOf(osat[2]);
        String op = osat[1];
        int tulos = switch (op) {
            case "+" -> laskin.plus(luku1, luku2);
            case "-" -> laskin.miinus(luku1, luku2);
            case "*" -> laskin.kerto(luku1, luku2);
            case "/" -> laskin.jako(luku1, luku2);
            default -> {throw new IllegalArgumentException("Huono operaattori:" + op);}
        };
        return tulos;
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
