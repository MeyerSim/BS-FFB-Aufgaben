package Java.IT11c.Kap00.1Java-OOP.6-1Labyrinth;

import javax.swing.*;

/**
 * Bitte ergänzen Sie hier die Methoden aufgabeC bis aufgabeM
 */

public class Aufgaben
{
    public static void aufgabeA()
    {
        // Deklaration einer Variablen mit dem Namen jackFarrow,
        // die ein Objekt des Typs Schatzsucher aufnehmen kann.
        Schatzsucher jackSparrow;

        // Erzeugung eines Objektes der Klasse Schatzsucher
        // und Zuweisung an die Variable jackFarrow
        jackSparrow = new Schatzsucher();

        // Alternativer Code:
        // Die beiden obigen Zeilen könnte man auch in einer Zeile zusammenfassen:
        // Schatzsucher jackSparrow = new Schatzsucher();
        
        // Der Schatzsucher Jack Sparrow bewegt sich um 2 Schritte nach links.
        jackSparrow.geheNachLinks(2);
        
        // to do:  Vervollständigen die Methode AufgabeA, so dass der Schatzsucher Jack Sparrow
        //         in nur 37 Schritten sein Ziel erreicht!
        jackSparrow.geheNachLinks(22);
        jackSparrow.geheNachOben(4);
        jackSparrow.geheNachRechts(8);
        jackSparrow.geheNachUnten(1);
    }

    public static void aufgabeB()
    {
        // Deklaration einer Variablen mit dem Namen hugo,
        // die ein Objekt des Typs UnsichtbarerGeist aufnehmen kann.
        UnsichtbarerGeist hugo = new UnsichtbarerGeist();

        // to do:  Versuchen Sie herauszufinden, wo sich der Geist befindet
        //         und führen Sie ihn in nur 8 Schritten in seine Schatztruhe zurück!
        hugo.geheNachRechts(3);
        hugo.geheNachUnten(3);
        hugo.geheNachLinks(2);
    }    
    
    public static void aufgabeC()
    {
        // Deklaration der lokalen Variablen robo1,
        // die ein Objekt des Typs Roboter aufnehmen kann.
        RoboterGruen robg = new RoboterGruen();

        
        // Erzeugung eines neuen Objektes der Klasse RoboterGruen
        // durch Konstruktoraufruf
        // und Zuweisung an die Variable robo1

        
        // Methodenaufruf der Methode geheNachUnten
        // des Obejektes robo1 ohne Argument
        

        // Methodenaufruf der Methode geheNachUnten mit Argument 2

        
        // to do:  Vervollständigen die Methode aufgabeC, sodass der Roboter robo1
        //         in nur 8 Schritten sein Ziel erreicht!
        robg.geheNachUnten(3);
        robg.geheNachRechts(19);
        robg.geheNachUnten(6);
        robg.geheNachRechts(12);
        robg.geheNachOben(2);
        robg.geheNachLinks(4);
        robg.geheNachOben(12);
        robg.geheNachLinks(4);
        robg.geheNachOben(2);
        robg.geheNachRechts(8);

    }

    public static void aufgabeD()
    {
        // Deklaration der beiden lokalen Variablen schaf und wolf
        // und Zuweisung zweier neuer Objekte der Klassen Schaf und Wolf
        Wolf wolf = new Wolf();
        Schaf schaf = new Schaf();

        
        // to do:  Vervollständigen die Methode aufgabeD, sodass das Schaf und der Wolf
        //         ihren Platz tauschen, ohne dass der Wolf das Schaf auffressen kann.
        wolf.geheNachOben();
        schaf.geheNachUnten();
        wolf.geheNachRechts();
        schaf.geheNachLinks();
        wolf.geheNachOben(2);
        schaf.geheNachUnten(2);
        wolf.geheNachLinks();
        schaf.geheNachRechts();
        wolf.geheNachOben();
        schaf.geheNachUnten();
    }
    
    public static void aufgabeE()
    {
        SokobanE sokoban = new SokobanE();

        sokoban.geheNachRechts();
        sokoban.geheNachOben();
        sokoban.geheNachLinks();
        sokoban.geheNachUnten();
        sokoban.geheNachLinks();
        sokoban.geheNachOben();
    }

    public static void aufgabeF()
    {
        SokobanF sokoban = new SokobanF();

        // to do
        sokoban.geheNachOben(2);
        sokoban.geheNachRechts();
        sokoban.geheNachOben(2);
        sokoban.geheNachLinks();
        sokoban.geheNachUnten(4);
    }

    public static void aufgabeG()
    {
        SokobanG so = new SokobanG();

        // to do
        so.geheNachLinks(3);
        so.geheNachUnten(2);
        so.geheNachRechts();
        so.geheNachOben();
        so.geheNachLinks();
        so.geheNachOben();
        so.geheNachRechts(2);
        so.geheNachLinks();
        so.geheNachUnten(4);
        so.geheNachRechts(2);
        so.geheNachOben(3);
        so.geheNachRechts();
        so.geheNachOben(2);
        so.geheNachLinks();
        so.geheNachUnten(4);
        so.geheNachRechts();
        so.geheNachUnten();
        so.geheNachLinks();
    }

    public static void aufgabeH()
    {
        SokobanH so = new SokobanH();

        // to do
        for(int i = 0; i<=2; i++){
            so.geheNachRechts();
            so.geheNachOben();
            so.geheNachLinks();
            so.geheNachOben();
            so.geheNachRechts();
            so.geheNachUnten();
        }
        so.geheNachRechts();
        so.geheNachOben();
    }

    public static void aufgabeI()
    {
        SokobanI so = new SokobanI();

        // to do
        so.geheNachUnten(2);
        so.geheNachLinks();
        so.geheNachOben();
        so.gehenachLinks();
        so.geheNachOben();
        so.geheNachRechts();
    }

    public static void aufgabeJ()
    {
        SokobanJ so = new SokobanJ();

        // to do
        so.geheNachOben();
        for(int i = 0;i<=1;i++){
            so.geheNachOben();
            so.geheNachRechts();
            so.geheNachLinks();
            so.geheNachUnten(2);
            so.geheNachRechts();
            so.geheNachOben();
            so.geheNachRechts();
            so.geheNachOben();
            so.geheNachUnten();
            so.geheNachLinks(2);
            so.geheNachOben();
            so.geheNachRechts();

        }
    }

    public static void aufgabeK()
    {
        SokobanK sokoban = new SokobanK();

        // to do
    }

    public static void aufgabeL()
    {
        SokobanL sokoban = new SokobanL();

        // to do
    }

    public static void aufgabeM()
    {
        SokobanM sokoban = new SokobanM();

        // to do
    }
}
