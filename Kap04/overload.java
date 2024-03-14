// Übung zum Überladen von Methoden 23.01.2024

package Java.Kap04;

import java.util.Scanner;

public class overload {

    public static void main(String[] Args){
        Scanner in=new Scanner(System.in);
        System.out.println("\nEingabe max int: ");
        int inx=in.nextInt();
        System.out.println("Eingabe min int: ");
        int iny=in.nextInt();
        System.out.println("/nRandom int between "+iny+" and "+inx+"\nRandom int: "+rnd(inx,iny));
        System.out.println("\nEingabe max double: ");
        double inxx=in.nextDouble();
        System.out.println("Eingabe min double: ");
        double inyy=in.nextDouble();
        System.out.println("\nRandom double between "+inyy+" and "+inxx+"\nRandom double: "+rnd(inxx,inyy)+"\n");
        in.close();
    }

    private static int rnd(int x,int y){
        return (int)(Math.random()*(x-y))+y;
    }

    private static double rnd(double x, double y){
        return (Math.random()*(x-y))+y;
    }
}
