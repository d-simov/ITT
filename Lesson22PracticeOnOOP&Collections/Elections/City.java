package main;

public enum City {

    SOFIA, PLOVDIV, PLEVEN, VELIKO_TYRNOVO, TRYAVNA, POPOVO;

    public static City getNextCity() {
        City[] cities = City.values();
        int index = 0;
        if (index < cities.length) {
            return cities[index++];
        }
        return null;
    }
}
