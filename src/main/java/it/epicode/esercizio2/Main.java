package it.epicode.esercizio2;

public class Main {
    public static void main(String[] args) {

        Dipendente dipendente1 = new DipendenteFullTime(15435, 1209.60, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new DipendentePartTime(23454, 1912.50, Dipartimento.AMMINISTRAZIONE, 120);
        Dipendente dipendente3 = new Dirigente(36757, 1500.00, Dipartimento.VENDITE);
        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};
        System.out.println("Totale stipendi: " + (dipendente1.calculateSalary() + dipendente2.calculateSalary() + dipendente3.calculateSalary()));
    }
}
