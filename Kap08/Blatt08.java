package Java.Kap08;

import java.util.Scanner;

public class Blatt08 {
    
    public static void main(String[] Agrs){

        //variables
        Scanner in = new Scanner(System.in);

        //call methods
        auftrag1();
        auftrag2();
        auftrag2(11,12);
        auftrag2(in);
        auftrag4();
        auftrag5(in);
        auftrag6(in);
        auftrag7(10);
        auftrag8();
        auftrag9(in);

        //Close Scanner
        in.close();
    }

    //programmier Aufgabe 1
    private static void auftrag1(){
        //variables
        int n = (int)rnd(1, 100);

        //Wechel Aufgabe haben wir?
        System.out.println("\nAuftrag 1");

        //Ausgabe Summe 1 bis n
        System.out.println("Summe i bis n("+n+"): "+summe_1_bis_n(n));

        //Ausgabe Gaus
        System.out.println("Gaus: "+gaus(n));
    }

    //Summe aller zahlen von 1 bis n
    private static int summe_1_bis_n(int n){
        //variables
        int p=0;
        //addiere alle zahlen von 1 bis n
        for(int i = 0;i<n;i++){
            p+=(i+1);
        }
        return p;
    }

    //Gaus
    private static int gaus(int n){
        return n*(n+1)/2;
    }

    //programmier Auftrag 2 a
    private static void auftrag2(){
        //Wechel Aufgabe haben wir?
        System.out.println("\nAuftrag 2a");

        for(int i=1;i<=10;i++){
            System.out.println(pow(i,2));
        }
    }

    //programmier Auftrag 2 b
    private static void auftrag2(int x, int y){
        //Wechel Aufgabe haben wir?
        System.out.println("\nAuftrag 2b");

        if(x>y){
            System.out.println("invalid input x must be smaler than y");
        }else{
            for(int i=x;i<=y;i++){
                System.out.println(pow(i,2));
            }
        }
    }

    //programmier Auftrag 2 c
    private static void auftrag2(Scanner in){
        //variables
        int x = 0;
        int y = 0;

        //Wechel Aufgabe haben wir?
        System.out.println("\nAuftrag 2c");

        //set start value x and end value y
        System.out.println("Gebe Startwert ein");
        x = in.nextInt();
        System.out.println("Gebe Endwert ein");
        y = in.nextInt();
        System.out.println("");

        if(x>y){
            System.out.println("invalid input x must be smaler than y");
        }else{
            for(int i=x;i<=y;i++){
                System.out.println((int)pow(i,2));
            }
        }
    }

    //pow method - gives base to the given power
    private static double pow(double base, int pow){
        //variables
        double result = 1;

        //base to the pow power
        if(pow>=0){                         //pow positive
            for(int i = 0; i < pow; i++){   //does not run if pow = 0
                result = result * base;
            }
        }else{                              //pow negative - returns 1/pow
            for(int i = 0; i > pow; i--){
                result=result * base;
            }
            result = 1 / result;
        }
        return result;
    }

    //Auftrag 4
    private static void auftrag4(){
        //variables
        int i = 0;

        //Wechel Aufgabe haben wir?
        System.out.println("\nAuftrag 4");

        while(i<10){
            System.out.println(pow(i+1,2));
            i++;
        }
    }

    //Auftrag 5
    private static void auftrag5(Scanner in){
        //variables
        boolean right_guess=false;
        int secret_nummber=(int)rnd(1,10);

        //Wechel Aufgabe haben wir?
        System.out.println("\nAuftrag 5");

        //guess number
        do{
            if(secret_nummber==in.nextInt()){
                right_guess=true;
            }else{
                System.out.println("Flasch neu raten");
            }
        }while(right_guess==false);
    }

    //Auftrag 6
    private static void auftrag6(Scanner in){
        //variables
        boolean right_guess = false;
        int secret_nummber = (int)rnd(1,100);
        int guess = 0;
        int counter = 0;

        //Wechel Aufgabe haben wir?
        System.out.println("\nAuftrag 6");

        //guess number
        do{
            counter++;
            System.out.println("Versuch - "+counter+". Gebe deinen Tipp ein");
            guess = in.nextInt();
            if(secret_nummber==guess){
                System.out.println("\nDein versuch - "+guess+" - ist richtig!");
                System.out.println("Du hast "+counter+" Versuche gebraucht.");
                right_guess=true;
            }else if(guess<secret_nummber){
                System.out.println("\nFlasch - meine Zahl ist größer.");
            }else{
                System.out.println("\nFlasch - meine Zahl ist kleiner.");
            }
        }while(right_guess==false);
    }

    //Auftrag 7
    private static void auftrag7(int n){
        //variables
        int x = 1;
        int y = 0;
        int swap = 0;

        //Wechel Aufgabe haben wir?
        System.out.println("\nAuftrag 7");

        for(int i = 0;i<n;i++){
            swap = x;
            x += y;
            y = swap;
            System.out.println(x);
        }
    }
    //Auftrag 8 teil 1 und 2
    private static void auftrag8(){
        //variables
        int i = (int)rnd(1,5);

        //Wechel Aufgabe haben wir?
        System.out.println("\nAuftrag 8 - Teil 1");

        System.out.println("\nFactoral of "+i+" equals: "+factorial(i));

        //Wechel Aufgabe haben wir?
        System.out.println("\nAuftrag 8 - Teil 2");

        System.out.println("\nFactoral of "+i+" equals: "+factorial_while(i));
    }

    //factorial
    private static double factorial(int x){
        if(x<0){
            System.out.println("input has to be a positive nummber");
            return 0;
        }else{
            for(int i = 1;i<x;i++){
                x*=i;
            }
            return x;
        }
    }

    //factorial while
    private static double factorial_while(int x){
        double result = 1;
        if(x<0){
            System.out.println("input has to be a positive nummber");
            return 0;
        }else{
            while(x>0){
                result*=x;
                x--;
            }
            return result;
        }
    }

    //Auftrag 9
    private static void auftrag9(Scanner in){
        //variables
        boolean pw_geknackt = false;

        //Wechel Aufgabe haben wir?
        System.out.println("\nAuftrag 9");

        //try password
        while(pw_geknackt == false){
            int guess = in.nextInt();
            pw_geknackt=pw_check(guess);
            System.out.println("Deine eingabe war: "+pw_geknackt);
        }
    }

    //passwort check
    private static boolean pw_check(int guess){
        int pw = (int)rnd(100, 999);   //Passwort

        if(guess==pw){
            return true;
        }else{
            return false;
        }
    }

    //Generate random value betweeen two given numbers
    private static double rnd(double min, double max){
        return (Math.random()*(max-min))+min;
    }
}
