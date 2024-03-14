/**
 *Print "Hello World!" to command line
 * 
 * Simon Meyer
 * 29.11.2023
 */

package Java.Kap04;

public class HelloWorld
{
    /**
     * Main function
     */

     public static void main(String[] args){
        String name = "Simon Meyer";
        System.out.print("\nHello " + name + "!\n\n");
        OneThroughTen();
        System.out.println(ReturnInt(1));
    }

    /*
     * Itteration and If-Else test
     */

    private static void OneThroughTen(){
       for (int i = 1; i<=10; i++){
           if (i == 1){
               System.out.print("1 bis 10: "+i);
            }
            else{
                System.out.print(", "+i);
            }
        }
       System.out.println(";");
    }

    /*
     * Return an Intiger
     */

    private static int ReturnInt(int x){
        return x;
    }

    /*
     * Switch-case test
     */
/*
     public static void switchCase(String str){
        switch (str.length()){
            case(<=10)
        }
     }*/
}