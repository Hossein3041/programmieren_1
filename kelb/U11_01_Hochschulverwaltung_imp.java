package kelb;

public class U11_01_Hochschulverwaltung_imp {
    enum Studiengang {INF, WINF, DIM, TWL}

    ; // die Studiengänge werden wieder als Enumerationstyp deklariert

    public static void main(String[] args) {
        final int MAX = 2000;
        String[] vornamen = new String[MAX];
        String[] nachnamen = new String[MAX];
        boolean[] istStudenten = new boolean[MAX];
        boolean[] istMitarbeiter = new boolean[MAX];
        int[] matrikelNr = new int[MAX];
        int[] personalNr = new int[MAX];
        int[] gehaelter = new int[MAX];
        Studiengang[] faecher = new Studiengang[MAX];
        // statt 1 Array mit Studenten/Mitarbeiter Objekten, jetzt 8 Arrays mit elementaren Daten
        int naechstePersonalNr = 1;
        int naechsteMatrikelNr = 1;
        int naechsterEintrag = 0;
        // gleiche Informationen wie zuvor in der Verwaltungsklasse

        neuerMitarbeiter("Horst", "Schlemmer", 25000, vornamen, nachnamen, istMitarbeiter, personalNr, gehaelter, naechsterEintrag, naechstePersonalNr);
        ++naechsterEintrag;
        ++naechstePersonalNr;
        neuerMitarbeiter("Anna", "Müller", 42000, vornamen, nachnamen, istMitarbeiter, personalNr, gehaelter, naechsterEintrag, naechstePersonalNr);
        ++naechsterEintrag;
        ++naechstePersonalNr;
        neuerStudent("Lieschen", "Müller", Studiengang.INF, vornamen, nachnamen, istStudenten, matrikelNr, faecher, naechsterEintrag, naechsteMatrikelNr);
        ++naechsterEintrag;
        ++naechsteMatrikelNr;
        neuerMitarbeiter("Arnold", "Schwarzenegger", 142000, vornamen, nachnamen, istMitarbeiter, personalNr, gehaelter, naechsterEintrag, naechstePersonalNr);
        ++naechsterEintrag;
        ++naechstePersonalNr;
        neuerStudent("Heinz", "Ketchup", Studiengang.TWL, vornamen, nachnamen, istStudenten, matrikelNr, faecher, naechsterEintrag, naechsteMatrikelNr);
        ++naechsterEintrag;
        ++naechsteMatrikelNr;
        System.out.println("alle Personen:"); // jetzt noch alle Personen ausdrucken
        print(vornamen, nachnamen, naechsterEintrag);
        System.out.println("\nalle Mitarbeiter:");
        printMitarbeiter(vornamen, nachnamen, istMitarbeiter, personalNr, gehaelter, naechsterEintrag); // nur die Mitarbeiter
        System.out.println("\nalle Studenten:");
        printStudenten(vornamen, nachnamen, istStudenten, matrikelNr, faecher, naechsterEintrag); // nur die Studenten
    }

    static void neuerStudent(String vorname, String nachname, Studiengang fach, String[] vornamen, String[] nachnamen, boolean[] istStudenten, int[] matrikelNr, Studiengang[] faecher, int naechsterEintrag, int naechsteMatrikelNr) { // alle betroffenen Arrays müssen übergeben werden
        vornamen[naechsterEintrag] = vorname;
        nachnamen[naechsterEintrag] = nachname;
        istStudenten[naechsterEintrag] = true;
        matrikelNr[naechsterEintrag] = naechsteMatrikelNr;
        faecher[naechsterEintrag] = fach; // hier wäre ++naechsterEintrag und ++naechsteMatrikelNr schön, aber Java hat kein call-by-reference
    }
    static void neuerMitarbeiter(String vorname, String nachname, int gehalt, String[] vornamen, String[] nachnamen, boolean[] istMitarbeiter, int[] personalNr, int[] gehaelter, int naechsterEintrag, int naechstePersonalNr) {
        vornamen[naechsterEintrag] = vorname;
        nachnamen[naechsterEintrag] = nachname;
        istMitarbeiter[naechsterEintrag] = true;
        personalNr[naechsterEintrag] = naechstePersonalNr;
        gehaelter[naechsterEintrag] = gehalt;
    }
    static void print(String[] vornamen, String[] nachnamen, int naechsterEintrag){
        for(int i = 0; i < naechsterEintrag; ++i)
            System.out.println(vornamen[i] + " " + nachnamen[i]);
    }
    static void printStudenten(String[] vornamen, String[] nachnamen, boolean[] isStudenten, int[] matrikelNr, Studiengang[] faecher, int naechsterEintrag){
        for(int i = 0; i < naechsterEintrag; ++i)
            if(isStudenten[i])
                System.out.println(matrikelNr[i] + ": " + vornamen[i] + " " + nachnamen[i] + "; Studiengang: " + faecher[i]);
    }
    static void printMitarbeiter(String[] vornamen, String[] nachnamen, boolean[] istMitarbeiter, int[] personalNr, int[] gehaelter, int naechsterEintrag){
        for(int i = 0; i < naechsterEintrag; ++i)
            if(istMitarbeiter[i])
                System.out.println(personalNr[i] + ": " + vornamen[i] + " " + nachnamen[i] + "; Gehalt: " + gehaelter[i]);
    }
}
