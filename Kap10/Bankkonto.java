package Java.Kap10;

public class Bankkonto {
    
    //Atributes
    private String firstname = "";
    private String surname = "";
    private String kontonummer = "";
    private double kredit = 0;
    private double limit = 0;
    private String pin = "";

    //Constructor
    public Bankkonto(){
        this.firstname = "Max";
        this.surname = "Mustermann";
        this.kontonummer = "XX00000";
        this.kredit = 0;
        this.limit = 0;
        this.pin = "";
    }

    public Bankkonto(String firstname, String surname, String kontonummer, double kredit, double limit, String pin){
        this.firstname = firstname;
        this.surname = surname;
        this.kontonummer = kontonummer;
        this.kredit = kredit;
        this.limit = limit;
        this.pin = pin;
    }

    //Methods

    //print self-information
    public void selfinfo(String pin){
        if(this.pin.equals(pin)){
            System.out.println("Firstname: "+this.firstname+"\nSurname: "+this.surname+
                            "\nkontonummer: "+this.kontonummer+"\nKredit: "+this.kredit+
                            "\nLimit: "+this.limit);
        }else{
            System.out.println("information denied");
        }
    }

    //deposit
    public void deposit(double amount){
        this.kredit+=amount;
        System.out.println(amount+" deposited");
    }

    //withdraw
    public double withdraw(double amount, String pin){
        if(this.kredit+this.limit>amount && this.pin.equals(pin)){
            this.kredit-=amount;
            return amount;
        }
        return 0;
    }

    //get-Methods

    //get Kontonummer
    /*public String getKontonummer(){
        return this.kontonummer;
    }*/

    //get kredit
    public double getKredit(String pin){
        if(this.pin.equals(pin)) return this.kredit;
        return 0;
    }

    //get limit
    /*public double getLimit(){
        return this.limit;
    }*/
}
