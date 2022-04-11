function Car(license, driver){
    //here you add the parameters license and driver 
    //to invoke th constructor method and obligue the 
    //usage of the mentioned parameters
    this.id;
    this.license=license; // in this line, we assign to the class the parameters that are received when creating the class.
    this.driver=driver;
    this.passenger;
}
//the below function will be a method from the class
// as seen below is the way to call them. 
Car.prototype.Printall=function(){
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
}