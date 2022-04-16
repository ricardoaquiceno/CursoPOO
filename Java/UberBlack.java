import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car{

    Map <String, Map<String , Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    

    public UberBlack (String license, Account driver, Map<String, 
                      Map<String,Integer>> typeCarAccepted,ArrayList<String> seatsMaterial ){

        super(license, driver);// With this, I call to the costructor method from the parent_class
        this.seatsMaterial=seatsMaterial;
       // this.typeCarAccepted =typeCarAccepted;

         }
}
