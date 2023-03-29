package main;

public class CarDemo {

    public static void main(String[] args) {

        Car opel = new Car();
        opel.model = "Vectra";
        opel.currentGear = 5;
        opel.colour = "white";
        opel.maxSpeed = 180;
        opel.currentSpeed = 90;


        Car toyota = new Car();
        toyota.model = "Avensis";
        toyota.currentGear = 3;
        toyota.colour = "blue";
        toyota.maxSpeed = 210;
        toyota.currentSpeed = 120;

        Person ivan = new Person();
        ivan.name = "Ivan";
        ivan.age = 27;
        ivan.setGender('m');

        Person joro = new Person();
        joro.name = "Georgi";
        joro.age = 35;


        System.out.println(opel.model + " is now driving with " + opel.currentSpeed);
        for (int i = 0; i < 1000; i++) {
            opel.speedUp();
        }
        System.out.println(opel.model + " is now driving with " + opel.currentSpeed + " mph.\n");

        System.out.println(toyota.model + " is now driving on " + toyota.currentGear + " gear.");
        toyota.changeGear(5);
        System.out.println(toyota.model + " is now driving on " + toyota.currentGear + " gear.");

        opel.owner = ivan;
        toyota.owner = joro;

        opel.printOwner();
        toyota.printOwner();

    }
}
