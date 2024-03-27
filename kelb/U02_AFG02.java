// Schreiben Sie ein Java Programm, das zeigt, dass die booleschen Operatoren
// in Java die DeMorganschen Gesetze erfüllen. Bedenken Sie, dass Sie alle vier möglichen
// Wahrheitswertbelegungen für die zwei booleschen Variablen testen.

package kelb;

public class U02_AFG02 {
    public static void main(String[] args){
        boolean a = true, b = true;
        //boolean a = true, b = false;
        //boolean a = false, b = true;
        //boolean a = false, b = false;

        boolean ges1a = !(a && b);
        boolean ges1b = (!a) || (!b);

        System.out.println(ges1a);
        System.out.println(ges1b);
    }
}
