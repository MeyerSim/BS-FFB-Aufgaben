package Java.uebung20240307;

import java.util.Scanner;

public class BruttoNettoCalculator{

    //variables in %
    final static double lohnsteuer = 14;                //von Gehalt
    final static double pflegeversicherung = 1.275;     //von Gehalt
    final static double solidaritätszuschlag = 5.5;     //von Lohnsteuer
    final static double kirchensteuer = 9;              //von Lohnsteuer
    final static double rentenversicherung = 9.35;      //von Gehalt
    final static double arbeitslosenversicherung = 3.0; //von Gehalt
    final static double krankenversicherung = 7.3;      //von Gehalt

    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        double brutto = 3000;

        //test netto mathod with known result brutto: 3000 - netto: 1891.35
        System.out.println("Netto Gehalt: "+netto(brutto));

        //get brutto from user and output netto to cli
        System.out.println("Bitte Brutto eingeben:");
        brutto = in.nextDouble();
        System.out.println("Netto Gehalt: "+netto(brutto));
        in.close();
    }

    private static double netto(double brutto){
        double lohnsteuerabgabe = brutto*(lohnsteuer/100);
        double kirche_soli = lohnsteuerabgabe*(solidaritätszuschlag/100)+lohnsteuerabgabe*(kirchensteuer/100);
        double netto = (brutto*(100-lohnsteuer-pflegeversicherung-rentenversicherung-arbeitslosenversicherung-krankenversicherung)/100)-kirche_soli;
        round_two(netto);
        return netto;
    }

    private static double round_two(double x){
        return Math.round((x*100))/100;
    }
}