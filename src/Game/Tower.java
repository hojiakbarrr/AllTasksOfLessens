package Game;

public class Tower implements isShooting,isCharging {
    private String location;



    @Override
    public void charge() {
        System.out.println("башня заряжается " + this.location);
    }

    @Override
    public void shoot() {
        System.out.println("Башня стреляет " + this.location);
    }
}
