package Java.Kap05;

public class if_uebung {
    public static void main(String[] Args){
		//CLI empty line top
		System.out.println("");

		//call auftraege
		auftrag_1_2_2();
		System.out.println("");	//spacing
		auftrag_1_3_1();
		System.out.println("");	//spacing
		auftrag_2_1();
		System.out.println("");	//spacing
		auftrag_2_2();

		//CLI empty line bottom
		System.out.println("");
	}

	//auftrag 1.2.2
	private static void auftrag_1_2_2(){
		boolean tankleer=true;
		tankleer=tanken(tankleer);
		tanken(tankleer);
	}
	private static boolean tanken(boolean tankleer){
		if(tankleer){
			System.out.println("Fahre Tanken");
			tankleer=false;
		}else{
			System.out.println("Fahre zum Sepp");
			tankleer=true;
		}
		return tankleer;
	}

	//auftrag 1.3.1
	private static void auftrag_1_3_1(){
		int st_zeiger = 13;
		if(st_zeiger<12){
			System.out.println("Wir essen Weißwurst");
		}else if(gestriges_mittagessen_noch_da()){
			System.out.println("Ich esse gestriges");
		}else{
			System.out.println("Ich koche was");
		}

	}

	//Ist gestriges Mittagessen noch da
	private static boolean gestriges_mittagessen_noch_da(){
		if(rnd(0,100)>50)return true;
		return false;
	}

	//Generate random value betweeen two given numbers
    private static double rnd(double min, double max){
        return (Math.random()*(max-min))+min;
    }

	//rnd auf lager
	private static boolean auflager(){
		if(rnd(0,100)>50)return true;
		return false;
	}

	//auftrag 2.1
	private static void auftrag_2_1(){
		System.out.println("Ich nehme "+essen());
	}

	//welches essn ist auf lager
	private static String essen(){
		boolean pizza = auflager();
		boolean pommes = auflager();
		boolean doener = auflager();
		boolean salat = auflager();

		if(pizza){
			return "Pizza";
		}else if(pommes){
			return "Pommes";
		}else if(doener){
			return "doener";
		}else if(salat){
			return "Salat";
		}else{
			return "Wasser";
		}
	}

	//auftrag 2.2
	private static boolean auftrag_2_2(){
		boolean fahrtauglich=false;
        int alter=(int)(Math.random()*14+10);
        if(alter<14){
            System.out.println("Du darfst noch nicht mofa fahren");
        }else if(alter<16){
            System.out.println("Du darfst Mofa fahren, aber kein Motorad");
        }else if(alter<18){
            System.out.println("Du darfst Motorad fahren, aber kein Auto");
        }else{
            System.out.println("Du darfst Auto fahren");
            fahrtauglich=true;
        }
		return fahrtauglich;
	}
}
