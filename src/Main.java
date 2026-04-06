public class Main{
public static void main(String[] args) {

     Ksiazka ksiazka1 = new Ksiazka("Harry Potter", "JK Rowling", 100, true);
     Ksiazka ksiazka2 = new Ksiazka("Lalka", "Boleslwa Prus", 200, true);
     Ksiazka ksiazka3 = new Ksiazka("New", "Jan Kowalski", 450, true);
     Ksiazka ksiazka4 = new Ksiazka("Java intro", "Mike Mike", 450, false);

     ksiazka1.wypiszInfo();
     ksiazka4.wypiszInfo();

    }
}