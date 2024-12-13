public class Student {

    private final String name;
    private Subject[] subjects;
    private double gpa = 0;
    private double cgpa = 0;
    private double newCgpa = 0;


    /**
     * Constructor that initializes with name and subjects
     * @param name string that contains the name of the student
     * @param subjects an array of all {@link Subject} objects that the student is enrolled in
     */
    Student(String name, Subject[] subjects){
        this.name = name;
        this.subjects = subjects;
    }

    /**
     * Constructor that initializes with name and cgpa
     * @param name string that contains the name of the student
     * @param cgpa a double of the current cgpa of the student
     */
    Student(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }

    /**
     * Constructor that initializes with name, subjects, and cgpa
     * @param name string that contains the name of the student
     * @param subjects an array of all {@link Subject} objects that the student is enrolled in
     * @param cgpa a double of the current cgpa of the student
     */
    Student(String name, Subject[] subjects, double cgpa){
        this.name = name;
        this.subjects = subjects;
        this.cgpa = cgpa;
    }


    /**
     * This method sets the array subjects of the student
     * @param subjects array of {@link Subject} objects
     */
    public void setSubjects(Subject[] subjects){
        this.subjects = subjects;
    }

    /**
     * This method gets the array of subjects of the student
     * @return array of {@link Subject} objects
     */
    public Subject[] getSubjects(){
        return this.subjects;
    }

    /**
     * Method used to get the current GPA of the student based on the subjects
     * @return a double value of the current GPA
     */
    public double getGPA(){

        double total_units = 0;
        double total_weighted_grades = 0;

        for (Subject subject : subjects) {
            if (subject.getGrade() == null) continue;
            subject.setWeightedGrade();

            total_weighted_grades += subject.getWeightedGrade();
            total_units += subject.units();
        }

        gpa = total_weighted_grades / total_units;
        return gpa;

    }

    /**
     * Method used to get the cGPA of the student
     * @return double value of the current cGPA
     */
    public double getOldCGPA(){
        return this.cgpa;
    }

    /**
     * Method used to get the current cGPA of the student based on the subjects
     * @return double value of the new cGPA based on the student's subjects
     */
    public double getNewCGPA(){
        if (newCgpa == 0) newCgpa = (cgpa + gpa) / 2;
        return newCgpa;
    }

}
