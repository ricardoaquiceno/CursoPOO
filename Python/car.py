from account import Account
class car:
    id = int
    license = str
    driver = Account("","")
    passenger = int

    def __init__(self, license, driver):# COnstructor to initialize the car
        self.license = license
        self.driver = driver

    def printall (self):
        print(str(self.id) + " " + self.license + " "+ self.driver.name + " "+str(self.passenger) )