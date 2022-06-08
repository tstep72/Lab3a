package pl.lublin.wsei.java.cwiczenia.console;

import pl.lublin.wsei.java.cwiczenia.NoblistList;
import pl.lublin.wsei.java.cwiczenia.Noblista;

public class NoblistListTest {
    public static void main(String[] args) {
        NoblistList list = new NoblistList("nobel_prize_by_winner.csv");
        for (Noblista nob: list.noblisci) nob.print();
    }
}
