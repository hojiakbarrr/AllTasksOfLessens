package company.Заданияпоквадрату;

public class Chujoystudent extends Svoystudent {
    @Override
    public void buyPirojok(int kolichestvo) {
        System.out.println(" Чужой школьник купил " + kolichestvo + " пирожков");
        System.out.println(" Цена за пирожок " + 20 + " сомов");
        System.out.println(" К оплате: " + 20 * kolichestvo + " сомов");
    }
    }

