# Simple Tic-Tac-Toe (Java)

Questo repository contiene un’implementazione completa del gioco **Tic-Tac-Toe (Tris)** sviluppata in Java come progetto didattico nel percorso **Hyperskill – Java Developer**.

Il progetto è stato costruito passo dopo passo, concentrandosi su:
- gestione dell’input da console
- controllo degli errori
- logica dei turni
- condizioni di vittoria e pareggio

---

## Struttura del progetto

Simple Tic-Tac-Toe (Java)
├── src
│ └── tictactoe
│ └── Main.java
├── build.gradle
├── settings.gradle
└── README.md


Tutta la logica del gioco è contenuta nel file `Main.java`.

---

## Funzionamento del gioco

- All’avvio viene stampata una griglia 3×3 vuota.
- I giocatori inseriscono a turno le coordinate della cella.
- Il primo giocatore gioca con **X**, il secondo con **O**.
- Dopo ogni mossa valida la griglia viene aggiornata e ristampata.
- Il gioco termina quando:
  - un giocatore vince
  - oppure tutte le celle sono occupate (pareggio)

---

## Controlli sull’input

Il programma gestisce i seguenti casi di errore:

- **Input non numerico**
You should enter numbers!

- **Coordinate fuori dall’intervallo**
Coordinates should be from 1 to 3!

- **Cella già occupata**
This cell is occupied! Choose another one!


Il programma continua a chiedere l’input finché la mossa non è valida.

---

## Esempio di esecuzione

| |
| |
| |
2 2

| |
| X |
| |
1 1

| O |
| X |
| |


---

## Tecnologie utilizzate

- Java
- IntelliJ IDEA
- Gradle
- Hyperskill Test Framework

---

## Note finali

Il codice è volutamente semplice, leggibile e privo di dipendenze esterne.
È pensato come esercizio di logica, controllo del flusso e gestione dell’input.

---

## Autore

Vincenzo Cavallaro  
Studente di Ingegneria Informatica
