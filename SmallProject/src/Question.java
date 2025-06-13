public class Question {
    String questionText;
    String[] options;
    int correctOption;

    Question(String questionText,String[] options,int correctOption){
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }
    public boolean isCorrect(int answer){
        return answer == correctOption;
    }
}
