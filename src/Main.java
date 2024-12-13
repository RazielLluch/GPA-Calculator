public class Main {

    public static void main(String[] args) {

        // template
        Student newStudent = new Student("name", 1.0);

        newStudent.setSubjects(
                new Subject[]{
                        new Subject("SUB001", 3.0, 1.0),
                        new Subject("SUB002", 3.0, 1.0),
                        new Subject("SUB003", 3.0, 1.0),
                        new Subject("SUB004", 3.0, 1.0),
                        new Subject("SUB005", 3.0, 1.0),
                        new Subject("SUB006", 5.0, 1.0),
                }
        );

        newStudent.inputGrades();

        newStudent.printDetails();
        // template
    }
}
