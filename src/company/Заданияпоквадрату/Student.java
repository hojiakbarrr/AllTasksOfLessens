
package company.Заданияпоквадрату;

public class Student {
    private String name;
    private int age;
    private boolean isMale;


    public void buyPirojok(int kolichestvo){
        System.out.println(" Школьник купил " + kolichestvo + " пирожков");
        System.out.println(" Цена за пирожок " + 20 + " сомов");
        System.out.println(" К оплате: " + 20 * kolichestvo + " сомов");
    }


}
