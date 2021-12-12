package Game;

public class Dragoon extends Hero implements isEating,isFighting{
    private String fireType;

    public Dragoon(String fireType) {
        this.fireType = fireType;
    }

    @Override
    public void move() {
        System.out.println("Дракон двигается " );
    }

    @Override
    public void fight() {
        System.out.println("Дракон дерется с "+ this.fireType);
    }

    @Override
    public void eat() {
        System.out.println("Дракон хавает ");
    }

    public void fire(){
        System.out.println("Дракон огнеметит "+ this.fireType);
    }

}
