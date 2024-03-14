package Java.Kap05;

import java.util.Scanner;

public class bmi {
    
    public static void main(String[] Args){
        //variables
        Scanner in = new Scanner(System.in);
        double height, weight = 0;
        int age = 0;

        //input size, weight and age
        System.out.println("\nPlease enter your size in meters:");
        height = in.nextDouble();
        System.out.println("\nPlease enter your weight in Kg:");
        weight = in.nextDouble();
        System.out.println("\nPlease enter your age:");
        age = in.nextInt();

        //give bmi and bmi_category
        System.out.println("\nYour bmi is: "+calc_bmi(height, weight)+"\nYou are in the "+bmi_category(calc_bmi(height, weight))+ "category.");

        //give ideal bmi by age
        System.out.println("\nYour ideal bmi range is: "+bmi_range(age));

        //empty line for readability
        System.out.println("");

        //close scanner
        in.close();
    }

    //calculate bmi and return it
    private static double calc_bmi(double size, double weight){
        return weight/(size*size);
    }

    //return apropriate bmi category
    private static String bmi_category(double bmi){
        if(bmi<18.5){
            return "underweight";
        }else if(bmi<25){
            return "normal weight";
        }else if(bmi<30){
            return "overweight";
        }else{
            return "obese";
        }
    }

    //give ideal bmi range for age
    private static String bmi_range(int age){
        if(age<19){
            return "No definitive data for your age group";
        }else if(age<=24){
            return "19 - 24";
        }else if(age<=34){
            return "20 - 25";
        }else if(age<=44){
            return "21 - 26";
        }else if(age<=54){
            return "22 - 27";
        }else if(age<=65){
            return "23 - 28";
        }else{
            return "24 - 29";
        }
    }
}
