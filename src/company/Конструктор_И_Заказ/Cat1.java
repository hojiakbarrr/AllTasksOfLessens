package company.Конструктор_И_Заказ;

public class Cat1 {
    private String name;
    private int appetite;
    private boolean сытость;

    public Cat1(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean eat(Plate p) {
        сытость = p.decreaseFood(appetite, this.name);
        System.out.println(сытость);
        return сытость;
    }
}
