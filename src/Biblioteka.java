public class Biblioteka {
    //pola
    private Ksiazka[] ksiazki;
    private int liczbaksiazek;

    public Biblioteka(int wielkosc){
        ksiazki = new Ksiazka[wielkosc];
        liczbaksiazek = 0;
    }
    public void dodajksiazke(Ksiazka ksiazka){
        if(liczbaksiazek < ksiazki.length) {
            ksiazki[liczbaksiazek++] = ksiazka;
        } else {
            System.out.println("Za mala pojemnosc biblioteki");
        }
    }

    public void wypiszDostepneKsiazki(){
        for(int i = 0; i < liczbaksiazek; i++){
            Ksiazka ksiazka = ksiazki[i];
            if(ksiazka.getDostepna()){
                ksiazka.wypiszInfo();
            }
        }
    }
    public Ksiazka pobierzKsiazkePoTytule(String tytul){
        for(int i = 0; i < liczbaksiazek; i++){
            Ksiazka ksiazka = ksiazki[i];
            if(ksiazka.getTytul().equalsIgnoreCase(tytul))
                return ksiazka;
        }
        return null;
    }

    public int zwrocLiczbeKsiazek(){
        int liczbaDostepnychKsiazek = 0;
        for(int i = 0; i < liczbaksiazek; i++){
            Ksiazka ksiazka = ksiazki[i];
            if(ksiazka.getDostepna()){
                liczbaDostepnychKsiazek++;
            }
        }
        return liczbaDostepnychKsiazek;
    }
    public void wypozyczKsiazke(String tytul, Czytelnik czytelnik){
        Ksiazka ksiazka = pobierzKsiazkePoTytule(tytul);
        if (ksiazka == null) {
            System.out.println("null error");
            return;
        }
        if (ksiazka.getDostepna()){
            ksiazka.wypiszInfo();
            return;
        }
        ksiazka.wypozycz();
        czytelnik.zwiekszLiczbeWypozyczen();
    }

    public void zwrocKsiazke(String tytul, Czytelnik czytelnik){
        Ksiazka ksiazka = pobierzKsiazkePoTytule(tytul);
        if(ksiazka.getDostepna()){
            System.out.println("Ksiazka " + tytul + "jest dostępna do wypożyczenia");
        }
        ksiazka.zwroc();
        czytelnik.zmniejszLiczbeWypozyczen();
    }

}
