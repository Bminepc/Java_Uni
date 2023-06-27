/*****************************************/
/* Mathis Steinhage, Benjamin Wendt      */
/* Gruppe: Di10                          */
/* Uebungsblatt: 5, Aufgabe: 15          */
/* Thema: Wettlauf der Fortschritsbalken */
/* Datum: 23.06.2023                     */
/* Status: lauffaehig                    */
/*****************************************/

public class WinnerAnnouncer {
    boolean oneHasWon = false;

    public synchronized void setWon() { // Setzten des "Gewonnen" Status zum Beenden des Programms
        oneHasWon = true;
    }

    public synchronized boolean hasWon() { // Abfragemöglichkeit des Status
        return oneHasWon;
    }
}
