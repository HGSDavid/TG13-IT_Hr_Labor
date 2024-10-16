# Maps in Java

In Java ist eine Map eine Datenstruktur, die Schlüssel Wert Paare speichert. Jedes Schlüssel Wert Paar wird als Eintrag in der Map betrachtet. Die Map-Schnittstelle gehört zum Java Collections Framework und bietet verschiedene Implementierungen, darunter `HashMap`, `TreeMap` und `LinkedHashMap`.

## Grundlagen

### Was ist eine Map?

- **Schlüssel**: Ein einzigartiger Identifikator für jeden Eintrag.
- **Wert**: Die Information, die mit dem Schlüssel verknüpft ist.
- Ein Schlüssel kann nur einmal in einer Map vorhanden sein, aber mehrere Schlüssel können den gleichen Wert haben.

### Wichtige Methoden

- `put(K key, V value)`: Fügt ein Schlüssel-Wert-Paar zur Map hinzu.
- `get(Object key)`: Gibt den Wert zurück, der mit dem angegebenen Schlüssel verknüpft ist.
- `remove(Object key)`: Entfernt das Schlüssel-Wert-Paar für den angegebenen Schlüssel.
- `containsKey(Object key)`: Überprüft, ob ein bestimmter Schlüssel in der Map vorhanden ist.
- `keySet()`: Gibt eine Set-Ansicht der Schlüssel in der Map zurück.
- `values()`: Gibt eine Collection-Ansicht der Werte in der Map zurück.

## Implementierungen von Maps

### 1. HashMap

Eine `HashMap` speichert die Daten in einer Hash-Tabelle.
#### Vorteile: 
- Sehr schnelle Zugriffszeiten für Hinzufügen, Abrufen und Entfernen von Einträgen
- Erlaubt mehrere Null Werte
#### Nachteile:
- keine Ordnung, Reihenfolge kann durch Hinzufügen/Entfernen von Objekten verändert werden
- Nicht Synchronisiert --> nicht Thread sicher, d.H. Wenn mehrere Threads gleichzeitig auf sie zugreifen, kann dies zu ungleichmäßigen Zuständen führen. 

#### Verwendung: 
- Schneller Zugriff auf Daten
- Zählen von Häufigkeiten wie in z.B. Word
- Datenbank Simulation

#### Beispiel

```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // Elemente hinzufügen
        map.put("Apfel", 1);
        map.put("Banane", 2);
        map.put("Orange", 3);
        
        // Wert abrufen
        System.out.println("Wert für 'Banane': " + map.get("Banane"));
        
        // Alle Schlüssel und Werte durchlaufen
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        
        // Schlüssel entfernen
        map.remove("Apfel");
        System.out.println("Nach Entfernen: " + map);
    }
}
```
## 2. Treemap 

#### Eigenschaft (Vorteil):
-  Eine Treemap wird in ihrer "Natürlichen Reihenfolge" sortiert, so z.B. bei Strings Alphabetisch

#### Verwendung: 
- Überall wo etwas sortiert sein Muss z.B. 
- Ranglisten
- Telefonbuch
#### Nachteile:
- Langsamer als Hashmap
- erlaubt keine Null Werte --> NullPointerException


#### Beispiel:
```Java

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        // Elemente hinzufügen
        treeMap.put("Banane", 2);
        treeMap.put("Apfel", 1);
        treeMap.put("Orange", 3);
        
        // Alle Schlüssel und Werte in sortierter Reihenfolge durchlaufen
        for (String key : treeMap.keySet()) {
            System.out.println(key + ": " + treeMap.get(key));
        }
    }
}
```
## 3. Linked Hashmap
#### Eigenschaft
- Die `Linked Hashmap` ist eine Unterklasse der `Hashmap` und hat daher alle Eigenschaften der `Hashmap`
- Zur speicherung der Daten wird eine doppelt verkettete Liste verwendet um die Reihenfolge der Einführung beizubehalten

#### Vorteile: 
- Behält einführungs Reihenfolge ein 
- Ähnliche Leistung wie `Hashmap`
- Option zur LRU (least recently used) Reihenfolge --> Sortier nach Nutzung

#### Nachteile:
- Benötigt mehr Speicherplatz
- Geringfügig langsamer als Hashmap
- Ebenfalls keine Thread Synchronisierung 

#### Verwendung: 
- Datenbank Abfrage mit geordneter Ausgabe
- Datenverwaltung mit geordneter Einführung

#### Beispiel:
```Java 
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        
        // Elemente hinzufügen
        linkedHashMap.put("Banane", 2);
        linkedHashMap.put("Apfel", 1);
        linkedHashMap.put("Orange", 3);
        
        // Alle Schlüssel und Werte in der Einfügereihenfolge durchlaufen
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key + ": " + linkedHashMap.get(key));
        }
    }
}
```
