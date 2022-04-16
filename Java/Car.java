class Car{
    private Integer id;
    private String license;
    private Account driver; //driver has inhetirance from Account
    protected Integer passenger;// This creates an encapsulation for passenger and therefore, it can only be accessed here in the class.
    //this means that passenger cannot be modified in the Class main

    public Car (String license, Account driver){
        this.license=license;
        this.driver= driver;
    }

    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger>4){
            this.passenger=passenger;
        }else{
            System.out.println("el numero de pasajeros es incorrecto");
        }
    }

    void printdata () {
        System.out.println("ID: "+ id + " license : " + license + " driver: " + driver.name +" passenger: "+passenger );
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return the driver
     */
    public Account getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Account driver) {
        this.driver = driver;
    }
    
}