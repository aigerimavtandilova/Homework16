public class Turtle extends Animal{
    public Turtle(String name) {
        super(name);
    }

    @Override
    public void getSpeed(int speed) {
        System.out.println(getName()+" can run with the speed of:"+speed);
    }

    public void swim(){

        System.out.println("Turtle is swimming.");
    }
}
