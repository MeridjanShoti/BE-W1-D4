package it.epicode.esercizio2;

public class Dirigente extends Dipendente {
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
}
