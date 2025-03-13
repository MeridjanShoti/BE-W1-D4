package it.epicode.esercizio2;

public abstract class Dipendente {
    protected int matricola;
    protected double stipendio;
    protected Dipartimento dipartimento;

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
    public abstract double calculateSalary();
}
