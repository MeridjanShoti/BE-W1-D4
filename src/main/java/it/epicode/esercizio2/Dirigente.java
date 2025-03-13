package it.epicode.esercizio2;

import it.epicode.esercizio3.Collaboratore;

public class Dirigente extends Dipendente implements Collaboratore {
    public Dirigente() {
    }

    public Dirigente(int matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    @Override
    public double calculateSalary() {
        System.out.println("stipendio Dirigente: " + this.getStipendio() * 2);
        return this.getStipendio() * 2;
    }

    @Override
    public void checkIn() {
        System.out.println("Check in dirigente: " + this.getMatricola());
    }
}
