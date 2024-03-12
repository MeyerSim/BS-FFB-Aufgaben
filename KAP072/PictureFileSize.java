package Java.uebung20240307;

import java.util.Scanner;

public class PictureFileSize {
    
    public static void main(String[] Args){

        Scanner in = new Scanner(System.in);
        int width = 1024;           //picture resolution width in pixels
        int height = 768;           //picture resolution height in pixels
        int colordepth = 24;        //colordepth in bits
        
        //test picturesized with known values width 1024, height 768, color 24bit, file size 2304.06 kiB
        picturesize(width, height, colordepth);

        //Custom picture
        System.out.println("Please enter picture width (in pixels)");
        width = in.nextInt();
        System.out.println("Please enter picture height (in pixels)");
        height = in.nextInt();
        System.out.println("Please enter colordepth (in bits)");
        System.out.println("Valid color depths are 8, 16, 24, 32 and 64 (Bit)");
        colordepth = in.nextInt();
        picturesize(width,height,colordepth);
        
        //close scanner
        in.close();
    }

    private static int picturesize(int width, int height, int bitdepth){
        int bits = 0;               //can not be adressed individualy
        int bytes = 0;              //smallest individualy addressable storage unit
        double kiB = 0;             //Displayed file size in Windows

        final int header = 432;     //bmp file header for true color (24bit) - file headers for other color depths are disregarded

        if(bitdepth!=8&&bitdepth!=16&&bitdepth!=24&&bitdepth!=32&&bitdepth!=64){
            System.out.println("Invalid color depth. Value must be either 8, 16, 24, 32 or 64.\n");
            return 1;
        }

        bits = (width*height)*bitdepth+header;
        if((bits%8)!=0){
            bytes = (bits/8)+1;
        }else{
            bytes = bits/8;
        }
        kiB = bytes/Math.pow(2,10);

        System.out.println("File size:\t"+bits+" Bits\n\t\t"+bytes+" Bytes\n\t\t"+kiB+" kiB\n");
        return 0;
    }
}
