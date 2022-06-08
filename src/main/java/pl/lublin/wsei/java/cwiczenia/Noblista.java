package pl.lublin.wsei.java.cwiczenia;

public class Noblista {
    public String imie, nazwisko, rok, dziedzina, uzasadnienie, kraj, dataRow;

    public Noblista(String dataRow) {
        this.dataRow = dataRow;
        StringBuilder dataRowTemp = new StringBuilder(dataRow);
        Integer pos1 = null, pos2 = null;

        for(int i=0; i < dataRow.length(); i++) {           //usuwanie nadmiernych przecinków: gdy tekst jest pomiedzy znakami "", zamien przecinek na spacje
            if (dataRowTemp.charAt(i) == '\"') {
                if (pos1 == null) pos1 = i;
                else {
                    pos2 = i;
                    for(int j=pos1; j<pos2; j++) {
                        if (dataRowTemp.charAt(j) == ',') dataRowTemp.replace(j, j+1, " ");
                    }
                    pos1 = null;
                    pos2 = null;
                }
            }
        }


        String dataRowFixed = dataRowTemp.toString();

        String[] dataSplit = dataRowFixed.split(",");
        imie = dataSplit[1];
        nazwisko = dataSplit[2];
        rok = dataSplit[12];
        dziedzina = dataSplit[13];
        try { uzasadnienie = dataSplit[16]; } catch (ArrayIndexOutOfBoundsException e1) { uzasadnienie = null; }
        try { kraj = dataSplit[19]; } catch (ArrayIndexOutOfBoundsException e2) { kraj = null; }
    }

    public void print() {
        System.out.println("Noblista:\nImie: " + imie
                + "\nNazwisko: " + nazwisko
                + "\nRok: " + rok
                + "\nDziedzina: " + dziedzina
                + "\nUzasadnienie: " + uzasadnienie
                + "\nKraj: " + kraj + "\n\n");
    }
}
