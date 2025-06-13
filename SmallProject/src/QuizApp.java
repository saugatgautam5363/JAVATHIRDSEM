import java.util.ArrayList;
import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Question> question = new ArrayList<>();

        question.add(new Question(
                "What is the capital of Nepal?",
                new String[]{"Kathmandu", "Pokhara", "Lalitpur", "Biratnagar"},
                0));

        question.add(new Question(
                "Which planet is known as the Red Planet?",
                new String[]{"Earth", "Venus", "Mars", "Jupiter"},
                2));

        question.add(new Question(
                "Who wrote 'Romeo and Juliet'?",
                new String[]{"Charles Dickens", "William Shakespeare", "Mark Twain", "Leo Tolstoy"},
                1));

        question.add(new Question(
                "Which language is used for Android development?",
                new String[]{"Python", "Java", "Swift", "Kotlin"},
                3));
int score = 0;
        for(int i =0;i< question.size();i++){
            Question q = question.get(i);
            System.out.println("Q "+ i+1+ " : "+q.questionText);

            for(int j = 0;j< q.options.length;j++){
                System.out.println((j+1)+". "+q.options[j]);
            }
        System.out.println("Enter your option: ");
            int UserAnswer = scanner.nextInt();

            if(q.isCorrect(UserAnswer-1)){
                System.out.println("Correct Answer ");
                score++;
            }else {
                System.out.println("❌ Wrong! Correct answer: " + q.options[q.correctOption] + "\n");
            }
        }
        System.out.println("Quiz Over! Your score: " + score + " out of " + question.size());

        scanner.close();
    }
}
