Prose

Dieses Java-Projekt bietet eine einfache Möglichkeit, mit Sätzen zu arbeiten und daraus alle enthaltenen Wörter alphabetisch sortiert zurückzugeben.

_______________

Vorraussetzungen

Maven

Java 17 oder höher empfohlen

__________________

Installation

Das Repository kannst du klonen mit 
git clone https://github.com/merlindcpohl/my_prose.git

cd my_prose

__________________

Projektstruktur

Die wichtigsten Interfaces und Klassen befinden sich im Package `de.htw_berlin.fb4.ossd.prose`:

- `Sentence`  
  Interface zur Repräsentation eines Satzes mit Methoden zur Ausgabe und Wortextraktion.

- `Prose`  
  Interface für eine Sammlung von Sätzen.

- `ProseBuilder`  
  Unterstützt den Aufbau einer Prose-Instanz aus mehreren Sätzen.

Zusätzlich enthält das Package `example` eine Beispielimplementierung:

- `SimpleProse`  
  Implementiert das `Prose`-Interface. Stellt die Sätze als Text dar und bietet eine Methode, um alle enthaltenen Wörter alphabetisch sortiert als Liste zurückzugeben.

_________________

Lizenz



__________________

Beispielverwendung

Falls du das Projekt lokal ausführen möchtest, kann eine `main()`-Methode wie folgt aussehen:

```java
public static void main(String[] args) {
    Sentence s1 = new SimpleSentence("Hallo Welt");
    Sentence s2 = new SimpleSentence("Ich liebe Java");

    Prose prose = new SimpleProse(List.of(s1, s2));

    System.out.println(prose.getText());
    System.out.println(((SimpleProse) prose).getAllWordsSorted());
}



