class car:
    id = int
    license = str
    driver =str
    passenger = int
    def printall (self):
        print(str(self.id) + " " + self.license + " "+ self.driver + " "+str(self.passenger) )