public class Shark extends Animal{
    public Shark(String name) {
        super(name);
    }

    @Override
    public void getSpeed(int speed) {
        System.out.println(getName()+" can run with the speed of:"+speed);
    }

    public void attack(){
        System.out.println("Shark attacked");
    }
}
