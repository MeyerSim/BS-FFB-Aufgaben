package Java.Kap09;

import java.util.Arrays;

public class Blatt09 {
    public static void main(String[] args){
        //variables

        //aufträge
        auftrag1();
        auftrag2();
        auftrag3();
        System.out.println("");
    }

    //auftrag 1
    public static void auftrag1(){
        //variables
        String[] dresser = {"red", "green", "blue", "grey", "pink", "black", "white"};
        String[] weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //Auftrags-Durchsage
        System.out.println("\nAuftrag 1\n");

        //print out
        for(String i : weekday){
            System.out.println("On "+i+" I wear "+dresser[Arrays.asList(weekday).indexOf(i)]+" socks.");
        }
    }

    //auftrag 2
    public static void auftrag2(){
        //variables
        String[] dresser = {"red", "green", "blue", "grey", "pink", "black", "white"};
        String[] empty_dresser = new String[3];

        //Auftrags-Durchsage
        System.out.println("\nAuftrag 2\n");

        //test of sockColor
        System.out.println("Input:\nDay: May\nArray: dresser\nResult: "+sockColor("May", dresser)); //test1 incorrect day
        System.out.println("\nInput:\nDay: Monday\nArray: empty_dresser\nResult: "+sockColor("Monday", empty_dresser)); //test2 incorrect array
        System.out.println("\nInput:\nDay: Saturday\nArray: dresser\nResult: "+sockColor("Saturday", dresser)); //test3 correct input
        }

    //sock color - auftrag 2
    private static String sockColor(String day, String[] dresser){
        //variables
        String[] weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //check for valid input
        if(Arrays.asList(weekday).indexOf(day)==-1||dresser.length!=7)return "error";

        //return socks
        return dresser[Arrays.asList(weekday).indexOf(day)];
    }

    //auftrag 3
    private static void auftrag3(){
        //variables
        String[] faecher = {"AEuP", "IT-S", "IT-Tec", "Eng", "De", "PuG"};

        //Auftrags-Durchsage
        System.out.println("\nAuftrag 3\n");

        //Ausgabe per for-loop
        System.out.println("for-loop\nFaecher: ");
        for(int i = 0; i<faecher.length; i++){
            System.out.print(faecher[i]+" ");
        }
        System.out.println("\n");

        //Ausgabe for-each
        System.out.println("for-each-loop\nFaecher: ");
        for(String i:faecher){
            System.out.print(i+" ");
        }
        System.out.print("\n");
    }
}
