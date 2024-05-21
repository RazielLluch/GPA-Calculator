public class Subject {
    private String name;
    private double units;
    private Double grade;
    private double weighted_grade;

    /**
     *  Constructor for the subject class that creates a subject object
     * @param name is the name of the subject
     * @param units is how many units the subject contains
     */
    Subject(String name, double units){
        this.name = name;
        this.units = units;
    }

    /**
     *  setter for the weighted grade
     */
    public void setWeightedGrade(){
        weighted_grade = grade * units;
    }

    /**
     *  getter for the weighted grade
     * @return weighted_grade
     */
    public double getWeightedGrade() {
        return weighted_grade;
    }

    /**
     *  setter for the grade
     * @param grade is the numerical grade
     */
    public void setGrade(Double grade){
        this.grade = grade;
    }

    /**
     *  getter for the name
     * @return name of the subject
     */
    public String getName(){
        return name;
    }

    /**
     *  getter for the number of units of the subject
     * @return units
     */
    public double units(){
        return units;
    }

    /**
     *  getter for the grade a student has in this subject
     * @return grade
     */
    public Double getGrade(){
        return grade;
    }
}