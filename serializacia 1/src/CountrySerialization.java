import java.io.*;
import java.util.*;
public class CountrySerialization
{
    private static final String FILE_NAME = "countries.txt";

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Country[] countries = new Country[5];
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter country " + (i + 1) + " details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Population: ");
            int population = scanner.nextInt();
            System.out.print("Area: ");
            double area = scanner.nextDouble();
            scanner.nextLine();

            countries[i] = new Country(name, population, area);
        }
        scanner.close();
        serializeCountries(countries);
        Country[] deserializedCountries = deserializeCountries();
        System.out.println("\nDeserialized Countries:");
        for (Country country : deserializedCountries)
        {
            System.out.println(country);
        }
    }
    private static void serializeCountries(Country[] countries)
    {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(countries);
            System.out.println("Countries have been serialized to " + FILE_NAME);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static Country[] deserializeCountries()
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME)))
        {
            return (Country[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
            return new Country[0];
        }
    }
}
