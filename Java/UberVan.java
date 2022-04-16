import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car{

    Map <String, Map<String , Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    

    public UberVan (String license, Account driver){
          super(license, driver);// With this, I call to the costructor method from the parent_class
     }

     @Override// this override is the way to show polimorfism, we have two methods with the same name but with different details. 
     public void setPassenger(Integer passenger) {
       
            if(passenger>6){
                this.passenger=passenger;
            }else{
                System.out.println("el numero de pasajeros es incorrecto");
            }
       
     }
}
