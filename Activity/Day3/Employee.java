public class Employee{ 
    private String name;
    private String address;
    private String mobile;

    public Employee(){

    }
    public Employee(String name, String address, String mobile){
        this.name=name;
        this.address=address;
        this.mobile=mobile;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setMobile(String mobile){
        this.mobile=mobile;
    }
    public String getName()
    {
        return this.name;
    }
    public String getAddress()
    {
        return this.address;
    }
    public String getMobile()
    {
        return this.mobile;
    }
    public void displayEmployeeDetails(){
        System.out.println("Name:" +this.getName());
        System.out.println("Mobile:" +this.getMobile());
        System.out.println("Address:" +this.getAddress());

    }
}
