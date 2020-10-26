package sk.jaroslavbeno.kotlin;

public class Auto2 {
    private final String nazov;
    private final int pocetDveri;

    public Auto2(String nazov) {
        this(nazov,4);
    }

    public Auto2(String nazov, int pocetDveri) {
        this.nazov = nazov;
        this.pocetDveri = pocetDveri;
    }

    public String getNazov() {
        return nazov;
    }

    public int getPocetDveri() {
        return pocetDveri;
    }
}

