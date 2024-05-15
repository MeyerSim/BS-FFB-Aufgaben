package Java.Kap10;

import java.util.Scanner;

public class Blatt10 {
    
    public static void main(String[] args){
        //variables
        Scanner in = new Scanner(System.in);

        //aufträge
        auftrag1Alpha();
        auftrag1();

        //lower spacer
        System.out.println("");

        //close Scanner
        in.close();
    }

    //auftrag 1-alpha
    private static void auftrag1Alpha(){
        //varibales
        Car passat = new Car();
        Car giulia = new Car("Alfa Romeo", "Giulia (Veloce)", "combustion", "red", (short)280, 55, 7.8, (byte)4, false, true, (short)2018, (short)2018, "LL VS 3333");
        
        //Auftrag-Durchsage
        System.out.println("\nAuftrag1-alpha\n");

        //Print Passat engine power
        System.out.println(passat.getModel()+" engine power = "+passat.getBhp()+"bhp or "+passat.getKW()+"kW\n");
        //Print Giulia engine power
        System.out.println(giulia.getModel()+" engine power = "+giulia.getBhp()+"bhp or "+giulia.getKW()+"kW\n");
        //Print Giulia
        giulia.printSelfInformation();
        System.out.println("");
    }

    //auftrag 1
    private static void auftrag1(){
        //variable
        Car passat = new Car();
        Car alfa_4c = new Car("Alfa Romeo", "4C", "combustion", "red", (short)380, 60, 9.8, (byte)2, true, false, (short)2015, (short)2016, "STA MS 2016");

        //Auftrag-Durchsage
        System.out.println("\nAuftrag1\n");

        //print year of construction
        System.out.println(passat.getBrand()+" - "+passat.getModel()+"\nYear of Construction: "+passat.getYearOfConstruction());
        System.out.println(alfa_4c.getBrand()+" - "+alfa_4c.getModel()+"\nYear of Construction: "+alfa_4c.getYearOfConstruction());
    }
}