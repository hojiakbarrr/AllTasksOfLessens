package company.Заданияпоквадрату;

public class Kvadrat extends Shape implements PerimetrCalculation {

    public Kvadrat(String type, double storona) {
        super(type, storona);
    }

    @Override
    public void perimetr() {
        System.out.println("Периметр квадрата = " + (4 * getStorona()));
    }
}
