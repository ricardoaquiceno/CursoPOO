class Main{
    public static void main (String[] args){
        Car UberX = new UberX ("BZE124", new Account("Andres martínez","1023546897" ), "chevrolete", "spark");
        UberX.setPassenger(5);
        UberX.printdata();

        Car UberVan = new Car("NMJ123", new Account("Anda martínez", "32655895"));
        UberVan.setPassenger(5);
        UberVan.printdata();
    }
}