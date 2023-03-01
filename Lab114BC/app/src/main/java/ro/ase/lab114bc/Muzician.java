package ro.ase.lab114bc;

import java.util.Date;

public class Muzician {

    private String nume;
    private Date dataNasterii;
    private int nrConcerte;
    private String genMuzical; //COUNTRY, HIP HOP, ROCK - spinner
    private String tipMuzician; //TRUPA sau ARTIST - radio buttons

    public Muzician(String nume, Date dataNasterii, int nrConcerte, String genMuzical, String tipMuzician) {
        this.nume = nume;
        this.dataNasterii = dataNasterii;
        this.nrConcerte = nrConcerte;
        this.genMuzical = genMuzical;
        this.tipMuzician = tipMuzician;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Date getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(Date dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public int getNrConcerte() {
        return nrConcerte;
    }

    public void setNrConcerte(int nrConcerte) {
        this.nrConcerte = nrConcerte;
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    public String getTipMuzician() {
        return tipMuzician;
    }

    public void setTipMuzician(String tipMuzician) {
        this.tipMuzician = tipMuzician;
    }

    @Override
    public String toString() {
        return "Muzician{" +
                "nume='" + nume + '\'' +
                ", dataNasterii=" + dataNasterii +
                ", nrConcerte=" + nrConcerte +
                ", genMuzical='" + genMuzical + '\'' +
                ", tipMuzician='" + tipMuzician + '\'' +
                '}';
    }
}
