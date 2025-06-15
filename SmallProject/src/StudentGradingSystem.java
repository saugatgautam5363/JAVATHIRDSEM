import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your roll number: ");
        int roll = scanner.nextInt();

        System.out.println("Enter the subject marks: ");
        int[] marks = new int[3];
        for(int i =0;i<3;i++){
            System.out.println("Subject: "+(i+1)+" ");
            marks[i] = scanner.nextInt();
        }
        Student student = new Student(name,marks,roll);
        student.result();
    }
}
