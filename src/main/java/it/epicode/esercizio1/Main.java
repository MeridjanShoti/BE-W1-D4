package it.epicode.esercizio1;

public class Main {
    public static void main(String[] args) {

        Dipendente dipendente1 = new Dipendente(15435, 1209.60, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(23454, 1912.50, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new Dipendente(36757, 1500.00, Dipartimento.VENDITE);
        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};

        for (Dipendente dipendente : dipendenti) {
            System.out.println("Matricola: " + dipendente.getMatricola());
        }
    }
}
