package Java.Kap04;

import java.util.Scanner;

public class modlo {
    
    public static void main(String[] Args){
        //Deklaration
        int sekIn;
        int w,d,h,m,s;

        //Eingabe gesamt Sekunden
        Scanner in=new Scanner(System.in);
        System.out.print("Eingabe der Sekunden: ");
        sekIn=in.nextInt();

        //Aufteilen in Tage, Stunden, Minuten und Sekunden
        w=sekIn/(7*24*3600);
        sekIn%=(7*24*3600);
        d=sekIn/(24*3600);
        sekIn%=(24*3600);
        h=sekIn/3600;
        sekIn%=3600;
        m=sekIn/60;
        s=sekIn%60;

        //Ausgabe
        System.out.println("\n\nErgebnis:\n"+w+" Woche(n)\n"+d+" Tag(e)\n"+h+" Stunde(n)\n"+m+" Minute(n)\n"+s+" Sekunde(n)\n");

        //Close Scanner
        in.close();
    }
}
