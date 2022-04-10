class Main{
    public static void main (String[] args){
        Car car = new Car();
        car.license= "BZE124";
        car.driver= "Andres martínez";
        car.passenger=4;
        car.printdata();

        Car car2 = new Car();
        car2.license= "NMJ123";
        car2.driver= "Anda martínez";
        car2.passenger=4;
        car2.printdata();
    }
}