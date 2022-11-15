public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getSpeed(int speed){
        System.out.println("Animal can run with the speed of: "+speed);
    }
}
