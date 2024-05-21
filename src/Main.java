import java.util.Scanner;

public class Main{

    public static void main(String[] args) {


        // edit your list of subjects and their units here

        Subject []subjects = {
                new Subject("GEC109", 3.0),
                new Subject("ITE112", 3.0),
                new Subject("STT071", 2.0),
                new Subject("STT071.1", 1.0),
                new Subject("ITE125", 3.0),
                new Subject("ITE132", 3.0),
                new Subject("CCC151", 3.0),
                new Subject("PED014", 2.0)
        };

        System.out.println("Input your grades for your subjects(Leave blank if you have no grade for that subject yet)");
        for (Subject subject : subjects) {

            Scanner input = new Scanner(System.in);

            System.out.print(subject.getName() + ": ");
            try {
                subject.setGrade(Double.parseDouble(input.nextLine()));
            } catch (NumberFormatException NE) {
                subject.setGrade(null);
            }
        }

        double gpa = getGPA(subjects);
        System.out.println("Your GPA is: " +gpa);
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
