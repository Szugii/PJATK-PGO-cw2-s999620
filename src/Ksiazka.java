public class Ksiazka {


    //pola
    private String tytul;
    private String autor;
    private int liczbastron;
    private boolean dostepna;
    //konstruktor
    public Ksiazka(String tytul, String autor, int liczbastron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbastron = liczbastron;
        this.dostepna = dostepna;
    }
    public String getTytul() {
        return tytul;
    }
    public void getAutor(String autor) {
        this.autor = autor;
    }
    public int getLiczbastron() {
        return liczbastron;
    }
    public boolean getDostepna() {
        return dostepna;
    }
    public void wypiszInfo(){
        System.out.println("Tytul: "+tytul +", Autor: "+autor + ", Liczbastron: "+liczbastron + ", dostepna: "+dostepna) ;
    }
    public void wypozycz(){
        dostepna = false;
    }
    public void zwroc(){
        dostepna = true;
    }

}
