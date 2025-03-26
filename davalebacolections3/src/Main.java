import java.util.*;
public class Main {
    public static void main(String[] args) {
//        List<BasketballPlayer> players = new ArrayList<>();
//        players.add(new BasketballPlayer("LeBron", "James", 25, 8, 2, 10, 3));
//        players.add(new BasketballPlayer("Stephen", "Curry", 30, 5, 1, 8, 2));
//        players.add(new BasketballPlayer("Kevin", "Durant", 28, 7, 3, 6, 4));
//        players.add(new BasketballPlayer("Giannis", "Antetokounmpo", 27, 10, 4, 5, 5));
//        players.sort(Comparator.comparingDouble(BasketballPlayer::calculateRating).reversed());
//        System.out.println("Sorted by Rating (Descending):");
//        players.forEach(System.out::println);
//        players.sort(Comparator.comparingDouble(BasketballPlayer::calculateRating));
//        System.out.println("\nSorted by Rating (Ascending):");
//        players.forEach(System.out::println);
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("lightning", "mcqueen", 2018, 60000, new Engine("Petrol", 4, 1.8)));
        cars.add(new Car("BMW", "X5", 2020, 30000, new Engine("Diesel", 6, 3.0)));
        cars.add(new Car("Mercedes", "C-Class", 2017, 70000, new Engine("Petrol", 4, 2.0)));
        cars.add(new Car("Ford", "Focus", 2019, 50000, new Engine("Petrol", 3, 1.5)));
        System.out.println("List");
        cars.forEach(System.out::println);
        cars.sort(Comparator.comparingInt(Car::getYear));
        System.out.println("\nYear");
        cars.forEach(System.out::println);
        cars.sort(Comparator.comparingInt(Car::getMileage));
        System.out.println("\nMileage");
        cars.forEach(System.out::println);
        cars.sort(Comparator.comparingDouble(Car::getEngineVolume));
        System.out.println("\nVolume");
        cars.forEach(System.out::println);
    }
}