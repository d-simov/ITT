package Task00TrainingClasses;

public class Person {

    String name;
    int age;
    int height;
    int weight;
    String favouriteDrink;
    Bed bed;

    void growUp() {
        age++;
    }

    void gainWeight() {
        if (weight < height - 60) {
            weight++;
        }
    }

    void drink() {
        System.out.println(name + " is drinking " + favouriteDrink + ".");
    }

    void looseWeight() {
        if (weight > 30) {
            weight--;
        }
    }
}
