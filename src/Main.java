import java.util.Scanner;

public class Main{

    public static void main(String[] args) {


        Subject []subjects = {
        new Subject("CCC121", 3.0),
        new Subject("GEC107", 3.0),
        new Subject("GEC108", 3.0),
        new Subject("ITE131", 3.0),
        new Subject("MAT061", 5.0),
        new Subject("NIH001", 3.0),
        new Subject("PED013", 2.0)
        };

        System.out.println("Input your grades for your subjects(Leave blank if you have no grade for that subject yet)");
        for(int i = 0; i < subjects.length; i++){

            Scanner input = new Scanner(System.in);

            System.out.print(subjects[i].getName() +": ");
            try{
                subjects[i].setGrade(Double.parseDouble(input.nextLine()));
            }catch(NumberFormatException NE){
                subjects[i].setGrade(null);
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
