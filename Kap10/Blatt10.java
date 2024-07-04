package Java.Kap10;

import java.util.Scanner;

public class Blatt10 {
    
    public static void main(String[] args){
        //variables
        Scanner in = new Scanner(System.in);

        //aufträge
        auftrag0();
        auftrag1();
        auftrag2();

        //lower spacer
        System.out.println("");

        //close Scanner
        in.close();
    }

    //auftrag 0
    private static void auftrag0(){
        //varibales
        Car passat = new Car();
        Car giulia = new Car("Alfa Romeo", "Giulia (Veloce)", "combustion", "red",
                            (short)280, 55, 7.8,
                            (byte)4, false, true,
                            (short)2018, (short)2018, (short)2023, "LL VS 3333");
        
        //Auftrag-Durchsage
        System.out.println("\nAuftrag 0\n");

        //Print Passat engine power
        System.out.println(passat.getModel()+" engine power = "+passat.getBhp()+"bhp or "+passat.getKW()+"kW\n");
        //Print Giulia engine power
        System.out.println(giulia.getModel()+" engine power = "+giulia.getBhp()+"bhp or "+giulia.getKW()+"kW\n");
        //Update Passat AndroidCarPlay
        System.out.println("Passat - Android-Auto / Apple-Car-Play: "+passat.getAndroidCarplay());
        System.out.println("Making Android-Auto / Apple-Car-Play available.");
        passat.setAndroidCarplay(true);
        System.out.println("Passat - Android-Auto / Apple-Car-Play: "+passat.getAndroidCarplay());
        //Print Giulia
        giulia.printSelfInformation();
        System.out.println("");
    }

    //auftrag 1
    private static void auftrag1(){
        //variable
        Car passat = new Car();
        Car alfa_4c = new Car("Alfa Romeo", "4C", "combustion", "red",
                            (short)380, 60, 9.8,
                            (byte)2, true, false,
                            (short)2015, (short)2016, (short)2023, "STA MS 2016");
        int year = 2024;

        //Auftrag-Durchsage
        System.out.println("\nAuftrag1\n");

        //print year of construction
        System.out.println(passat.getBrand()+" - "+passat.getModel()+"\nYear of Construction: "+passat.getYearOfConstruction());
        System.out.println(alfa_4c.getBrand()+" - "+alfa_4c.getModel()+"\nYear of Construction: "+alfa_4c.getYearOfConstruction());
        //print age of alfa_4c
        System.out.println("\n"+alfa_4c.getBrand()+" - "+alfa_4c.getModel()+"\nis "+alfa_4c.age(year)+" years old as of "+year);
    }

    //auftrag 2
    private static void auftrag2(){
        //variables
        Bankkonto xx00000 = new Bankkonto();
        Bankkonto de500606 = new Bankkonto("Simon", "Meyer", "DE500606", 8192.00, 1000.00, "123456");

        //Auftrag-Durchsage
        System.out.println("\nAuftrag 2\n");

        //print konto info
        xx00000.selfinfo("");
        System.out.println("");
        de500606.selfinfo("");
        System.out.println("");
        de500606.selfinfo("123456");

        //withdraw and deposit
        de500606.deposit(1000);
        System.out.println(de500606.withdraw(1000, "123456")+"whitdrawn");

    }
}