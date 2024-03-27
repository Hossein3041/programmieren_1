package kelb;
public class U08_01_Sortierung {
    public static void main(String[] args){
        int[] field1 = {34,5,0,42,-17};
        selection_sort(field1);
        int[] field2 = {34,5,9,42,-17};
        insertion_sort(field2);
        int[] field3 = {34,5,9,42,-17};
        bubble_sort(field3);
        int[] field4 = {34,5,9,42,-17};
        distribution_counting(field4, big(field4));

    }
    public static int big(int[] field){
        int big = field[0];
        for(int i = 0; i < field.length; ++i)
            if(field[i] > big)
                big = field[i];
        return big;
    }
    public static void distribution_counting(int[] field, int m){
        int[] count = new int[m];
        for(int i = 0; i < field.length; ++i)
            ++count[field[i]];
        /*  Array count wird verwendet, um Häufigkeit des Vorkommens jeder Zahl in field zu zählen
            Beispiel:
            ++count[field[0]]; --> ++count[2]; --> An Index 2 von count, wird inkrementiert.
            ++count[field[1]]; --> ++count[3];  --> An Index 3 von count, wird inkrementier.
            usw...
         */
        for(int i1 = 0, i2 = 0; i1 < count.length; ++i1)
            for(int i3 = 0; i3 < count[i1]; ++i3)
                field[i2++] = i1;
        /*  Dieser Codeschnipsel platziert die sortierten Zahlen von count in das ursprüngliche Array 'field' zurück:

            Die äußere Schleife durchläuft die Anzahl der Vorkommnisse der aktuellen Zahl 'i1' im 'count'
            i3 wird verwendet, um die Anzahl der Vorkommnisse zu zählen.
            Innerhalb der Schleife wird die aktuelle Zahl i1 in field zurück-platziert.
            i2 wird verwendet, um den aktuellen Index im 'field' zu verfolgen.
            Nach Platzierung, wird i2 inkrementiert, um zum nächsten freien Index im 'field' zu gelangen.

            Durchlauf:
            count = {0,2,1,0,3}
            Iteration 1:
            -> i1 ist 0, die innere Schleife wird übersprungen
            Iteration 2:
            -> i1 ist 1, count[1] ist 2.
                -> Innere Schleife, erste Iteration:
                   i3 ist 0, field[i2] (field[0]) wird auf 1 gesetzt
                   field[0] = 1
                   i2 wird inkrementiert

                -> Innere Schleife, zweite Iteration:
                   i3 ist 1, field[i2] (field[1]) wird auf 1 gesetzt.
                   field[1] = 1
                   i2 wird inkrementiert zu 2.

            Iteration 3:
            ...

         */
    }
    public static void selection_sort(int[] field){
        for(int i1 = 0; i1 < field.length-1; ++i1){
            int min = i1;
            for(int i2 = i1+1; i2 < field.length; ++i2){
                if(field[i2] < field[min]){
                    min = i2;
                }
            }
            swap(field, min, i1);
        }
        /* 1. Schleifendurchlauf:

        Nehme den Index 0, und setze den Wert davon als Minimum.

        Vergleiche den nächsten Index, dann den nächsten Index, dann den nächsten Index, bis alle durch sind:
            Falls irgendein Wert kleiner als Minimum ist, aktualisiere den Wert des Minimums.
            Tausche den Wert von Minimum, mit dem Wert von Index 0.
            --> Ergebnis: Aus allen Indexes wurde der kleinste Wert ausgesucht, und in den Index 0 gepackt. (Wir lassen den Index 0 in Ruhe, da dort der kleinste Wert schon enthalten ist.)

        2. Schleifendurchlauf:

        Nehme den Index 1, und setze den Wert davon als Minimum.

        Vergleiche den nächsten Index, dann den nächsten Index, dann den nächsten Index, bis alle durch sind:
            Falls irgendein Wert kleiner als Minimum ist, aktualisiere den Wert des Minimums.
            Tauche den Wert von Minimum, mit dem Wert von Index 1.
            --> Ergebnis: Aus allen Indexes wurde der kleinste Wert ausgesucht, und in den Index 1 gepackt. (Wir lassen den Index 1 in Ruhe, da dort der kleinste Wert schon enthalten ist.)

        Und so weiter ...
        */
    }
    public static void insertion_sort(int[] field){
        for(int i1 = 1; i1 < field.length; ++i1){
            int ival = field[i1];
            int i2 = i1;
            while(i2 > 0 && field[i2-1] > ival){
                field[i2] = field[i2-1];
                --i2;
            }
            field[i2] = ival;
        }
        /*  Eine for-Schleife, die bei 1 beginnt, also beim ersten Index der unsortierten Menge.
            Nach jedem Schleifendurchlauf wird der jeweilige Index in ival gespeichert. Das ist der Wert, den wir einfügen wollen.
            In Variable i2 wird die Position von dem jeweiligen Index gespeichert.
            Eine while-Schleife, die prüft, ob i2 größer Null ist: Damit wird geprüft, dass der vorherige Index größer als Null ist, wodurch versichert wird, dass wir und noch im Array, in der sortierten Menge befinden.
            Es wird ebenfalls geprüft, ob der vorherige Index, von der sortierten Menge field[i2-1], größer ist, als der Index ival, den wir einfügen wollen.
            Falls der vorherige Index größer ist, wird die aktuelle Position (durch i2), durch den Wert von der letzten Position, aktualisiert.
                Der vorherige Wert wird einmal nach rechts verschoben.
            Die Position der aktuellen Index wird um 1 reduzire, um die Bedingung für die Position davor zu prüfen.
            In der letzten Position field[i2], bei dem die vorherigen Werte nicht größer sind, wird ival (der kleinste Wert) gespeichert.
            __________________________________________________________________________________________________
            Es gibt also zwei Mengen...
            Links: die sortierte Menge
            Rechts: Die unsortierte Menge

            Schleifendurchlauf:
            Wert der aktuellen Position (unsortierten Menge) wird gemerkt.
            Es wird geprüft, ob ival kleiner ist, als der vorherige Wert, falls ja, wird der Wert von davor, nach rechts verschoben.
            Und so weiter ...

            Falls der vorherige Wert nicht mehr kleiner ist, wird ival in der momentanen Position platziert.
            Danach wird ival inkrementiert, um den nächsten Index der unsortierten Menge zu bearbeiten.
         */
    }
    public static void bubble_sort(int[] field){
        boolean bAtLeastOneSwap = false;
        for(int i1 = 1; i1 < field.length; ++i1){
            for(int i2 = 0; i2 < field.length-i1; ++i2){
                if(field[i2] > field[i2+1]) {
                    swap(field, i2, i2 + 1);
                    bAtLeastOneSwap = true;
                }
            }
        }
        if(!bAtLeastOneSwap) {
            return;
        }
        /* Die äußere for-Schleife iteriert bis Ende des Arrays, um nach jeder Iteration das größte Element des unsortierten Teils des Arrays an die richtige Position zu bringen.
           Die innere for-Schleife iteriert bis Ende minus 1 des Arrays, womit die benachbarten Elemente zusammen verglichen werden können.
           Die Bedingung prüft, ob das aktuelle Element, größer als sein nächstes Element ist, falls ja, werden diese vertauscht.
           Dadurch wird das größte Element nach rechts verschoben.

           Danach wird i2 inkrementiert, um diesen Vergleich für alle möglichen zusammenstehenden Paare zu machen.

           Nach Ende der inneren for-Schleife, wird die innere for-Schleife inkrementiert, um das nächst-größere Element zu vergleichen, und nach rechts zu schieben.
           Nachdem die äußere for-Schleife zu Ende ist, ist das Array sortiert.
         */
    }
    public static void swap(int[] field, int iPos1, int iPos2){
        int tmp = field[iPos1];
        field[iPos1] = field[iPos2];
        field[iPos2] = tmp;
    }
}