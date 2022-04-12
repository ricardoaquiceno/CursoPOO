from car import car
from account import Account

if __name__ == "__main__" :
    car=car ("AMS456", Account("Andy Herry", "10263598745"))
    car.passenger=3
    car.id=12345
    car.printall()
