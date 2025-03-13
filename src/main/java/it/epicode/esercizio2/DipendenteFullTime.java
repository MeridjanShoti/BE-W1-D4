package it.epicode.esercizio2;

import it.epicode.esercizio3.Collaboratore;

public class DipendenteFullTime extends Dipendente implements Collaboratore {
    @Override
    public double calculateSalary(){
        System.out.println("stipendio full time: " + this.getStipendio());
    return this.getStipendio();}
    public DipendenteFullTime(int matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    @Override
    public void checkIn() {
        System.out.println("Check in full time: " + this.getMatricola());
    }
}
