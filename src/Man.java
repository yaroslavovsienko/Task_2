
public class Man extends Human {


    public Man (String name, String surname, float height, float weight) {
        super(true, name, surname, height, weight);
    }

    @Override
    public Human relationship (Human human) {
       return human.relationship(this);
    }

}
/*    @Override
    public String toString() {
        return "Мужчина "+super.toString();
    }
}*/
