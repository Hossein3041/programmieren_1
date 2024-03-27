package kelb;
class Person{
    Person(String vorname, String nachname, boolean istMitarbeiter, boolean istStudent){ // Im Konstruktor werden alle Objekt-Variablen initialisiert
        m_Vorname = vorname;
        m_Nachname = nachname;
        m_IstMitarbeiter = istMitarbeiter;
        m_IstStudent = istStudent;
    }
    void print(){ // Ausgabe auf der Konsole
        System.out.print(m_Vorname + " " + m_Nachname);
    }
    boolean istMitarbeiter(){
        return m_IstMitarbeiter;
    }
    boolean istStudent(){
        return m_IstStudent;
    }
    String m_Vorname; // *
    String m_Nachname; // * jede Person hat einen Vor- und Nachnamen
    boolean m_IstMitarbeiter; //*
    boolean m_IstStudent; // * ein boolescher Wert hätte gereicht, um Studenten und Mitarbeiter zu unterscheiden
}
class Mitarbeiter extends Person{ // Mitarbeiter erweitern Personen
    Mitarbeiter(String vorname, String nachname, int personalNr, int gehalt){
        super(vorname, nachname, true, false); // Mitarbeiter, kein Student
        m_PersonalNr = personalNr; // *
        m_Gehalt = gehalt; // * Initialisierung der zusätzlichen Objekt-Variablen
    }
    void printMitarbeiter(){ // Ausgabe von Mitarbeiter
        System.out.print(m_PersonalNr + ": ");
        print();
        System.out.println("; Gehalt: " + m_Gehalt);
    }
    int m_Gehalt; // *
    int m_PersonalNr; // * Informationen, die Mitarbeiter, aber nicht Studenten haben
}
class Student extends Person{
    enum Studiengang {INF, WINF, DIM, TWL}; // Studienfach als Enumerationstyp
    Student(String vorname, String nachname, int martikelNr, Studiengang fach){
        super(vorname, nachname, false, true); // Student, kein Mitarbeiter
        m_MatrikelNr = martikelNr; // *
        m_Fach = fach; // * Initialisierung der zusätzlichen Objekt-Variablen
    }
    void printStudent(){
        System.out.print(m_MatrikelNr + ": ");
        print();
        System.out.println("; Studiengang: " + m_Fach);
    }
    int m_MatrikelNr; // *
    Studiengang m_Fach; // * Informationen, die Studenten, aber nicht Mitarbeiter haben
}
class Verwaltung{
    Person[] m_Personen = new Person[2000]; // Die Verwaltung kann sich maximal 2000 Personen merken
    int m_NaechstePersonalNr = 1; // die nächste Personalnummer für Mitarbeiter
    int m_NaechsteMatrikelNr = 1; // die nächste Matrikelnummer für Studenten
    int m_NaechsterEintrag = 0; // der nächste freie Eintrag im Array
    void neuerStudent(String vorname, String nachname, Student.Studiengang fach){ // ein neuer Student
        m_Personen[m_NaechsterEintrag] = new Student(vorname, nachname, m_NaechsteMatrikelNr, fach);
        ++m_NaechsteMatrikelNr;
        ++m_NaechsterEintrag;
    }
    void neuerMitarbeiter(String vorname, String nachname, int gehalt){ // ein neuer Mitarbeiter
        m_Personen[m_NaechsterEintrag] = new Mitarbeiter(vorname, nachname, m_NaechstePersonalNr, gehalt);
        ++m_NaechstePersonalNr;
        ++m_NaechsterEintrag;
    }
    void print(){
        for(int i = 0; i < m_NaechsterEintrag; ++i){
            m_Personen[i].print(); // druckt alle Personen auf der Konsole aus
            System.out.println();
        }
    }
    void printStudenten() {
        for(int i = 0;i < m_NaechsterEintrag;++i)
            if (m_Personen[i].istStudent())
                ((Student)m_Personen[i]).printStudent(); // Typecast, um printStudent() aufrufen zu können ...
    }
    void printMitarbeiter() {
        for(int i = 0;i < m_NaechsterEintrag;++i)
            if (m_Personen[i].istMitarbeiter())
                ((Mitarbeiter)m_Personen[i]).printMitarbeiter(); // ... bzw. Mitarbeiter()
    }
    // Typecast ist extrem hässlich und NICHT objektorientiert
}

public class U11_01_Hochschulverwaltung {
    public static void main(String[] args){
        Verwaltung v = new Verwaltung();
        v.neuerMitarbeiter("Horst","Schlemmer",35000);
        v.neuerMitarbeiter("Anna","Müller", 42000);
        v.neuerStudent("Lieschen","Müller",Student.Studiengang.INF);
        v.neuerMitarbeiter("Arnold","Schwarzenegger",142000);
        v.neuerStudent("Heinz","Ketchup",Student.Studiengang.TWL);
        System.out.println("alle Personen: ");
        v.print(); // druckt alle Personen
        System.out.println("\nalle Mitarbeiter: "); // druckt alle Mitarbeiter
        v.printMitarbeiter();
        System.out.println("\nalle Studenten: "); // druckt alle Studenten
        v.printStudenten(); // druckt alle Studenten
    }
}
