package company.Конструктор_И_Заказ;

public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public void setFood(int food) {
        this.food += food;
    }
    public boolean decreaseFood(int n, String nameCat){
        int x = food-=n;
        if (x>=0){
            System.out.println(nameCat + " кот может съесть : "+ n);
            return true;
        }else {
            System.out.println(nameCat + " кот не хочет есть так как его аппетит больше чем то что в тарелке:(" );
            return false;
        }
    }
    public void info(){
        System.out.println("plate: " + food);
    }
}
