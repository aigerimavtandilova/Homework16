public class Eagle extends Animal{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void getSpeed(int speed) {
        System.out.println(getName()+" can run with the speed of:"+speed);
    }

    public void fly(){

        System.out.println("Eagle is flying.");
    }
}
