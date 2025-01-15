public class Reindeer extends WorkshopMember {
    String name;
    int age;
    int flyingSpeed;
    String noseColor;
    public Reindeer(String name, int age, int flyingSpeed, String noseColor) {
        super();
        this.name = name;
        this.age = age;
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }
    void fly() {
        System.out.println(name + " is flying at a speed of " + flyingSpeed + " km/h");
    }

    void trainForChristmas() {
        System.out.println(name + " is training for Christmas!");
        flyingSpeed += 100;
    }

    // Check fitness level method
    String checkFitnessLevel() {
        if (age <= 5 && flyingSpeed <= 500) {
            return "F";
        } else if (age > 5 && age <= 15 && flyingSpeed <= 500) {
            return "D";
        } else if (age > 15 && flyingSpeed <= 500) {
            return "C";
        } else if (age > 5 && age <= 15 && flyingSpeed > 500) {
            return "A";
        } else if (age > 15 && flyingSpeed > 500) {
            return "B";
        } else {
            return "Unknown";
        }
    }
}
