/*
 * Personen Profil mit Vor- und Nachname, Alter, Geschlecht, Groesse, PLZ und Telephonenummer
 * 
 * Simon Meyer
 * erstellt 29.11.2023
 * zuletzt bearbeitet 17.01.2024
*/

package Java.Kap04;

//import java.io.BufferedReader;

public class profil {

    //Personen-Daten

    private static String name = "Benjamin";
    private static String surname = "Schuessler";
    private static char sex = 'm';
    private static byte age = 23;
    private static float height = 1.84f;
    private static int plz = 86505;
    private static float weight = 71.8f;
    private static String phone = "017645459286";
    private static float bmi = 0f;

    //public profil(){};

    //Main fuer Ausgabe der personen daten

    public static void main(String[] args){
        profil.name="Simon";
        profil.surname="Meyer";
        profil.sex='m';
        profil.age=23;
        profil.height=1.85f;
        profil.plz=86926;
        profil.phone="0176445458686";

        //setName("Jonas");

        //printName();

        isOffage();

        printInfo();
    }

    private static float getbmi(){
        profil.bmi = profil.weight/(profil.height*profil.height);
        return profil.bmi;
    }

    private static boolean isOffage(){
        boolean isOffage = false;
        if (profil.age>=18){
            isOffage = true;
        } else {
            isOffage = false;
        }
        return isOffage;
    }

    //Parce a float to int (programming execise)

    private static int fullKg(){
        int fullKg = (int) weight;
        return fullKg;
    }

    //Print user info
    private static void printInfo(){
        System.out.println("\nName:\t\t"+name+"\nSurname:\t"+surname+"\nSex:\t\t"+sex+"\nAge:\t\t"+age+"\nHeight:\t\t"+height+" m\nweight:\t\t"+weight+"\nPostalcode:\t"+plz+"\nTelephone:\t"+phone);
        System.out.println("\nbmi:\t\t"+getbmi());
        System.out.println("\noffage:\t\t"+isOffage());
        System.out.println("\nWeight in full Kg:\t"+fullKg()+"\n");
    }

    /*
    private static String setName(String str){
        profil.name=str;
        return profil.name;
    }

    private static String getName(){
        return profil.name;
    }

    private static void printName(){
        System.out.println("Name: "+profil.name);
    }
    */
    
}