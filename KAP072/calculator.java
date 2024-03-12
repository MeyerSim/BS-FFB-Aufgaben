package Java.uebung20240307;

public class calculator {

    final static int MAX_ITERATION = 24;
    
    public static void main(String[] Args){
        //variables
        double x, y = 0;

        //spacing top
        System.out.print("\n");

        //sum
        x = rnd(-128,127);
        y = rnd(-128, 127);
        System.out.println("X: "+x+"\tY: "+y+"\nResult of sum: "+sum(x,y)+"\n");

        //sub
        x = rnd(-128,127);
        y = rnd(-128, 127);
        System.out.println("X: "+x+"\tY: "+y+"\nResult of sub: "+sub(x,y)+"\n");

        //prod
        x = rnd(-128,127);
        y = rnd(-128, 127);
        System.out.println("X: "+x+"\tY: "+y+"\nResult of prod: "+prod(x,y)+"\n");

        //quot
        x = rnd(-128,127);
        y = rnd(-128, 127);
        System.out.println("X: "+x+"\tY: "+y+"\nResult of quot: "+quot(x,y)+"\n");

        //pow
        x = rnd(-128,127);
        y = rnd(-128, 127);
        System.out.println("X: "+x+"\tY: "+(int)y+"\nResult of pow: "+pow(x,(int)y)+"\n");

        //sqrt
        System.out.println("X: "+x+"\nResult of sqrt: "+sqrt(x)+"\n");

        //isPrim
        System.out.println("X: "+(int)x+"\nResult of isPrim: "+isPrim((int)x)+"\n");

        //spacing bottom
        System.out.print("\n");
    }

    private static double sum(double x, double y){
        return x + y;
    }

    private static double sub(double x, double y){
        return x - y;
    }

    private static double prod(double x, double y){
        return x * y;
    }

    private static double quot(double x, double y){
        if(y!=0){
            return x / y;
        }else{
            System.out.println("Can not devide through 0!");
            return Double.NaN;
        }
    }

    private static double pow(double base, int pow){
        double result = 1;
        if(pow>=0){
            for(int i = 0; i < pow; i++){
                result = result * base;
            }
        }else{
            for(int i = 0; i > pow; i--){
                result=result * base;
            }
            result = 1 / result;
        }
        return result;
    }

    private static double rnd(double min, double max){
        return (Math.random()*(max-min))+min;
    }

    private static double sqrt(double x){
        double y = 0;
        if(x<0)x=x*(-1);
        for(int i=0;i<MAX_ITERATION;i++){
            if(y==0){
                y = (x+1)/2;
            }else{
                y = (y+(x/y))/2;
            }
        }
        return y;
    }

    private static boolean isPrim(int n){
        if(n<0)n = n*(-1);
        if(n==1){
            return false;
        }else{
            for(int i = 2;i<=sqrt(n);){
                if((n%i)==0)return false;
                if(i==2){
                    i++;
                }else{
                    i += 2;
                }
            }
            return true;
        }
    }
}
