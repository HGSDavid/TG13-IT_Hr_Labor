# Java Sets

## Definition
Ein Java Set ist eine Kollektion von Elementen. Es gibt keine doppelten Elemente also kann in einem Java Set nicht zweimal "Apfel" stehen. Ein Java set muss nicht geordnet sein.

### Eigenschaften Hash-Set
- Schnell
- Keine Reihenfolge der Elemente
- null Werte akzeptiert

### Eigenschaften LinkedHashSet
- Behälft Einfügereihenfolge 
- Durch verknüpften Listenmechanismus langsamer
- nützlich in Algorithmen, in denen die Reihenfolge wichtig ist, zb. zum iterieren
- null Werte akzeptiert

### Eigenschaften TreeSet
- Sortiert die Elemente
- keine null Werte

## Erstellen
So erstellt man ein Java-Hash-Set:
```java
HashSet<Datentyp> name = new HashSet<>();
```
So erstellt man ein Java-Linked-Hash-Set
```java
LinkedHashSet<Datentyp> name = new LinkedHashSet<>();
```
So erstellt man ein Java-Tree-Set
```java
TreeSet<Datentyp> name = new TreeSet<>();
```

## Allgemeine Befehle

### Element hinzufügen:
Fügt Element hinzu.
```java
name.add("beispiel");
```
Dabei ist zu beachten, dass es keine doppelten Elemente geben darf, daher gibt die Methode `false` zurück, sollte ein gleiches Element schon bestehen.
### Element prüfen:
Dieser Befehl prüft ob ein bestimmtes Element vorhanden ist
```java
name.contains("bespiel");
```
### Element entfernen:
Dieser Befehl entfernt ein Element, wichtig zu beachten ist, dass kein Index genutzt werden kann.
```java
name.remove("beispiel");
```
aber nicht:
```java
name.remove(2);
```

### Leeren:
Dieser Befehl löscht alle Element aus dem Set.
```java
name.clear();
```

### Leere prüfen:
Dieser Befehl prüft ob das Set leer ist.
```java
name.isEmpty();
```

### Größe prüfen:
Dieser Befehl gibt die größe als Integer züruck.
```java
name.size();
```

## Besondere Befehle (funktioneren nur bei Set-Interfaces):

2 Sets erstellen für diese Methoden:
```java
        Set<Integer> a = new HashSet<Integer>();

        a.addAll(Arrays.asList(
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

        Set<Integer> b = new HashSet<Integer>();
        
      b.addAll(Arrays.asList(
            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

```

### Intersection
Intersection gibt nur Elemente zurück, welche in beiden genannten Sets vorhanden sind.
```java
       Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
```

### Union
Unions fügt alle Elemente die in einem und in dem anderen Set ist zusammen, doppelte Elemente werden dabei nur einmal genommen.
```java
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
```

### Difference
Difference gibt alle Elemente aus, die nur in einem Set vorhanden sind.
```java
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
```


## Besondere Befehle
### Nur bei TreeSet, da die anderen Sets nicht sortiert sind:
#### HeadSet:
Gibt eine Teilmenge der Elemente des TreeSets zurück, die vor einem bestimmten Element liegen. Das suchende Element muss sich nicht im Set vorhanden sein. Dabei kann man das suchende Element `beispiel` mit ein oder ausschließen, dafür muss man nach dem suchenden Element, true für einschließen oder false für ausschließen, der default ist false.
```java
name.headSet("beispiel", true);
```
#### TailSet:
Gibt eine Teilmenge der Elemente des TreeSets zurück, die nach einem bestimmten Element liegen. Das suchende Element muss sich nicht im Set vorhanden sein. Dabei kann man das suchende Element `beispiel` mit ein oder ausschließen, dafür muss man nach dem suchenden Element, true für einschließen oder false für ausschließen, der default ist false.
```java
name.tailSet("beispiel",true);
```

#### SubSet:
Gibt eine Teilmenge der Elemente des TreeSets zurück, die zwischen zwei bestimmten Element liegen. Diese beiden Elemente müssen nicht im Set vorhanden sein und können ebenfalls aus und eingeschlossen mithilfe von true oder false nach dem Komma werden.
```java
name.subSet(1,true,5,false);
```
