public class Student implements Comparable<Student> {
    private String name;
    private double averageGrade;
    private int yearOfBirth;

    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.averageGrade, this.averageGrade);
    }
}
