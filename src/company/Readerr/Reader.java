package company.Readerr;


import java.util.Scanner;

public class Reader {
    private String Fio;
    private int nomerChitatelskiy;
    private String fakultet;
    private String dataRojdeniya;
    private int telefon;
    private int knigi;
    private String kolichestvo;

    public Reader() {

    }

    public Reader(String Fio, int nomerChitatelskiy, String fakultet, String dataRojdeniya, int telefon, int knigi) {
        this.Fio = Fio;
        this.nomerChitatelskiy = nomerChitatelskiy;
        this.fakultet = fakultet;
        this.dataRojdeniya = dataRojdeniya;
        this.telefon = telefon;
        this.knigi = knigi;
    }

    public void inforeturn(Scanner nomer, int nomerChitatelskiy, Reader[] reader) {
        for (int i = 0; i < reader.length; i++) {
            if (nomerChitatelskiy == reader[i].nomerChitatelskiy) {
                System.out.println(reader[i].Fio + " " + reader[i].nomerChitatelskiy + " " + reader[i].fakultet + " " + reader[i].dataRojdeniya + " " + reader[i].telefon + " " + reader[i].knigi);
            }
        }

    }

    public void takeBook(int count) {
        System.out.println(this.Fio + " взял " + count + " книги");
    }

    public void takeBook(String[] bookNameAr) {
        System.out.println(this.Fio + " взял книги : " + bookNameAr[knigi]);
    }

    public void takeBook1(Book[] books, String name, Scanner x) {
        int count = 0;
        boolean temp = true;
        while (temp) {
            if (name.equals("Приключения") || name.equals("Словарь") || name.equals("Энциклопедия")) {
                System.out.println(this.Fio + "взял книги(у) " + name);
                temp = false;
                kolichestvo = name;
            } else if (count >= 1) {
                System.out.println("ты запарил нет такой книги нет деймго");
            } else {
                System.out.println("Поищи в инете в библиотеке нет такой книги");
                count++;
            }

            if (!temp) {
                break;
            }
            name = x.nextLine();
        }
        System.out.println();
        System.out.println();
    }

    public void returnBook(int count) {
        System.out.println(this.Fio + " вернул " + count + " книги");
    }

    public void returnBook(String[] bookNameAr) {
        System.out.println(this.Fio + " вернул книги : " + bookNameAr[knigi]);
    }

    public void returnBook1(Book[] books, String name, Scanner x) {
        int count1 = 0;
        boolean temp1 = true;
        while (temp1) {

            if (name.equals(kolichestvo)) {
                System.out.print(this.Fio + "вернул книги(у) " + name);
                temp1 = false;
            } else if (count1 >= 1) {
                System.out.println("Запарил верни что взял");
            } else {
                System.out.println("Не эти книги ты брал\nАферист верни что взял!!!");
                count1++;
            }


            if (!temp1) {
                System.out.println(" Красавчик вернул что брал");
                break;
            }

            name = x.nextLine();
        }
        System.out.println();
    }

}
