package company.Readerr;

import java.util.Scanner;

public class Library {
    private String name;
    private String parol;

    public Library(String name, String parol) {
        this.name = name;
        this.parol = parol;
    }

    public static void books() {
        String[] bokk = new String[5];
        bokk[0] = "Кыргыз тили";
        bokk[1] = "Русский язык";
        bokk[2] = "Английский язык";
        bokk[3] = "Испанский язык";
        bokk[4] = "Кытай тили";
        for (int i = 0; i < bokk.length; i++) {
            System.out.print("№" + (i + 1) + " " + bokk[i] + "/ ");
        }
        System.out.println();
        System.out.println("Введите номер книги");
        Scanner cs = new Scanner(System.in);
        int ука = cs.nextInt();
        int kuk = ука - 1;
        for (int i = 0; i <bokk.length; i++) {
            if (kuk == i){
                System.out.println("Вы выбрали номер книги и его название № " + (i + 1)  + " "+bokk[i]);
            }

        }
        
    }

    public void returnBook(Library[] zero) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите ваш логин ");
        String login = cs.nextLine();
        System.out.println("Введите ваш пароль");
        String пароль = cs.nextLine();


        for (int i = 0; i < zero.length; i++) {
            if (zero[i].name.equals(login) && zero[i].parol.equals(пароль)) {
                System.out.println("Добро пожаловать в библиотеку " + login);
                System.out.println("В наличие есть эти книги ");
                books();
            }


        }
    }
}
