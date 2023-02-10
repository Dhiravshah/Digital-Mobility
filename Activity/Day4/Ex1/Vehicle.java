package Ex1;
public class Vehicle {
    private String make;
    private String vehicleNumber;
    private String fuelType;
    private int fuelCapacity;
    private int cc;

    public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
        this.make=make;
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.cc = cc;
    }
    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber=vehicleNumber;
    }
    public void setFuelType(String fuelType){
        this.fuelType=fuelType;
    }
    public void setFuelCapacity(Integer fuelCapacity){
        this.fuelCapacity=fuelCapacity;
    }
    public void setCc(Integer cc){
        this.cc=cc;
    }
    public String getVehicleNumber(){
        return this.vehicleNumber;
    }
    public String getFuelType(){
        return this.fuelType;
    }
    public int getFuelCapacity(){
        return this.fuelCapacity;
    }
    public int getCc(){
        return this.cc;
    }
    public void displayMake()
    {
        
        System.out.println("***"+this.make+"***");
    }
    public void displayBasicInfo()
    {
        System.out.println("Vechicle number: "+ this.vehicleNumber);
        System.out.println("Fuel type: "+this.fuelType);
        System.out.println(" fuel Capactity : "+ this.fuelCapacity);
        System.out.println("CC: "+this.cc);
    }
    public void displayDetailInfo(){
        
    }
}