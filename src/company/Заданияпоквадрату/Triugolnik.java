package company.Заданияпоквадрату;

public class Triugolnik extends Kvadrat{

    private double storona1;
    private double storona2;
    private double storona3;
    public Triugolnik(String type, int kolichStoron,double storona1,double storona2, double storona3) {
        super(type, kolichStoron);
        this.storona1 = storona1;
        this.storona2 = storona2;
        this.storona3 = storona3;
    }

    @Override
    public void perimetr() {
        System.out.println("Периметр треугольника = " + (storona1+storona2+storona3));
    }
}
