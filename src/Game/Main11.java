package Game;

public class Main11 {
    public static void main(String[] args) {


        Doctor anya = new Doctor("пилюли");
        Human bob = new Human();
        Robot terminaor = new Robot();
        Dragoon rex = new Dragoon("пистолет");
        Tower kamen = new Tower();

        anya.heal();
        anya.move();

        rex.fight();
    }
}