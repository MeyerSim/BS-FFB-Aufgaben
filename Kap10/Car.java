package Java.Kap10;

public class Car {

    //Attributes

    //general information
    private String brand = "";              //brand name
    private String model = "";              //modle deaignation
    private String engine_type = "";        //cobustion, hydrogen, ev
    private String color = "";              //color - red, green, blue, black, white, yellow
    //performance
    private short bhp = 0;                  //engine power in BreakHorsePower
    private double kW = 0;                  //engine power in KiloWatts
    private double fuel_tank_size = 0;      //in Liters or kWh
    private double fuel_consumption = 0;    //in Liters or kWh per 100km
    //interior, infotainment
    private byte seats = 0;                 //number of seats
    private boolean convertible = false;    //convertible car
    private boolean android_carplay = false;//Support for Android-Auto and/or Apple-car-play
    //legal information
    private short year_of_construction = 0; //year the car was built
    private short first_registration = 0;   //year the car was first registered
    private String license_plate = "";      //license plate of vehicle

    //Constrctors

    //Constructor for default car(VW - Passat)
    public Car(){
        //set general attributes
        this.brand = "VolksWagen (VW)";
        this.model = "Passat";
        this.engine_type = "combustion";
        this.color = "gray";
        //set performance attributes
        this.bhp = 140;
        this.kW = this.bhp * 0.735499;
        this.fuel_tank_size = 70;
        this.fuel_consumption = 5.8;
        //set interior attributes
        this.seats = 5;
        this.convertible = false;
        this.android_carplay = false;
        //set legal information
        this.year_of_construction = 2019;
        this.first_registration = 2019;
        this.license_plate = "GAP GA 232";
    }

    //Constructor for specific car
    public Car(String brand, String model, String engine_type, String color, short bhp, double fuel_tank_size, double fuel_consumption, byte seats, boolean convertible, boolean android_carplay, short year_of_construction, short first_registration, String license_plate){
        //set general attributes
        this.brand = brand;
        this.model = model;
        this.engine_type = engine_type;
        this.color = color;
        //set performance attributes
        this.bhp = bhp;
        this.kW = this.bhp * 0.735499;
        this.fuel_tank_size = fuel_tank_size;
        this.fuel_consumption = fuel_consumption;
        //set interior attributes
        this.seats = seats;
        this.convertible = convertible;
        this.android_carplay = android_carplay;
        //set legal information
        this.year_of_construction = year_of_construction;
        this.first_registration = first_registration;
        this.license_plate = license_plate;
    }

    //Methods

    //give self-information
    public void printSelfInformation(){
        //print general
        System.out.println("\n//General information\nBrand: "+this.brand+"\nModel: "+this.model+"Engine type: "+this.engine_type+"\nColor: "+this.color);

        //print performance
        System.out.print("\nPerformance\nbhp: "+this.bhp+"\nkW: "+this.kW+"\nFuel tank size: "+this.fuel_tank_size);
        if(!this.engine_type.equals("ev")){
            System.out.println("l\nFuel consumption: "+this.fuel_consumption+"l/100km");
        }else{
            System.out.println("kWh\nFuel consumption: "+this.fuel_consumption+"kWh/100km");
        }
    }

    //get-methods

    //get brand
    public String getBrand(){
        return this.brand;
    }

    //get model
    public String getModel(){
        return this.model;
    }

    //get engine type
    public String getEngineType(){
        return this.engine_type;
    }
    
    //get color
    public String getColor(){
        return this.color;
    }

    //get bhp
    public short getBhp(){
        return this.bhp;
    }

    //get kW
    public double getKW(){
        return this.kW;
    }

    //get fuel tank size
    public double getFuelTankSize(){
        return this.fuel_tank_size;
    }

    //get fuel consumption
    public double getFuelConsumption(){
        return this.fuel_consumption;
    }

    //get seats
    public byte getSeats(){
        return this.seats;
    }

    //get convertible
    public boolean getConvertible(){
        return this.convertible;
    }

    //get android carplay
    public boolean getAndroidCarplay(){
        return this.android_carplay;
    }

    //get year of construction
    public short getYearOfConstruction(){
        return this.year_of_construction;
    }

    //get first registration
    public short getFirstRegistration(){
        return this.first_registration;
    }

    //get license plate
    public String getLiecensePlate(){
        return this.license_plate;
    }
    
    //set-methods

    //set brand
    /*
    private void setBrand(String brand){
        this.brand = brand;
    }
    */
    
    //set model
    /*
    private void setModel(String model){
        this.model = model;
    }
    */

    //set engine type
    /*
    private void setModel(String engine_type){
        this.engine_type = engine_type;
    }
    */

    //set color
    /*
    private void setModel(String color){
        this.color = color;
    }
    */

    //set bhp
    public void setBhp(short bhp){
        this.bhp = bhp;
        this.kW = this.bhp * 0.735499;
    }

    //set kW
    public void setKW(double kW){
        this.kW = kW;
        this.bhp = (short)(this.kW * 1.35962115516);
    }
}
