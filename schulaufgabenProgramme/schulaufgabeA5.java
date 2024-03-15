public class schulaufgabeA5 {

    public static void main(String[] Args){

        double t_ist = t_sensor();      //Aktuelle Temperatur
        double lf_ist = lf_sensor();    //Aktuelle Luftfeuchtigkeit

        final double T_GW = 5;          //Grenzwert in °C
        final double LF_GW = 55.0;      //Grenzwert in %

        boolean led_r = false;          //rote  LED
        boolean led_y = false;          //gelbe LED
        boolean led_g = false;          //grüne LED

        //Setze LED zustand
        if(t_ist < T_GW){led_r = true;}else{led_r = false;}
        if(lf_ist >= LF_GW){led_y = true;}else{led_y = false;}
        if(led_r && led_y){led_g = true;}else{led_g = false;}

        //Ausgabe Aktuelles Wetter
        printWetter(t_ist, lf_ist);

        //Gebe LED zustände auf CLI aus
        System.out.println("\nLED ROT :\t"+led_r);
        System.out.println("LED GELB :\t"+led_y);
        System.out.println("LED GRÜN :\t"+led_g+"\n");
    }

    //Generate random value betweeen two given numbers
    private static double rnd(double min, double max){
        return (Math.random()*(max-min))+min;
    }

    //Random value to simulate sensor reading
    private static double t_sensor(){
        return rnd(-30, 50);
    }

    //Random value to simulate sensor reading
    private static double lf_sensor(){
        return rnd(0.5,98);
    }

    //Gebe aktuelles Wetter auf CLI aus
    private static void printWetter(double t_ist, double lf_ist){
        System.out.println("\nAktuelles Wetter:\n");
        System.out.println("Temperatur =\t\t"+t_ist+"\n");
        System.out.println("Luftfeuchtigkeit =\t"+lf_ist+"\n");
    }
}
