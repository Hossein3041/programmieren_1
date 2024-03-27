package kelb;
class Tower{
    public Tower(int iDepth){ // bei der Erzeugung wird gesagt, wie viele Steine maximal abgelegt werden können
        m_arStones = new int[iDepth];
        m_iTop = iDepth-1; // m_arStones.length-1 // Zunächst liegt kein Stein auf dem Turm
    }
    int[] m_arStones;
    int m_iTop;
    public void addStone(int iStone){ // der abzulegende Stein wird übergeben
        m_arStones[m_iTop--] = iStone; // speichere den Stein ab ... und erniedrige danach m_iTop
    }
    public int removeStone(){ // liefere den gelöschten Stein zurück
        int res = m_arStones[++m_iTop]; // erhöhe zuerst m_iTop und speichere den Wert ...
        m_arStones[m_iTop] = 0; // ... und lösche den Stein
        return res;
    }
    public void init(){
        for(int i = 0; i < m_arStones.length; ++i)
            m_arStones[i] = i*2+1;
        m_iTop = -1;
    }
    public void print(int iWidth, int iPos){
        if(m_arStones[iPos] == 0){
            for(int i = 0; i < iWidth; ++i) // wenn kein Stein dort liegt, drucke Blanks
                System.out.print(" ");
        } else {
            for(int i = 0; i < (iWidth-m_arStones[iPos]) / 2; ++i)
                System.out.print(" ");
            for(int i = 0; i < m_arStones[iPos]; ++i)
                System.out.print("+");
            for(int i = 0; i < (iWidth-m_arStones[iPos]) / 2; ++i)
                System.out.print(" ");
        }
    }
}
class TowerWithStones extends Tower {
    public TowerWithStones(int iDepth) {
        super(iDepth);
        for(int i = 0;i < m_arStones.length;++i) {
            m_arStones[i] = i*2+1;
        }
        m_iTop = -1;
    }
}
class Game{
    public Game(int iDepth){ // ein Spiel bekommt als Parameter die Anzahl der Scheiben übergeben
        m_iDepth = iDepth; // im Nachhinein werden 3 Türme erzeugt
        m_arTowers[0] = new TowerWithStones(m_iDepth);
        m_arTowers[1] = new Tower(m_iDepth);
        m_arTowers[2] = new Tower(m_iDepth);
        // das Array m_arTowers existiert bereits, da die Objektvariable bei der Erzeugung initialisiert wurde
        m_arTowers[0].init(); // lege Scheiben auf den 1. Turm
    }
    Tower[] m_arTowers = new Tower[3]; // Objekt-Variablen können bei der Erzeugung initialisiert werden; diese Initialisierung erfolgt noch vor dem Konstruktor
    int m_iDepth;
    // merkt sich 3 Türme und die Anzahl der Scheiben
    public void print(){
        for(int i = 0; i < m_iDepth; ++i){ // für jede Ebene ...
            for(int j = 0; j < m_arTowers.length; ++j){ // ... für jeden Turm
                m_arTowers[j].print(m_iDepth * 2 + 3, i); // ... drucke den Stein
            }
            System.out.println();
        }
        for(int i = 0; i < m_iDepth*6+9; ++i) // drucke zum Schluss noch eine Linie
            System.out.print("-");
        System.out.println("\n\n");
    }
    public void play(){
        print();
        playInternal(m_iDepth,0,2,1);
    }
    public void playInternal(int N, int iFrom, int iTo, int iVia){
        if(N > 0){
            playInternal(N-1, iFrom, iVia, iTo);
            int iStone = m_arTowers[iFrom].removeStone();
            m_arTowers[iTo].addStone(iStone);
            print();
            playInternal(N-1, iVia, iTo, iFrom);
        }
    }
}
public class U09_0_Hanoi_Objektorientiert {
    public static void main(String[] args){
        Game g = new Game(5);
        g.play();
    }
}
