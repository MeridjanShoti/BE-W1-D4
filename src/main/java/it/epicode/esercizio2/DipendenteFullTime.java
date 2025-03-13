package it.epicode.esercizio2;

public class DipendenteFullTime extends Dipendente{
    @Override
    public double calculateSalary(){
        System.out.println("stipendio full time: " + this.getStipendio());
    return this.getStipendio();}
    DipendenteFullTime(int matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }
}
