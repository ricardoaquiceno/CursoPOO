class Car{
    Integer id;
    String license;
    String driver; //this one comes from another class
    Integer passenger;

    void printdata () {
        System.out.println("ID: "+ id + " license : " + license + " driver: " + driver +" passenger: "+passenger );
    }
}