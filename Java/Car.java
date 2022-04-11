class Car{
    Integer id;
    String license;
    Account driver; //driver has inhetirance from Account
    Integer passenger;

    public Car (String license, Account driver){
        this.license=license;
        this.driver= driver;
    }

    void printdata () {
        System.out.println("ID: "+ id + " license : " + license + " driver: " + driver.name +" passenger: "+passenger );
    }
}