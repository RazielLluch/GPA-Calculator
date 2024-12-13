import java.util.Scanner;

public class GpaCalculatorMain{

    public static void main(String[] args) {


        Subject []subjects = {
        new Subject("CCC181", 3.0, 2.0),
        new Subject("CSC130", 3.0, 1.75),
        new Subject("CSC142", 3.0, 1.5),
        new Subject("CSC155", 3.0),
        new Subject("CSC171", 3.0),
        new Subject("CSC181", 4.0)
        };

        System.out.println("Input your grades for your subjects(Leave blank if you have no grade for that subject yet)");
        for (Subject subject : subjects) {

            if (subject.getGrade() != null) continue;

            Scanner input = new Scanner(System.in);

            System.out.print(subject.getName() + ": ");
            try {
                subject.setGrade(Double.parseDouble(input.nextLine()));
            } catch (NumberFormatException NE) {
                subject.setGrade(null);
            }
        }

        double cgpa = 1.62941;
        double gpa = getGPA(subjects);
        System.out.println("Your GPA is: " +gpa);
        System.out.println("Youre cGPA is: " +cgpa);
    }

    /**
     *  This method calculates the GPA through a list of subjects and their grades
     * @param subjects is a list of Subject objects that each contains the details of a single subject
     * @return GPA
     */
    public static double getGPA(Subject[] subjects){

        double total_units = 0;
        double total_weighted_grades = 0;

        for (Subject subject : subjects) {
            if (subject.getGrade() == null) continue;
            subject.setWeightedGrade();

            total_weighted_grades += subject.getWeightedGrade();
            total_units += subject.units();
        }

        return total_weighted_grades / total_units;

    }
}
