package fi.tieturi.kurssi;

import java.util.Objects;

public class Henkilo {
    private String etunimi; // null
    private String sukunimi; // null
    private int ika; // 0

    // private boolean joku; // false

    public Henkilo() {
        this("[etu]", "[suku]");
    }

    public Henkilo(String etunimi, String sukunimi) {
        this(etunimi, sukunimi, 0);
    }

    public Henkilo(String etunimi, String sukunimi, int ika) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.ika = ika;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Henkilo{");
        sb.append("etunimi='").append(etunimi).append('\'');
        sb.append(", sukunimi='").append(sukunimi).append('\'');
        sb.append(", ika=").append(ika);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Henkilo)) return false;

        Henkilo henkilo = (Henkilo) o;

        if (ika != henkilo.ika) return false;
        if (!Objects.equals(etunimi, henkilo.etunimi)) return false;
        return Objects.equals(sukunimi, henkilo.sukunimi);
    }

    @Override
    public int hashCode() {
        int result = etunimi != null ? etunimi.hashCode() : 0;
        result = 37 * result + (sukunimi != null ? sukunimi.hashCode() : 0);
        result = 37 * result + ika;
        return result;
    }
}
