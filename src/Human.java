import java.util.Random;

public abstract class Human  {

    Random random = new Random();

    private boolean sex;

    private String name;

    private String surname;

    private float height;

    private float weight;


        public Human(boolean sex, String name, String surname, float height, float weight) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
    }

    public boolean getSex() { return sex;  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


    public boolean say (Human human){
        System.out.print("Говорить: ");
        if (this.sex==true &&  human.sex==true) {
            boolean fl= random.nextBoolean();
            System.out.println(fl);
            return fl;
        }
        System.out.println(true);
        return true;
    }

     public boolean endure (Human human){
         System.out.print("Терпеть: ");
        float number = random.nextFloat();
        if (this.sex==false && human.sex==false){
            if (number<=0.05) {
                System.out.println("true");
                return true;
            }
        }

         if ((this.sex==true && human.sex==false) ||  (this.sex==false && human.sex==true)){
             if (number<=0.7) {
                 System.out.println("true");
                 return true;
             }
         }

         if (this.sex==true && human.sex==true){
             if (number<=0.056){
                 System.out.println("true");
                 return true;
             }
         }
         System.out.println ("false");
             return false;
    }

     public boolean spending_time_together (Human human){
         System.out.print("Проводить время вместе: ");
         float number=random.nextFloat();

         if (Math.abs((this.height - human.height) / ((this.height + human.height) / 2)) > 0.10) {
                       if (number <= 0.85) {
                           System.out.println("true");
                           return true;
                       }

         } else if (number <= 0.95) {
             System.out.println("true");
             return true;
         }
             System.out.println("false");
         return false;
    }

     public abstract Human relationship (Human human);

    @Override
    public String toString() {
        return "Пол = " + (sex==true ? "М" : "Ж") + ", Имя = " + name + ", Фамилия = " + surname + ", Рост = " + height + ", Вес = " + weight;

    }
}
