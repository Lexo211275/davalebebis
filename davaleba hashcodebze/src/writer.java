import java.util.Arrays;
import java.util.Objects;
public class writer
{
        private String firstName;
        private String lastName;

        public writer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            writer writer = (writer) obj;
            return Objects.equals(firstName, writer.firstName) && Objects.equals(lastName, writer.lastName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName);
        }

        @Override
        public String toString() {
            return "Writer: " + firstName + " " + lastName;
        }
    }
