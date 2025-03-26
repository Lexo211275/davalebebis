import java.io.BufferedReader;
import java.util.List;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class MAPII {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        String inputFileName = "students.txt";
        String outputFileName = "students.dat";
        try {
            BufferedReader bufred = new BufferedReader(new FileReader(inputFileName));
            String xazi;
            while ((xazi = bufred.readLine()) !=null) {
                String[] data = xazi.split(",");
                int id = Integer.parseInt(data[0].trim());
                String lastName = data[2].trim();
                String firstName = data[1].trim();
                int year = Integer.parseInt(data[3].trim());
                double grade = Double.parseDouble(data[4].trim());
                List<String> subjects = Arrays.stream(data, 5, data.length)
                        .map(String::trim)
                        .collect(Collectors.toList());

                students.add(new Student(id, firstName, lastName, year, grade, subjects));
            }
            bufred.close();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFileName));
            oos.writeObject(students);
            oos.close();
            System.out.println("daserealizebuli");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(outputFileName));
            List<Student> deserializedStudents = (List<Student>) ois.readObject();
            ois.close();
            System.out.println("\nDadeseriazilebuli:) students:");
            for (Student student : deserializedStudents) {
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        }
    }