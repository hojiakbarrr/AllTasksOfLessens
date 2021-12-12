package company.Конструктор_И_Заказ;

import java.util.Date;

public class Zakaz {
    int price;
    int anount;
    Date currentTime = new Date();
    String customerName;
    String courierName;
    int orderNumber;
    String addres;

    public Zakaz(int price, int anount, String customerName, String courierName, String addres) {

        if (anount > 3){
            this.price = (int) (price - (price * 0.1));
        }else {
            this.price = price;
        }
        this.anount = anount;
        this.customerName = customerName;
        this.courierName = courierName;
        this.addres = addres;
    }
    public String getorderNumber(){
        return this.customerName + " " + this.currentTime + " " + this.courierName;
    }
    public void getZakazinfo(){
        System.out.println("Order number : " + getorderNumber());
        System.out.println("Order price : " + this.price);
        System.out.println("Order anount : " + this.anount);
        System.out.println("Order customername : " + this.customerName);
        System.out.println("Order addres : " + this.addres);
    }
}
