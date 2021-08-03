import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("---Тест на совместимость---");

        Woman women = new Woman ("Светлана","Петрова", 1.6f, 51.4f);
        Man man = new Man ("Александр","Иванов",1.8f,82.3f);

        Human human = compatibility_test(man,women);

        if(human==null){
            System.out.println("Ничего не вышло... разбежались:(");
        } else System.out.println(human.toString());

    }

    static Human compatibility_test (Human human1,Human human2){
        return human1.relationship(human2);
    }


}
