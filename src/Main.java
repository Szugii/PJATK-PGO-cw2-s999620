public class Main{
public static void main(String[] args) {

     Ksiazka ksiazka1 = new Ksiazka("Harry Potter", "JK Rowling", 100, true);
     Ksiazka ksiazka2 = new Ksiazka("Lalka", "Boleslwa Prus", 200, true);
     Ksiazka ksiazka3 = new Ksiazka("New", "Jan Kowalski", 450, true);
     Ksiazka ksiazka4 = new Ksiazka("Java intro", "Mike Mike", 450, false);

     ksiazka1.wypiszInfo();
     ksiazka4.wypiszInfo();

    Czytelnik czytelnik1 = new Czytelnik("Jan", "Kowalski", "1234student", 1);
    Czytelnik czytelnik2 = new Czytelnik("Jan", "Kucharczyk", "1235student", 0);

    czytelnik1.wypiszDane();
    czytelnik1.zmniejszLiczbeWypozyczen();
    czytelnik1.wypiszDane();


    }
}