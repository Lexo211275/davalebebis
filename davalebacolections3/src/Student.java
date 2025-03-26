    import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

    public class Student {
        private String firstName;
        private String lastName;
        private LocalDate birthDate;
        private List<Integer> grades;

        public Student(String firstName, String lastName, LocalDate birthDate, List<Integer> grades) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            this.grades = new ArrayList<>(grades);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }

        public double getAverageGrade() {
            return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
        }

        @Override
        public String toString() {
            return String.format("%s %s, DOB: %s, Avg Grade: %.2f",
                    firstName, lastName, birthDate, getAverageGrade());
        }
    }
