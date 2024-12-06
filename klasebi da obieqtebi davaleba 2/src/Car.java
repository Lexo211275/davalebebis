public class Car
{
    String marka;
    String model;
    int year;
    int id;

    Car(
            String marka,
            String model,
            int year,
            int id
    ) {
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.id = id;
    }
    void startEngine() {
        System.out.println(marka + model + year + id);
    }
}
