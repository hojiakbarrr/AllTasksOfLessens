package company.Заданияпоквадрату;



public class Svoystudent extends Student {

    @Override
    public void buyPirojok(int kolichestvo) {

        System.out.println(" Свой школьник купил " + kolichestvo + " пирожков");
        System.out.println(" Цена за пирожок " + 10 + " сомов");
        System.out.println(" К оплате: " + 10 * kolichestvo + " сомов");
    }
}


