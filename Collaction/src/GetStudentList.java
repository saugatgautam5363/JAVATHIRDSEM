import java.util.ArrayList;
import java.util.List;

public class GetStudentList {
    public static <student> void main(String[] args) {
        List<Student> student = new ArrayList<>();
        List<Student> student1 = new ArrayList<>();

        Student students = new Student("Sauagt", 45);
        Student student3 = new Student("Sauagt", 45);
        Student student4 = new Student("Sauagt", 45);

        student.add(students);
        student.add(student3);
        student.add(student4);

        Student getStudent = student.getFirst();
        System.out.println(getStudent.getName());


        student.forEach(newStudent ->{
            System.out.println(newStudent.getName());
        });
        student.remove(student);

        student.forEach(newStudent ->{
            System.out.println(newStudent.getName());
        });
    }
}