public class Engine
{
    private String fuelType;
    private int cylinders;
    private double volume;

    public Engine(String fuelType, int cylinders, double volume) {
        this.fuelType = fuelType;
        this.cylinders = cylinders;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return fuelType + ", " + cylinders + " cylinder " + volume + "L";
    }
}
