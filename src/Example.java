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

        System.out.println("Input your grades for your subjects(Leave blank if you have no grade for that subject yet)");
        for (Subject subject : razeStudent.getSubjects()) {

            if (subject.getGrade() != null) continue;

            Scanner input = new Scanner(System.in);

            System.out.print(subject.getName() + ": ");
            try {
                subject.setGrade(Double.parseDouble(input.nextLine()));
            } catch (NumberFormatException NE) {
                subject.setGrade(null);
            }
        }


        System.out.println("Your GPA is: " +razeStudent.getGPA());
        System.out.println("Your cGPA is: " +razeStudent.getNewCGPA());
    }
}
