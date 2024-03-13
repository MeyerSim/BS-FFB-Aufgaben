package Java.uebung20240307;

import java.util.Scanner;

public class temperaturUmrechner {
    
    public static void main(String[] Args){
        //Input
        Scanner in = new Scanner(System.in);
        double t_in = 0;
        double t_out = 0;
        String unitIn = "";
        String unitOut = "";
        boolean validInput = false;

        //get user Input
        System.out.println("Bitte geben Sie ihre Temepraturn ein.\n");
        t_in = in.nextDouble();
        while(validInput == false){
            System.out.println("\nBitte geben Sie ihre Temperatur-Einheit ein.\n");
            unitIn=in.nextLine();

            if((unitIn.equals("Fahrenheit"))||(unitIn.equals("Celsius"))||(unitIn.equals("Kelvin"))){
                System.out.println("\nBitte geben Sie die gewünschte Temperatur-Einheit ein.\n");
                unitOut=in.nextLine();
                if(((unitIn.equals("Fahrenheit"))||(unitIn.equals("Celsius"))||(unitIn.equals("Kelvin")))){
                    validInput = true;
                }else{
                    System.out.println("Eingabe muss entweder 'Celsius', 'Kelvin' oder 'Fahrenheit' lauten.\n");
                }
            }else{
                System.out.println("Eingabe muss entweder 'Celsius', 'Kelvin' oder 'Fahrenheit' lauten.\n");
            }
        }

        //get right converison
        switch(unitIn){
            case "Celsius":
                switch(unitOut){
                    case "Fahrenheit":
                        t_out = celsiusToFahrenheit(t_in);
                        break;
                    case "Kelvin":
                        t_out = celsiusToKelvin(t_in);
                        break;
                    default:
                        t_out = t_in;
                }
                break;

            case "Fahrenheit":
                switch(unitOut){
                    case "Celsius":
                        t_out = fahrenheitToCelsius(t_in);
                        break;
                    case "Kelvin":
                        t_out = fahrenheitToKelvin(t_in);
                        break;
                    default:
                        t_out = t_in;
                }
                break;

            default:
                switch(unitOut){
                    case "Fahrenheit":
                        t_out = kelvinToFahrenheit(t_in);
                        break;
                    case "Celsius":
                        t_out = kelvinToCelsius(t_in);
                        break;
                    default:
                        t_out = t_in;
                }
                break;
        }

        System.out.println("\nEingebe:\t"+t_in+" "+unitIn);
        System.out.println("Ausgabe:\t"+t_out+" "+unitOut+"\n");
        in.close();
    }

    //celsius to fahrenheit
    private static double celsiusToFahrenheit(double cel){
        return ((cel*1.8)+32);
    }

    //fahrenheit to celsius
    private static double fahrenheitToCelsius(double fahr){
        return (fahr-32)/1.8;
    }

    //celsius to kelvin
    private static double celsiusToKelvin(double cel){
        return (cel+273.15);
    }

    //fahreneit to kelvin
    private static double fahrenheitToKelvin(double fahr){
        return celsiusToKelvin(fahrenheitToCelsius(fahr));
    }

    //kelvin to celsius
    private static double kelvinToCelsius(double kel){
        return (kel+273.15);
    }

    //kelvin to fahrenheit
    private static double kelvinToFahrenheit(double kel){
        return celsiusToFahrenheit(kelvinToCelsius(kel));
    }
}
