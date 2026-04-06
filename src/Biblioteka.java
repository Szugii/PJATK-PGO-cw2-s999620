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

}
