class Main{
    public static void main (String[] args){
        Car car = new Car("BZE124", new Account("Andres martínez","1023546897" ));
        car.passenger=4;
        car.printdata();

        Car car2 = new Car("NMJ123", new Account("Anda martínez", "32655895"));
        car2.passenger=4;
        car2.printdata();
    }
}