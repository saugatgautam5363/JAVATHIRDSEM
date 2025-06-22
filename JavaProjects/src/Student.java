import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private int rollNo;
    private String email;
    private List<Course> courses;

    public Student(String name, int rollNo, String email, List<Course> courses) {
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
        this.courses = courses;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public static void main(String[] args) {
        Course course1 = new Course("123", "Computer Science");
        Course course2 = new Course("1234", "Mathematics I");

        course1.setStartedDate(new Date());
        course1.setEndDate(new Date());

        course2.setStartedDate(new Date());
        course2.setEndDate(new Date());

        List<Course> courseList = new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);

        Student student = new Student("saugat", 1, "saugatgautam@gmail.com", courseList);

        System.out.println("Student Name: " + student.getName());
        System.out.println(" Courses:");
        for (Course c : student.getCourses()) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
