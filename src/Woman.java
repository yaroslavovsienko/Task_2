import java.util.Scanner;

public class Woman extends Human {

    public Woman ( String name, String surname, float height, float weight) {
        super (false, name, surname, height, weight);
    }

    @Override
    public Human relationship (Human human) {
        if (say(human)&&endure(human)&&spending_time_together(human)&& (this.getSex()!=human.getSex()))
                return give_birth_man(human);

        return null;
    }

    public Human give_birth_man (Human human){
        Scanner scanner = new Scanner(System.in);
        boolean sex = random.nextBoolean();
        float height,weight;
        System.out.print ("Введите имя ребенка: ");
        if (sex){
            height = (float) (human.getHeight()+0.1*(getHeight()-human.getHeight()));
            weight = (float) (human.getWeight()+0.1*(getWeight()-human.getWeight()));
            return new Man(scanner.nextLine(), human.getSurname(), height, weight);
        } else{
            height = (float) (getHeight()+0.1*(human.getHeight()-getHeight()));
            weight = (float) (getWeight()+0.1*(human.getWeight()-getWeight()));
            return new Woman(scanner.nextLine(), human.getSurname(), height, weight);
        }
    }
}
/*    @Override
    public String toString() {
        return "Женщина "+super.toString();
    }
}*/
