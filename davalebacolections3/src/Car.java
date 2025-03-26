public class Car
{
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private Engine engine;
    public Car(String brand, String model, int year, int mileage, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public double getEngineVolume() {
        return engine.getVolume();
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + "), Mileage: " + mileage + " km, Engine: " + engine;
    }
}
