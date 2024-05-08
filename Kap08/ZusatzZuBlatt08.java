package Java.Kap08;

public class ZusatzZuBlatt08 {
    
    public static void main(String[] Args){
        auftrag9();
    }

    //Auftrag 9
    private static void auftrag9(){
        //variables
        boolean pw_geknackt = false;
        int tries = 0;

        //Wechel Aufgabe haben wir?
        System.out.println("\nAuftrag 9");
    
        //try password
        while(pw_geknackt == false){
            tries++;
            pw_geknackt=pw_check("guess");
            System.out.println("Deine eingabe war: "+pw_geknackt);
        }
        if(pw_geknackt){
            System.out.println("Passwort nach "+tries+" Versuchen gecknackt");
        }
    }
    
    //passwort check
    private static boolean pw_check(String guess){
        String pw = "SuperPw";   //Passwort

        if(guess.equals(pw)){
            return true;
        }else{
            return false;
        }
    }
/*
    //build pw call 1
    private static void build_pw(int length){
        int[] pw_ascii;
        pw_ascii[0] = 0;

        for(int i=47;i<122;){   //char 1
            if(i==57){
                i += 7;
                continue;
            }else if(i==90){
                i += 5;
                continue;
            }else{
                i++;
                pw_ascii[0] = i;
                if(length==1){
                    //
                }
                build_pw(1);
            }
    }

    //build pw
    for(int i=47;i<122;){   //char 1
        if(i==57){
            i += 7;
            continue;
        }else if(i==90){
            i += 5;
            continue;
        }else{
            i++;
            for(int j=47;j<122;){   //char 2
                if(j==57){
                    j += 7;
                    continue;
                }else if(j==90){
                    j += 5;
                    continue;
                }else{
                    j++;
                    for(int k=47;k<122;){   //char 3
                        if(k==57){
                            k += 7;
                            continue;
                        }else if(i==90){
                            k += 5;
                            continue;
                        }else{
                            k++;
                            
                            
                        }
                    }
                }
            }
        }
    }
    */
}
