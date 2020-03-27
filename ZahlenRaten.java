
/**
 * Beschreiben Sie hier die Klasse ZahlenRaten.
 * 
 * @author Wieners
 * @version 2020-03-27-0001
 * 
 */
import java.util.Scanner;
public class ZahlenRaten
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int geheimeZahl;
    private int ergebnis;
    Scanner sc = new Scanner(System.in);

    /**
     * Methode zahlErmitteln ermittelt eine Zahl zwischen 1 und 100
     *
     * @return eine Zahl >= 1 und <= 100 als int
     */
    private int zahlErmitteln(){
        int neueZahl = (int)(Math.random()*100);// ermittelt eine Zahl zwischen 0 und 99
        neueZahl++; //macht daraus eine Zahl zwischen 1 und 100
        return neueZahl;
    }
    
    
    /**
     * Methode leseZahlEin
     * liest eine Zahl von der Tastatur ein
     * 
     * @return Der Rückgabewert ist die eingelesen Zahl
     */
    private int leseZahlEin(){
        System.out.println("Zahl eingeben");
        int i = -1;
        i = sc.nextInt();
        return i;
    }

    
    
    /**
     * Konstruktor für Objekte der Klasse ZahlenRaten
     */
    public ZahlenRaten()
    {   
        geheimeZahl = zahlErmitteln();
        do{
            int eingabe = leseZahlEin();
            ergebnis = rateZahl(eingabe);
        }while (ergebnis != 0);

    }

    
    /**
     * Methode rateZahl
     *
     * @param gerateneZahl die aktuell geratene Zahl
     * @return Der Rückgabewert 0 wenn Zahl korrekt; 1 wenn zu klein; -1 wenn zu groß
     */
    public int rateZahl(int gerateneZahl){
        if (geheimeZahl == gerateneZahl){
            System.out.println("Richtig geraten");
            return 0;
        } else {
            if (geheimeZahl > gerateneZahl){
                System.out.println("Zu klein geraten");
                return 1;
            }
            else {            System.out.println("Zu gross geraten");
                return -1;

            }
        }
    }
}