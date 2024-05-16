public class Schulaufgabe2 {

    public static void main(String[] args){
        //Aufgaben
        aufgabe1();
        aufgabe2();
    }

    //aufgabe1 - Schulaufgabe 3.2
    private static void aufgabe1(){
        //variables
        int input = 2;
        int output = 0;

        output = quad(input);
        System.out.println(output);
    }

    //quad - Schulaufgabe 3.2
    private static int quad(int zahl){
        int ergebnis = zahl * zahl;
        return ergebnis;
    }

    //aufgabe 2
    private static void aufgabe2(){
        //Deklaration Array
        String[] vornamen = new String[2];

        //Innitialisierung
        vornamen[0] = "Hans";
        vornamen[1] = "Franz";

        //Ausgabe des ersten Elementes auf Konsole
        System.out.println(vornamen[0]);
    }
}
