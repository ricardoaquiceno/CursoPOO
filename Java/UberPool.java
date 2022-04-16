class UberPool extends Car{

    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model){

        super(license, driver);// With this, I call to the costructor method from the parent_class
        this.brand = brand;
        this.model= model;
         }
}