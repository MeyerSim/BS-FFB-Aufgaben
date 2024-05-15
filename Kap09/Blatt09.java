package Java.Kap09;

import java.util.Arrays;

public class Blatt09 {
    public static void main(String[] args){
        //variables
        Scanner in = new Scanner(System.in);

        //aufträge
        auftrag1();
        auftrag1b(in);
        auftrag2();
        auftrag3();
        auftrag4();
        System.out.println("");

        //close Scanner
        in.close();
    }

    //auftrag 1
    private static void auftrag1(){
        //variables
        String[] dresser = {"red", "green", "blue", "grey", "pink", "black", "white"};
        String[] weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //Auftrags-Durchsage
        System.out.println("\nAuftrag 1\n");

        //print out
        if(dresser.length == weekday.length){
            for(String i : weekday){
                System.out.println("On "+i+" I wear "+dresser[Arrays.asList(weekday).indexOf(i)]+" socks.");
            }
        }else{
            System.out.println("missmatched array size");
        }
    }

    //auftrag 1b
    private static void auftrag1b(Scanner in){
        //variables
        String[] dresser = {"red", "green", "blue", "grey", "pink", "black", "white"};
        String[] weekday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int idx;
        boolean valid_input = false;

        //Auftrags-Durchsage
        System.out.println("\nAuftrag 1b\n");

        //print socks
        do{
            System.out.println();
            idx = Arrays.asList(weekday).indexOf(in.nextLine());
            if(idx!=-1){
                valid_input = true;
            }else{
                System.out.println("Invalid input!\nPlease try again.");
            }
        }while(valid_input==false);
        System.out.println("Today's socks are "+dresser[idx]);
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

        //Ausgabe for-loop
        System.out.println("for-loop\nFaecher: ");
        for(int i = 0; i<faecher.length; i++){
            System.out.print(faecher[i]+" ");
        }
        System.out.println("\n");

        //Ausgabe for-loop invers
        System.out.println("for-loop invers\nFaecher: ");
        for(int i = faecher.length; i>0; i--){
            System.out.print(faecher[i-1]+" ");
        }
        System.out.println("\n");

        //Ausgabe for-each
        System.out.println("for-each-loop\nFaecher: ");
        for(String i:faecher){
            System.out.print(i+" ");
        }
        System.out.print("\n");
    }

    //auftrag 4
    private static void auftrag4(){
        //variables
        int[] grades = {1, 1, 1, 2, 1, 2};
        double average = 0;
        int min = 0;
        int max = 0;

        //Auftrags-Durchsage
        System.out.println("\nAuftrag 4\n");

        //print grades
        System.out.println("Grades: ");
        for(int i:grades){
            System.out.print(i+" ");
        }
        System.out.println("\n");

        //print average
        for(int i:grades){
            average += i;
        }
        average /= 6;
        System.out.println("Average grade: "+average);

        //print min and max
        for(int i:grades){
            if(min==0||i<min)min=i;
            if(max==0||i>max)max=i;
        }
        System.out.println("min: "+min+"\nmax: "+max);
    }
}
