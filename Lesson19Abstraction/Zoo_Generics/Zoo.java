package main.Zoo_Generics;

public class Zoo extends PlaceWithCages{



    public Zoo(String name, String address, int numberOfCages) {
        super(numberOfCages);
        if (name.trim().length() > 2) {
            this.name = name;
        } else {
            this.name = "City Zoo";
        }
        if (address.trim().length() > 2) {
            this.address = address;
        } else {
            this.address = "City center";
        }

    }

}
