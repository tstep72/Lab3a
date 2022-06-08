package pl.lublin.wsei.java.cwiczenia.console;

import java.io.*;
import pl.lublin.wsei.java.cwiczenia.Noblista;

public class NoblistTest {
    public static void main(String[] args) {
        Noblista noblista = new Noblista("846,Elinor,Ostrom,8/7/1933,6/12/2012,USA,US,\"Los Angeles, CA\",USA,US,\"Bloomington, IN\",female,2009,economics,,2,\"\"\"for her analysis of economic governance, especially the commons\"\"\",Indiana University,\"Bloomington, IN\",USA");
        System.out.println("Noblista:\nImie: " + noblista.imie
                + "\nNazwisko: " + noblista.nazwisko
                + "\nRok: " + noblista.rok
                + "\nDziedzina: " + noblista.dziedzina
                + "\nUzasadnienie: " + noblista.uzasadnienie
                + "\nKraj: " + noblista.kraj + "\n");
    }
}
