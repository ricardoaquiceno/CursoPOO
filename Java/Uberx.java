class UberX extends Car{

    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){

        super(license, driver);// With this, I call to the costructor method from the parent_class
        this.brand = brand;
        this.model= model;
         }
         @Override
         void printdata() {
             // TODO Auto-generated method stub
             super.printdata();
             System.out.println("brand: "+ this.brand+ "model:  "+this.model);
         }
}
