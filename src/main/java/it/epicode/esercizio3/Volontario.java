package it.epicode.esercizio3;

import it.epicode.esercizio2.Dipendente;

public class Volontario implements Collaboratore{
    private String nome;
    private int eta;
    private String cv;

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCv() {
        return cv;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Check in volontario: " + this.getNome());
    }
}
