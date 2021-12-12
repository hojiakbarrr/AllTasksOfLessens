package Game;

public class Robot extends Hero implements isCharging,isShooting{
    private String generation;

    @Override
    public void charge() {
        System.out.println("Робот зарядился " + this.generation);
    }

    @Override
    public void shoot() {
        System.out.println("Робот стрелял "+ this.generation);
    }

    @Override
    public void move() {
        System.out.println("Робот двигается "+ this.generation);
    }
}
