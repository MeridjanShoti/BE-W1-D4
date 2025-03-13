package it.epicode.esercizio2;

import it.epicode.esercizio3.Collaboratore;

public class DipendentePartTime extends Dipendente implements Collaboratore {
    int oreLavorate;



    public DipendentePartTime( int matricola, double stipendio, Dipartimento dipartimento, int oreLavorate) {
        this.oreLavorate = oreLavorate;
        this.stipendio = stipendio;
        this.matricola = matricola;
        this.dipartimento = dipartimento;

    }
    @Override
    public double calculateSalary() {
        double stipendioNetto = this.getStipendio() * ((double) oreLavorate/160);
        System.out.println("stipendio part time: " + stipendioNetto);
            return stipendioNetto;
    }

    @Override
    public void checkIn() {
        System.out.println("Check in part time: " + this.getMatricola());
    }
}

