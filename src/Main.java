import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        class Student {
            private String name;
            private int age;

            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Student)) return false;
                Student student = (Student) o;
                return age == student.age &&
                        Objects.equals(name, student.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, age);
            }
        }
    }
}