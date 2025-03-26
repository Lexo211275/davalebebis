import java.io.Serializable;
import java.util.List;
import java.io.BufferedReader;
import java.util.List;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Student implements Serializable
{
    private int id;
    private String firstname;
    private String lastName;
    private int year;
    private double grade;
    private Set<String> subjects;

    public Student(int id, String firstname, String lastName, int year, double grade, List<String> subjects) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.year = year;
        this.grade = grade;
        this.subjects = new HashSet<>(subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, grade);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
        {
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        Student other = (Student) obj;
        return id == other.id && Objects.equals(new HashSet<>(subjects), new HashSet<>(other.subjects));
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", grade=" + grade +
                ", subjects=" + subjects +
                '}';
    }

    @Override
    public int compareTo(Student other)
    {
        return Double.compare(this.grade, other.grade);
    }

}
