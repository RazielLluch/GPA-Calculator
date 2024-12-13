import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Student razeStudent = new Student("Raze", 1.62941);

        razeStudent.setSubjects(
                new Subject[]{
                    new Subject("CCC181", 3.0, 2.0),
                    new Subject("CSC130", 3.0, 1.75),
                    new Subject("CSC142", 3.0, 1.5),
                    new Subject("CSC155", 3.0),
                    new Subject("CSC171", 3.0),
                    new Subject("CSC181", 4.0)
                }
        );

        razeStudent.inputGrades();

        razeStudent.printDetails();
    }
}
