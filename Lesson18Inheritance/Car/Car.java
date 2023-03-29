package main;

public class Car {

    final int maxGear = 6;
    String model;
    int maxSpeed;
    int currentSpeed;
    String colour;
    int currentGear;
    Person owner;


    void changeSpeed(int newSpeed) {
        if (newSpeed > 0 && newSpeed < maxSpeed) {
            currentSpeed = newSpeed;
        }
        else {
            System.out.println("The given speed is out of range.");
        }
    }

    void speedUp() {
        if (currentSpeed < maxSpeed) {
            System.out.println(model + " is speeding up from " + currentSpeed + " to " + (currentSpeed + 1) + ".");
            currentSpeed++;
        }
    }

    void gearUp() {
        if (currentGear < maxGear) {
            currentGear++;
        }
    }

    void gearDown() {
        if (currentGear > 1) {
            currentGear--;
        }
    }

    void changeGear (int newGear) {
        if (newGear > 0 && newGear <= maxGear) {
            currentGear = newGear;
        }
        else {
            System.out.println("The required speed is below \"0\" or above the maximum speed of the car.");
        }
    }

    void printOwner() {
        System.out.println();
        System.out.print(model + "'s owner is " + owner.name + " and ");
        if (owner.getGender() == 'm') {
            System.out.print("his age is ");
        }
        else if (owner.getGender() == 'f'){
            System.out.print("her age is ");
        }
        else {
            System.out.print("the age of the owner is ");
        }
        System.out.println(owner.age + ".");
    }
}
