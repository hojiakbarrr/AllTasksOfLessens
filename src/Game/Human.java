package Game;

public class Human extends Hero implements isEating, isFighting,isShooting{
    private String nation;


    @Override
    public void move() {
        System.out.println("Человек двигается " + this.nation);
    }

    @Override
    public void fight() {
        System.out.println("Человек дерется " + this.nation);
    }

    @Override
    public void eat() {
        System.out.println("Человек ест "+ this.nation);
    }

    @Override
    public void shoot() {
        System.out.println("Человек стреляет "+ this.nation);
    }
}