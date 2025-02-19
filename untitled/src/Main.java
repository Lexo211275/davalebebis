import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Human person1 = new Human("jimshera", "zambaradze", 25);
        Human person2 = new Human("kako", "lakodze", 23);
        person1.walk();
        person1.hangOut(person2);
        Scanner scanner = new Scanner(System.in);

        System.out.println("sheiyvanet saxeli gvari da asaki:");
        String name = scanner.next();
        String surname = scanner.next();
        int age = scanner.nextInt();

        Human person = new Human(name, surname, age);

        person.walk();
        person.hangOut(new Human("kaka", "kakoshvili", 23));

        scanner.close();
    }
}