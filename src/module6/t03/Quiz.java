package module6.t03;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    static ArrayList<Question> questions = new ArrayList<>();

    public static void greatDefaultTest(){

        //создание первого вопроса
        Question question1 = new Question(01, "Куда на курортных пляжах просят не заплывать отдыхающих?", new ArrayList<OptionQA>());
        question1.optionQA.add(new OptionQA(1,"За горизонт", false));
        question1.optionQA.add(new OptionQA(2,"За буйки", true));
        question1.optionQA.add(new OptionQA(3, "За границу", false));
        question1.optionQA.add(new OptionQA(4, "В камыши", false));

        questions.add(question1);

        //создание второго вопроса
        Question question2 = new Question(02, "При падении чего принято загадывать желание?", new ArrayList<>(){{
            add(new OptionQA(1, "Температуры", false));
            add(new OptionQA(2, "Дисциплины", false));
            add(new OptionQA(3, "Звезды", true));
            add(new OptionQA(4, "Курса рубля", false));
        }});

        questions.add(question2);

        //создание третьего вопроса
        Question question3 = new Question(03,"Какой рубрики в разделе объявлений не существует?", new ArrayList<>());
        question3.optionQA.add(new OptionQA(1, "Куплю", false));
        question3.optionQA.add(new OptionQA(2, "Продам", false));
        question3.optionQA.add(new OptionQA(3, "Сниму", false));
        question3.optionQA.add(new OptionQA(4, "Обую", true));

        questions.add(question3);

        //создание четвертого вопроса
        Question question4 = new Question(04,"Что показывает судья футболисту, делая предупреждение?" , new ArrayList<>());
        question4.optionQA.add(new OptionQA(1, "Паспорт", false));
        question4.optionQA.add(new OptionQA(2, "Желтую карточку", true));
        question4.optionQA.add(new OptionQA(3, "Бюллетень", false));
        question4.optionQA.add(new OptionQA(4, "Язык", false));

        questions.add(question4);

        //создание пятого вопроса
        Question question5 = new Question(05,"Как благодарные сограждане окрестили период брежневского правления?" , new ArrayList<>());
        question5.optionQA.add(new OptionQA(1, "Простой", false));
        question5.optionQA.add(new OptionQA(2, "Перестой", false));
        question5.optionQA.add(new OptionQA(3, "Застой", true));
        question5.optionQA.add(new OptionQA(4, "Отстой", false));

        questions.add(question5);

    }

    public static void starDefaultTest(){
        int mark = 0;
        int countRightAnswers = 0;
        greatDefaultTest();
        int userAnswer;
        Scanner console = new Scanner(System.in);

        //задаём первый вопрос
        System.out.println("Введите цифру, соответствующую правильному варианту ответа: ");
        System.out.println(questions.get(0));
        for (int i = 0; i < questions.get(0).optionQA.size(); i++) {
            System.out.print("  " +questions.get(0).optionQA.get(i));
        }

        userAnswer = console.nextInt();
        while ((userAnswer < 1) || (userAnswer > 4)){
            System.out.println("Такого варинта ответа здесь нет, попробуйте снова\nвведите цифру, " +
                    "соответствующую правильному варианту ответа: ");
            userAnswer = console.nextInt();
        }

        if (questions.get(0).optionQA.get(userAnswer - 1).correct){
            Question.userAnswers.add("Верно!");
            countRightAnswers++;
        }
        else {
            Question.userAnswers.add("НЕВЕРНО!");
        }


        //задаём второй вопрос
        System.out.println("Введите цифру, соответствующую правильному варианту ответа: ");
        System.out.println(questions.get(1));
        for (int i = 0; i < questions.get(1).optionQA.size(); i++) {
            System.out.print("  " +questions.get(1).optionQA.get(i));
        }

        userAnswer = console.nextInt();
        while ((userAnswer < 1) || (userAnswer > 4)){
            System.out.println("Такого варинта ответа здесь нет, попробуйте снова\nвведите цифру, " +
                    "соответствующую правильному варианту ответа: ");
            userAnswer = console.nextInt();
        }

        if (questions.get(1).optionQA.get(userAnswer - 1).correct){
            Question.userAnswers.add("Верно!");
            countRightAnswers++;
        }
        else {
            Question.userAnswers.add("НЕВЕРНО!");
        }

        //задаём третий вопрос
        System.out.println("Введите цифру, соответствующую правильному варианту ответа: ");
        System.out.println(questions.get(2));
        for (int i = 0; i < questions.get(2).optionQA.size(); i++) {
            System.out.print("  " +questions.get(2).optionQA.get(i));
        }

        userAnswer = console.nextInt();
        while ((userAnswer < 1) || (userAnswer > 4)){
            System.out.println("Такого варинта ответа здесь нет, попробуйте снова\nвведите цифру, " +
                    "соответствующую правильному варианту ответа: ");
            userAnswer = console.nextInt();
        }

        if (questions.get(2).optionQA.get(userAnswer - 1).correct){
            Question.userAnswers.add("Верно!");
            countRightAnswers++;
        }
        else {
            Question.userAnswers.add("НЕВЕРНО!");
        }

        //задаём четвёртый вопрос
        System.out.println("Введите цифру, соответствующую правильному варианту ответа: ");
        System.out.println(questions.get(3));
        for (int i = 0; i < questions.get(3).optionQA.size(); i++) {
            System.out.print("  " +questions.get(3).optionQA.get(i));
        }

        userAnswer = console.nextInt();
        while ((userAnswer < 1) || (userAnswer > 4)){
            System.out.println("Такого варинта ответа здесь нет, попробуйте снова\nвведите цифру, " +
                    "соответствующую правильному варианту ответа: ");
            userAnswer = console.nextInt();
        }

        if (questions.get(3).optionQA.get(userAnswer - 1).correct){
            Question.userAnswers.add("Верно!");
            countRightAnswers++;
        }
        else {
            Question.userAnswers.add("НЕВЕРНО!");
        }

        //задаём пятый вопрос
        System.out.println("Введите цифру, соответствующую правильному варианту ответа: ");
        System.out.println(questions.get(4));
        for (int i = 0; i < questions.get(4).optionQA.size(); i++) {
            System.out.print("  " +questions.get(4).optionQA.get(i));
        }

        userAnswer = console.nextInt();
        while ((userAnswer < 1) || (userAnswer > 4)){
            System.out.println("Такого варинта ответа здесь нет, попробуйте снова\nвведите цифру, " +
                    "соответствующую правильному варианту ответа: ");
            userAnswer = console.nextInt();
        }

        if (questions.get(4).optionQA.get(userAnswer - 1).correct){
            Question.userAnswers.add("Верно!");
            countRightAnswers++;
        }
        else {
            Question.userAnswers.add("НЕВЕРНО!");
        }

        System.out.println("Верный ответ был получен " + countRightAnswers + " раз(а): \n" + Question.userAnswers);

        System.out.println("Правильные ответы:");
        for (int i = 0; i < questions.size(); i++) {
            for (int j = 0; j < questions.get(i).optionQA.size(); j++) {
                if (questions.get(i).optionQA.get(j).correct) {
                    System.out.println(questions.get(i) + "\n"+ questions.get(i).optionQA.get(j).optionId + " - " + questions.get(i).optionQA.get(j).name);
                }
            }

        }

        mark = (int) Math.round((countRightAnswers * 10) / 5);
        System.out.println("Ваши знания можно оценить на " + mark + " балл(а/ов) по 10-бальной шкале.");

    }

}
