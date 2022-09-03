package module6.t03;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {

    Scanner console  = new Scanner(System.in);
    int questionId;
    String textQuestion;
    ArrayList<OptionQA> optionQA;
    static ArrayList<String> userAnswers = new ArrayList<>();

    public Question(int questionId, String textQuestion, ArrayList<OptionQA> optionQA) {
        this.questionId = questionId;
        this.textQuestion = textQuestion;
        this.optionQA = optionQA;
    }

    public Question(int questionId, String textQuestion) {
        this.questionId = questionId;
        this.textQuestion = textQuestion;

    }

    @Override
    public String toString(){
        String result = "" + this.questionId + ") - " + this.textQuestion;
        return  result;
    }
}
