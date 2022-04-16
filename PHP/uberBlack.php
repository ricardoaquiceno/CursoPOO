<?php
require_once('car.php');
class UberBlack extends Car { //this line shows the inheritance, Uber black inherits the Class parent class car
    public $typeCarAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial){ //onstructor from the child class
        parent::__construct($license,$driver); // constructor to be met as the parent class had constructor
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }


}
?>