package pl.lublin.wsei.java.cwiczenia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class NoblistList {
    public ArrayList<Noblista> noblisci;

    public NoblistList(String nazwaPliku) {
        noblisci = new ArrayList<>();
        String contents;

        try {
            contents = new String(Files.readAllBytes(Paths.get(nazwaPliku)));
        }
        catch (IOException e) {
            System.out.println("Błąd wczytywania pliku .csv -> " + e.getLocalizedMessage());
            e.printStackTrace();
            contents = "";
        }

        String[] items = contents.split("\r?\n|\r");
        for (int i=2; i < items.length; i++) {
            noblisci.add(new Noblista(items[i]));
        }
    }
}
