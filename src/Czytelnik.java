public class Czytelnik {

    //pola
    private String imie;
    private String nazwisko;
    private String numerkarty;
    private int liczbawypozyczen;

    //konstruktor

    public Czytelnik(String imie, String nazwisko, String numerkarty, int liczbawypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerkarty = numerkarty;
        this.liczbawypozyczen = liczbawypozyczen;
    }
    //getter

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNumerkarty() {
        return numerkarty;
    }

    public int getLiczbawypozyczen() {
        return liczbawypozyczen;
    }
    public void wypiszDane(){
        System.out.println("Imie: " + imie + " nazwisko: " + nazwisko + " numerkarty: " + numerkarty + " liczbawypozyczen: " + liczbawypozyczen);
    }
    public void zwiekszLiczbeWypozyczen(){
        liczbawypozyczen++;
    }
    public void zmniejszLiczbeWypozyczen(){
        if(liczbawypozyczen <= 0){
            return;
        }
        liczbawypozyczen--;
    }
}
