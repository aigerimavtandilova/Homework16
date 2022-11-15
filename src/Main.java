public class Main {
    public static void main(String[] args) {
        Animal shark;
        Animal turtle;
        Animal eagle;
        Animal [] animals={shark=new Shark("Shark"),
        turtle=new Turtle("Turtle"),
        eagle=new Eagle("Eagle")};
        for (Animal animal:animals) {
        if (animal.getClass().equals(Shark.class)){
            ((Shark) animal).attack();
        } else if (animal.getClass().equals(Turtle.class)) {
            ((Turtle) animal).swim();
        }else if(animal.getClass().equals(Eagle.class)){
            ((Eagle) animal).fly();
        }
        }

    }
}