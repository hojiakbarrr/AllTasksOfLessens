package company.Конструктор_И_Заказ;

public class Sotrudnik {
    public int vozrast;
    public String FIO;
    public String doljnost;
    public String email;
    public int nomer;
    public int zarplata;
//    int vozrast;



    public Sotrudnik(String FIO,String doljnost, String email, int nomer,  int zarplata,int vozrast){
        this.FIO = FIO;
        this.doljnost = doljnost;
        this.email = email;
        this.nomer = nomer;
        this.zarplata = zarplata;
        this.vozrast = vozrast;

        System.out.println("ФИО" + FIO);
        System.out.println("Должность" + doljnost);
        System.out.println("email" + email);
        System.out.println("nomer" + nomer);
        System.out.println("zarplata" + zarplata);
        System.out.println("vozrast" + vozrast);
    }
}
