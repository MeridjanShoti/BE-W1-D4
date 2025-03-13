package it.epicode.esercizio3;

import it.epicode.esercizio2.*;

public class Main {
    public static void main(String[] args) {
        Collaboratore volontario1 = new Volontario("Gianfranco", 25, "soffiatore di minestrine presso 'se non è zuppa è panbagnato' ");
        Collaboratore dipendente1 = new DipendenteFullTime(15435, 1209.60, Dipartimento.PRODUZIONE);
        Collaboratore dipendente2 = new DipendentePartTime(23454, 1912.50, Dipartimento.AMMINISTRAZIONE, 120);
        Collaboratore dipendente3 = new Dirigente(36757, 1500.00, Dipartimento.VENDITE);
        Collaboratore volontario2 = new Volontario("Temistualdo", 99, "pettinatore di bambole presso 'giochi penosi'");

        Collaboratore[] collaboratori = {volontario1, dipendente1, dipendente2, dipendente3, volontario2};

        for (Collaboratore collaboratore : collaboratori) {
            collaboratore.checkIn();
        }
    }
}
