package Java.Kap04;

public class sicherheit{
    public static void main(String[] Args){
        boolean t1 = false;
        boolean t2 = false;
        boolean lad = false;
        boolean gitter = true;
        int ab = 0;

        final int mind = 100;

        boolean startp = false;

        startp = (t1 && t2) && lad && !gitter && (ab >= mind);

        System.out.println("Darf starten: "+startp);





        t1 = true;
        t2 = true;
        lad = true;
        gitter = false;
        ab = 150;

        startp = (t1 && t2) && lad && !gitter && (ab >= mind);

        System.out.println("Darf Starte: "+startp);
    }
}