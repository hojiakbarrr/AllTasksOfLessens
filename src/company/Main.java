package company;

import com.company.Animalнаследие.*;
import com.company.Animalнаследие.Animal;
import com.company.Phone.Phone;
import company.Comparator.Grade;
import company.Comparator.House;
import company.Comparator.Price;
import company.Comparator.Studentka;
import company.Readerr.Book;
import company.Readerr.Library;
import company.Readerr.Reader;
import company.Заданияпоквадрату.*;
import company.Конструктор_И_Заказ.*;

import java.util.*;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

        startLibrary();
        StartShape();
        Dog();
        StartHuman();
        int nomer = Phonex();
        Reader();
        Zakaz();
        Person();
        Sotrudnik();
        Film();
        Late();
/////////////////////////////////////////////////////////////////////////////////другой маин был        //        zadanyie1();
        goroda();
        zadanyie2();
        Klassy();
        listter();
        getDomrab();
        mebel();
        /////////////////////////////////////////////////////////////////////////////////другой маин был
                task1();
        task3();
        task4();
        task5();
        visikosnyiGod(1940);
        exercise1(4);
        exercise2(10);
        cycleFor();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7(1);
        example9();
        example10();
        example11();
        example12();
        example13();
        example14();
/////////////////////////////////////////////////////////////////////////////////другой маин был

        task111();
        task21();
        task31();
        task41();
        task51();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task13();
        task14();
/////////////////////////////////////////////////////////////////////////////////другой маин был
                task1();
        task2();
        task3();
        task4();
        task5();
/////////////////////////////////////////////////////////////////////////////////другой маин был

                task31();
        System.out.println(task1(75,75));
        task21();
        task41();
        task6();
        /////////////////////////////////////////////////////////////////////////////////другой маин был

    exercise4();
    exercise5();
    exercise6("Али",26);
    array();
    array2();
        array3();
    array4();
    array5();
    array6();
    array7();
        array8();
        array9();
        array10();
        array11();
/////////////////////////////////////////////////////////////////////////////////другой маин был
                urok12();
        task22();
        task32();
        task42();


    }
    //////////////////////////////////////////////////////////////////////////////////////start region//
    private static void Late() {
        Cat1 murzik = new Cat1("мурзик", 11);
        Plate plate = new Plate(10);
        plate.setFood(25);
//        plate.info();
//        murzik.eat(plate);
//        plate.info();

        Cat1 bob = new Cat1("боб", 11);
        Cat1 rufus = new Cat1("руфус", 13);
        Cat1 petty = new Cat1("петти", 18);

//        bob.eat(plate);
        plate.info();

        int wellFed = 0;
        int notWellFed = 0;
        Cat1[] arr = new Cat1[4];
        arr[0] = murzik;
        arr[1] = bob;
        arr[2] = rufus;
        arr[3] = petty;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].eat(plate)) {
                plate.info();
                wellFed++;
            } else {
                notWellFed++;
            }
        }
        System.out.println("Сытые их столько " + wellFed);
        System.out.println("Не сытых : " + notWellFed);
    }

    private static void Sotrudnik() {
        Sotrudnik Job = new Sotrudnik("Джумабаев Хожиакбар Мансурович", " Специалист", "hojiakbar_1997@mail.ru", 89233928, 48000, 24);

        Sotrudnik[] persArray = new Sotrudnik[5];
        persArray[0] = new Sotrudnik("Иванов Иван", "менеджер", "Иванов @mail.ru", 12345, 30000, 30);
        persArray[1] = new Sotrudnik("Иванов Марат", "менеджер1", "марат @mail.ru", 66666, 32000, 32);
        persArray[2] = new Sotrudnik("Иванов Кайрат", "менеджер2", "Кайрат @mail.ru", 77777, 34000, 40);
        persArray[3] = new Sotrudnik("Иванов Ренат", "менеджер3", "Ренат @mail.ru", 88888, 35600, 41);
        persArray[4] = new Sotrudnik("Иванов Бекзад", "менеджер4", "Бекзад @mail.ru", 99999, 378000, 42);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].vozrast >= 40)
                System.out.println(persArray[i].FIO + " " + persArray[i].doljnost + " " + persArray[i].email + " " + persArray[i].nomer + " " + persArray[i].zarplata + " " + persArray[i].vozrast);
        }
    }

    private static void Person() {
        Person mike = new Person(17, 1, "рус", "Русский");
        mike.age = 17;
        mike.height = 1.7;
        mike.nationality1 = "american";
        mike.name = "Рус";
        System.out.println("Возраст человека = " + mike.age);
        System.out.println("Рост чел = " + mike.height);
        System.out.println("Имя человека = " + mike.name);
        System.out.println("Нация человека = " + mike.nationality1);
    }

    private static void Zakaz() {
        Zakaz peperoni = new Zakaz(400, 11, "Расул", "Силва", "Чуй 155");
        String orderNumber = peperoni.getorderNumber();
        System.out.println(orderNumber);
        peperoni.getZakazinfo();
    }

    private static void Reader() {
        Reader sagynReader = new Reader("Петров В.В.", 1, "CENG", "22-11-97", 123123123, 0);

        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров В.В.", 1, "CENG", "22-11-97", 123123123, 0);
        readers[1] = new Reader("Иванов В.В.", 2, "А", "5-06-22", 5648484, 0);
        readers[2] = new Reader("Путин В.В.", 3, "Б", "9-08-25", 99858477, 0);

        Scanner id = new Scanner(System.in);
        System.out.println("Введите ваш номер читательского");
        int nomer = id.nextInt();
        sagynReader.inforeturn(id, nomer, readers);

        sagynReader.takeBook(3);
        String[] knigi = {"Приключения, Словарь, Энциклопедия"};
        sagynReader.takeBook(knigi);

        Book[] books1 = new Book[3];
        books1[0] = new Book("Белоусов", "Приключения");
        books1[1] = new Book("Карпов", "Словарь");
        books1[2] = new Book("Исмаилов", "Энциклопедия");

        Scanner x = new Scanner(System.in);
        System.out.println("Введите книги");
        String namebook = x.nextLine();
        sagynReader.takeBook1(books1, namebook, x);

        sagynReader.returnBook(3);
        String[] knigi1 = {"Приключения, Словарь, Энциклопедия"};
        sagynReader.returnBook(knigi);

        System.out.println("Какие книги возвращаете");
        String returnbook = x.nextLine();
        sagynReader.returnBook1(books1, returnbook, x);
    }

    private static int Phonex() {
        Phone iphone = new Phone(12, "Самсунг", 0.186, "Рустам");
        Phone[] newphone = new Phone[3];
        newphone[0] = new Phone(11, "Самсунг", 0.186, "Илья");
        newphone[1] = new Phone(22, "Сони", 0.210, "Кошкин");
        newphone[2] = new Phone(33, "Гио", 0.170, "Алтын");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш номер и сразу введите номера куда надо будет отправлено сообщения");
        int nomer = sc.nextInt();
        String numer = sc.nextLine();

        for (int i = 0; i < newphone.length; i++) {
            if (newphone[i].number == nomer) {
                String n = newphone[i].receiveCall();
                System.out.println("Вам звонит " + n + " его номер " + newphone[i].getNumber());
                System.out.println(n + " " + newphone[i].getNumber());
            }
        }

        Phone adi = new Phone(253, "OPPO", 0.78);
        Phone not = new Phone(112, "Айфон");
        Phone rx = new Phone();

        iphone.receiveCall("xukgsac", 45);

        String[] message = {numer};
        iphone.sendMessage(message);
        return nomer;
    }

    private static void StartHuman() {
        Human alex = new Human();
        Human bob = new Runner();

        alex.move(1200);
    }

    private static void Dog() {
        Dog alabai = new Dog();
        Cat matroskin = new Cat();

        alabai.ran(125);
        matroskin.swam(50);

        Animal barsik = new Dog();
        Animal murzik = new Cat();
        Animal max = new Dog();
        Animal charlie = new Cat();
        Animal cooper = new Dog();
        Animal rocky = new Cat();
        Animal bella = new Dog();
        Animal luna = new Cat();

        barsik.ran(501);
        bella.ran(235);
        luna.swam(0);

        int countDog = 0;
        int countCat = 0;
        Animal[] arr = new Animal[8];
        arr[0] = barsik;
        arr[1] = murzik;
        arr[2] = max;
        arr[3] = charlie;
        arr[4] = cooper;
        arr[5] = rocky;
        arr[6] = bella;
        arr[7] = luna;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Dog) {
                countDog++;
            } else if (arr[i] instanceof Cat) {
                countCat++;
            }
        }
        System.out.println("Собак насчитано : " + countDog + ", а кошек насчитано столько : " + countCat);
    }

    private static void StartShape() {
        Shape kvadrat = new Kvadrat("квадрат", 4);
        kvadrat.perimetr();

        Shape trio = new Triugolnik("Треугольник", 3, 4, 5, 6);
        trio.perimetr();


        Student bahtiyar = new Svoystudent();
        Student yusuf = new Chujoystudent();

        bahtiyar.buyPirojok(5);
        System.out.println();
        yusuf.buyPirojok(5);
    }

    private static void Film() {
        Film Rota = new Film(8.5, "США", 12);
    }

    private static void startLibrary() {
        Library knig = new Library("Мамед", "мамбо43");
        Library zero[] = new Library[5];
        zero[0] = new Library("Расул", "ras85");
        zero[1] = new Library("Султан", "суля95");
        zero[2] = new Library("Умар", "ислам97");
        zero[3] = new Library("Руслан", "рус76");
        zero[4] = new Library("Пабло", "pubj");


        knig.returnBook(zero);
    }
//    //region Start Human продолжение
//    private static void printAction(Human person) {
//
//        if (person instanceof Human){
////            person.move();
//        }else if (person instanceof Runner){
////            person.move();
//        }
//    }
//    //#endregion
/////////////////////////////////////////////////////////////////////////////////другой маин был

    private static void mebel() {
        List<House> list = new ArrayList<>();
        House house1 = new House("Ул.Киевская №1",2,false);
        House house2 = new House("Ул.Киевская №54",4,false);
        House house3 = new House("Ул.Ленина №433",5,true);
        House house4 = new House("Ул.Киевская №76",7,false);
        House house5 = new House("Ул.К.Датка №67",1,true);
        House house6 = new House("Ул.Ленина №67",1,true);
        list.add(house1);
        list.add(house2);
        list.add(house3);
        list.add(house4);
        list.add(house5);
        list.add(house6);

        for (House h:list) {
            h.aboutHome();
        }
        System.out.println(" " + "\n" + "*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#"+ " = сортировка по цене");

        Price pricecomparator = new Price();
        list.sort(pricecomparator);
        for (House h: list) {
            h.aboutHome();
        }
        System.out.println(" " + "\n" +"*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#"+ " = сортировка по наличие мебели");
        Collections.sort(list);
        for (House me:list) {
            me.compareTo(list.get(1));
            me.aboutHome();
        }
    }

    private static void getDomrab() {

        LinkedList<String> countries = new LinkedList<>();
//        countries.add("**************************");

        ArrayList<String> europe = new ArrayList<>();
        europe.add("Германия");
        europe.add("Италия");
        europe.add("Франция");
        europe.add("Нидерланды");
        europe.add("Швейцария");
        europe.add("Польша");
        europe.add("Греция");
        europe.add("Австрия");
        europe.add("Ирландия");
        europe.add("Хорватия");

        ArrayList<String> asia = new ArrayList<>();
        asia.add("туркменистан");
        asia.add("узбекистан");
        asia.add("кыргызстан");
        asia.add("таджикистан");
        asia.add("Китай");
        asia.add("Тайланд");
        asia.add("Филиппины");
        asia.add("Вьетнам");
        asia.add("Катар");
        asia.add("Ираня");

        int count = 0;

        for (int i = 0; i < asia.size(); i++) {
            countries.add(asia.get(i));
//            System.out.println(countries.get(count));
            count++;
        }

        for (int i = 0; i < europe.size(); i++) {
            countries.add(europe.get(i));
//            System.out.println(countries.get(count));
            count++;
        }

        String stan = "";
        String name = "";
        char v;
        char b;
        for (int i = 0; i < countries.size(); i++) {
            v = countries.get(i).charAt(countries.get(i).length() - 1);
//            b = countries.get(i).charAt(countries.get(i).length() - 4);
            stan += countries.get(i).charAt(countries.get(i).length() - 4);
            stan += countries.get(i).charAt(countries.get(i).length() - 3);
            stan += countries.get(i).charAt(countries.get(i).length() - 2);
            stan += countries.get(i).charAt(countries.get(i).length() - 1);
            System.out.println(v);
            System.out.println(countries.get(i));
            if (v == 'я') {
                countries.remove(i);
                i--;
            }
            if (stan.equals("стан")) {
                name = countries.get(i).substring(0, 1).toUpperCase() + countries.get(i).substring(1).toLowerCase();
                countries.set(i, name);
                stan = "";
//                System.out.println(name);
            }

        }

        for (int i = countries.size() - 5; i < countries.size(); i++) {
            countries.set(i,"страна");
        }

        for (String names : countries) {
            System.out.println(names);
        }

//        countries.add(europe);
//        countries.addFirst(asia);
//        ArrayList names;

//        for (int i = 0; i < countries.size(); i++) {
//            for (int j = 0; j < countries.get(i).size(); j++) {
////                names = countries.get(i);
////                for (String name : names) {
////
////
////                }
//                System.out.println(countries.get(i).get(j));
//                char v;
//                    v = countries.get(j).charAt();
//                    System.out.println(v);
//                    if (v == 'я') {
//                        System.out.println("hello");
//                        System.out.println(countries.get(j));
//
//                    }


//                   if ({
//                        countries.remove(i);
//                        System.out.println(countries.get(i));
//                    }
//        }

//        for (String name : countries) {
//            System.out.println(name);
//        }

//    }


//            for (String eu : europe) {
//                System.out.println(eu);
////            char v = europe.get(eu.length()).charAt(eu.length() - 1);
//
//                for (int i = 0; i < europe.size(); i++) {
//                    char  v = europe.get(i).charAt(europe.lastIndexOf('я'));
//                    if (v == 'я'){
//                        europe.remove(eu);
//                        System.out.println(europe.get(i).length());
//                    }
//
//                }
//            }


//          System.out.println(county);
//            int indexYa = county.indexOf("ия");
//            char sr = county.charAt(county.length() - 1);
//            System.out.println(indexYa);
//            System.out.println(county.charAt(county.length() - 1));

//        for (String as:asia) {
//            System.out.println(as);
//            char v = as.charAt(as.length() - 1);
//            for (int i = 0; i < as.length(); i++) {
//                if (as.charAt(as.length() - 1) == 'я'){
//                    asia.remove(as);
//                    System.out.println(asia);
//                }
//            }
//        }


//            for (int i = 0; i <countries.size() ; i++) {
//                countries.remove(county.lastIndexOf("ия"));
//                System.out.println(countries);
//            }


//        for (int i = 0; i < countries.size(); i++) {
//            if (countries.get(i).equals("ия")){
//                countries.remove(countries.get(i));
//                System.out.println(countries.get(i));
//            }
//        }


//            for (int i = 0; i < countries.size() ; i++) {
//                if (indexYa == 7){
//                    countries.remove(countries.get(i));
//                        System.out.println(countries.get(i));
//                    }
//                }
//
//            for (String ru:countries) {
//                if (countries.equals(indexYa)){
//                    countries.remove(indexYa);
//                    System.out.println(ru);
//                }
//            }

    }

    private static void listter() {
        ///// 1 Задание
        ArrayList<String> str = new ArrayList<>();
        str.add("Привет");
        str.add("Конецц");
        str.add("С трудом");
        str.add("Корнейй");
        str.add("Уральский");
        for (String x : str) {
            System.out.println("размер строк - " + x.length() +
                    "\n" + x);
        }
        ///// 2 и 3 Задание
        ArrayList<String> ktr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 5 строк");
        ktr.add(scan.nextLine());
        ktr.add(scan.nextLine());
        ktr.add(scan.nextLine());
        ktr.add(scan.nextLine());
        ktr.add(scan.nextLine());

        String x = ktr.get(0);

        for (int i = 0; i < ktr.size(); i++) {
            if (ktr.get(i).length() > x.length()) {
                x = ktr.get(i);
            }
        }
        System.out.println("максимум слово" + x);

        for (int i = 0; i < ktr.size(); i++) {
            if (ktr.get(i).length() == x.length() && !ktr.get(i).equals(x)) {
                System.out.println(" Максимум равные слова" + ktr.get(i));
            }
        }
        String min = ktr.get(0);
        for (int i = 0; i < ktr.size(); i++) {
            if (min.length() > ktr.get(i).length()) {
                min = ktr.get(i);
            }
        }
        System.out.println("Минимальное слово " + min);

        for (int i = 0; i < ktr.size(); i++) {
            if (ktr.get(i).length() == min.length() && !ktr.get(i).equals(x)) {
                System.out.println("Минимум равные слова = " + ktr.get(i));
            }
        }

        ///// 4 Задание

        ArrayList<String> last = new ArrayList<>();
        System.out.println("Введите 10 строк");
        last.add(" ");
        last.add(" ");
        last.add(" ");
        last.add(" ");
        last.add(" ");
        last.add(" ");
        last.add(" ");
        last.add(" ");
        for (int i = 7; i >= 0; i--) {
            last.set(i, scan.nextLine());
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(last.get(i));
        }
        ///// 5 Задание
        ArrayList<String> stroki = new ArrayList<>();
        System.out.println("Введите 5 строк");
        stroki.add(scan.nextLine());
        stroki.add(scan.nextLine());
        stroki.add(scan.nextLine());
        stroki.add(scan.nextLine());
        stroki.add(scan.nextLine());
        for (String rd : stroki) {
            System.out.println(rd);
        }
        System.out.println();
        String b = "";

        for (int i = 0; i < 13; i++) {
            b = stroki.remove(4);
            stroki.add(0, b);
        }
        for (String es : stroki) {
            System.out.println(es);
        }
///    6 Задание
        ArrayList<String> ring = new ArrayList<>();
        System.out.println("Введите 10 строк");
        ring.add(scan.nextLine());
        ring.add(scan.nextLine());
        ring.add(scan.nextLine());
        ring.add(scan.nextLine());
        ring.add(scan.nextLine());
        ring.add(scan.nextLine());
        ring.add(scan.nextLine());
        ring.add(scan.nextLine());
        ring.add(scan.nextLine());
        ring.add(scan.nextLine());
        for (String rg : ring) {
            System.out.println(rg);
        }
        String maхi = ring.get(0);
        String mini = ring.get(0);

        for (int i = 0; i < ring.size(); i++) {
            if (mini.length() > ring.get(i).length()) {
                mini = ring.get(i);
            } else if (ring.get(i).length() > maхi.length()) {
                maхi = ring.get(i);
            }

        }
        System.out.println("Первое максимум встречное слово " + maхi);
        System.out.println("Первое встречное минимальное слово " + mini);
    }

    private static void Klassy() {
        Studentka dooron = new Studentka("Dooron", "гум", 2, new Grade("математика", 3), new Grade("биология", 3), new Grade("география", 5), new Grade("история", 3));
        Studentka susy = new Studentka("Сузи", "эконом", 3, new Grade("математика", 4), new Grade("биология", 2), new Grade("география", 2), new Grade("история", 5));
        Studentka sagyn = new Studentka("Сагын", "физкульт", 1, new Grade("математика", 5), new Grade("биология", 4), new Grade("география", 4), new Grade("история", 4));
        Studentka amyr = new Studentka("Амир", "юрид", 4, new Grade("математика", 2), new Grade("биология", 4), new Grade("география", 3), new Grade("история", 3));
        Studentka rustam = new Studentka("Рустам", "филос", 1, new Grade("математика", 5), new Grade("биология", 5), new Grade("география", 4), new Grade("история", 2));


        List<Studentka> arr = new ArrayList<>();
        arr.add(dooron);
        arr.add(susy);
        arr.add(sagyn);
        arr.add(amyr);
        arr.add(rustam);

        dooron.sumGrade(dooron);
        sagyn.sumGrade(sagyn);
        susy.sumGrade(susy);
        amyr.sumGrade(amyr);
        rustam.sumGrade(rustam);

        int курс = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).sumGrade > 3) {
                arr.get(i).course += 1;
                System.out.println(arr.get(i).name + " вы проходите на след курс" + " " + arr.get(i).course);
            } else {
                System.out.println(arr.get(i).name + " олух ты продул курс");
            }
        }
        System.out.println();


        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).listOfStudents());
        }
        System.out.println();

        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).odnokurs(4);

        }
        System.out.println("- однокурсники");


    }

    private static void zadanyie2() {
        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
//            int a = (int) (Math.random() * 10 + 1);
//            list.add(a);
        }
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }

    private static void zadanyie1() {
        int[] arr = new int[5];

        int xx = 10;
        List<Integer> list = new ArrayList<>(xx);
        for (int i = 0; i < xx; i++) {
            int a = (int) (Math.random() * 10 + 1);
            list.add(a);

        }
        System.out.println(list);


    }

    public static void goroda() {
        Goroda tashkent = new Goroda("Ташкент", 1500000, "сити");
        Goroda osh = new Goroda("Ош", 130000, "сити");
        Goroda bishkek = new Goroda("Бишкек", 120000, "сити");
        Goroda naryn = new Goroda("Нарын", 1400000, "сити");

        int maхsum = 0;
        int index = 0;
        int minsum = 1000000;
        int dex = 0;

        List<Goroda> arr = new ArrayList<>();
        arr.add(tashkent);
        arr.add(naryn);
        arr.add(bishkek);
        arr.add(osh);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).population > maхsum) {
                maхsum = arr.get(i).population;
                index = i;
            } else if (arr.get(i).population < minsum) {
                minsum = arr.get(i).population;
                dex = i;
            }
        }
        System.out.println("город с самым большим населением " + arr.get(index).nameOfCity + " " + arr.get(index).population);
        System.out.println("Город который удалили " + arr.get(dex).nameOfCity);
        arr.remove(dex);

        System.out.println();
        System.out.println("следующее задание снизу");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).infocity();
        }

        System.out.println();

        System.out.println("следующее задание снизу");
        String town = "Town";
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).name.equals("сити")) {
                arr.get(i).name = town;
                arr.get(i).infocity();
            }
        }
        System.out.println();

        ArrayList<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        System.out.println(list.get(1) + ":");
        list.add(1, "test4");
        System.out.println(list.get(1) + ":");
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + ":");
        }
    }
//////////////////////////////////////////////////////////////////////////////////////end the region


    private static void example14() {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();
        int countChet = 0;
        int countNeChet = 0;
        int x = 0;

        for (int i = 0; i < user.length(); i++) {

            x = Integer.parseInt(String.valueOf(user.charAt(i)));
            if (x % 2 == 0){
                countChet++;
            }else
                countNeChet--;
            System.out.println("Четные числа " + countChet + "Нечетные числа " + countNeChet);
        }
    }

    private static void example13() {
        Scanner skan = new Scanner(System.in);
        int summa = 0;
        int chislo = 0;
        int schet = 0;
        while (true){
            schet ++;
            System.out.println("Введите число");
            chislo = skan.nextInt();
            summa = summa + chislo;
            if (chislo == 0){
                System.out.println("Процесс завершен");
                break;
            }
        }
        System.out.println("Попыток ввода: " + schet);
        System.out.println("Сумма чисел: " + summa);
    }

    private static void example12() {
        for (int i = 1; i < 50; i++) {
            if (i % 5 == 0){
                System.out.println(i + " делиться на 5");
            }
            else if (i % 7 == 0){
                System.out.println(i + " делиться на 7");
            }
        }
    }

    private static void example11() {
        for (int i = 35; i < 87; i++) {
            if (i % 7 == 1){
                System.out.println(i + " При делении дают остаток 1");
            }
            else if (i % 7 == 2){
                System.out.println(i + " При делении дают остаток 2");
            }else if (i % 7 == 5){
                System.out.println(i + " При делении дают остаток 5");
            }
        }
    }

    private static void example10() {
        for (int i = 20; i < 50; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i + " Делиться на 3, но делиться на 5");
            }

        }
    }

    private static void example9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свой вклад ");
        int vklad = sc.nextInt();
        double procent = 0.03;

        for (int year = 1; year <= 5; year++){
            double itog = vklad + (vklad * procent * year);
            for (; itog < 5; itog++) {

            }
            { System.out.println("Ваш депозит составляет в этом году составил = " + itog);
            }
        }

    }

    private static void example7(int x) {
        while (x <= 12){
            System.out.println(x);
            x++;

        }

    }

    private static void example6() {
        for (int i = 1; i <= 9; i++){
            System.out.println(7 + " * " + i + " = " + i * 7);

        }
    }

    private static void example5() {
        for (int i = -4; i <= 100; i+=2){
            System.out.println(i);

        }
    }

    private static void example4() {
        for (int i = 1983; i <= 2000 ; i++){
            System.out.println(i);
        }
    }

    private static void example3() {
        for (int i = 654; i >= 0 ; i--) {
            System.out.println(i);

        }
    }

    private static void example2() {
        for (int i = 4; i < 14; i+=3) {
            System.out.println(i);
        }
    }

    private static void cycleFor() {     //        бесконечно пока не определиться
        int x = 0;
        while (true){
            System.out.println("Берем билет  ");
            x = (int)(Math.random() * 100);
            if (x == 50){
                System.out.println("Ваш выигрыш сотавил " + x + " $");
                break;
            }
        }
    }

    private static void exercise2(int x) {
        System.out.println("Перезагрузка через ");
        do {
            System.out.println("Обратный отсчет - " +x);
            x--;
            if (x<0){
                System.out.println("можно включать");
                break;
            }
        }while (x>=0);
    }

    private static void exercise1(int a) {// Вывести числа от 4 до 400 на консоль.
        while (a <= 400){
            System.out.println(a);
            a+=4;
        }

    }

    private static void visikosnyiGod(int year) {
        if (year % 4 == 0 || year % 100 != 0 && year % 400 == 0){
            System.out.println("Это високосный " + year +" год");
        }else {
            System.out.println("Это не високосный год");
        }

    }

    private static void task522() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько лет");
        int x = sc.nextInt();

        if (x > 0 && x <= 3){
            System.out.println("Надбавка 0 %");
        }else if (x > 3 && x <= 10){
            System.out.println("Надбавка 10 %");
        }else if (x > 10 && x <= 20){
            System.out.println("Надбавка 20 %");
        }else if (x == 21){
            System.out.println("Надбавка 25 %");
        }else {
            System.out.println("Пользователь вводит отрицательное значение");
        }
    }

    private static void task411() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String Login = sc.nextLine();
        System.out.println("Введите ваш пароль");
        String Parol = sc.nextLine();

        if (Login.equals("Ivan") && Parol.equals("334455")){
            System.out.println("Добро пожаловать");
        }else {
            System.out.println("Отказ в доступе");
        }
    }

    private static void task322() {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        System.out.println("Введите номер квартиры");

        if  (f > 0 && f <= 20){
            System.out.println("первый подъезд");
        }else if (f >= 21 && f <= 48){
            System.out.println("второй подъезд");
        }else if (f >= 49 && f <= 90){
            System.out.println("третий подъезд");
        }else {
            System.out.println("такой квартиры нет");
        }

    }

    private static void task1111() {
        Scanner sc = new Scanner(System.in);
        int a , b;
        System.out.println("Ввести любое число");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a>b) {
            System.out.println("Число " + a + "максимальное число");
        }else if (a==b){
            System.out.println("они равны");
        }else{
            System.out.println("Число " + b + " максимальное число");
        }



    }

    //////////////////////////////////////////////////////////////////////////////////////другой маин был


    private static void task14() {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i <= 11; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }

    private static void task13() {
        int сумма = 0;
        int попытокввода = 0;
        double ариф = 0;
        while (true) {
            попытокввода++;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ввод чисел");
            int числа = scanner.nextInt();
            сумма = сумма + числа;
            ариф = сумма / попытокввода;
            if (числа == 0) {
                System.out.println("Конец ввода чисел");
                break;
            }
        }
        System.out.println("Попыток ввода " + попытокввода);
        System.out.println("Сумма попыток ввода " + сумма + " и среднее арифметическое " + ариф);

    }

    private static void task11() {
        for (int i = 1; i < 50; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void task10() {
        for (int i = 35; i < 87; i++) {
            if (i % 7 == 1 || i % 7 == 2 || i % 7 == 5) {
                System.out.print(i + " ");
            }
        }
    }

    private static void task9() {
        for (int i = 20; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }

    private static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш вклад чтобы узнать сколько станет ваш вклад черет столько то лет ");
        int вклад = scanner.nextInt();
        int года = scanner.nextInt();
        double procent = 0.03;
        for (int i = 0; i < года; i++) {
            double итог = вклад + (вклад * procent * года);
            System.out.println("Ваш вклад будет = " + итог);
        }
    }

    private static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int vychet = scanner.nextInt();
        for (int i = 1; i < vychet; i++) {
            System.out.println(i);
        }
    }

    private static void task62() {
        for (int i = 1; i <= 9; i++) {
            System.out.println(7 + " * " + i + " = " + i * 7);
        }
    }

    private static void task51() {
        int n = -4;
        while (n <= 100) {
            System.out.println(n);
            n += 2;
        }
    }

    private static void task4112() {
        int n = 1983;
        while (n <= 2020) {
            System.out.println(n);
            n += 1;
        }
    }

    private static void task311() {
        int n = 654;
        while (n >= 0) {
            System.out.println(n);
            n--;
        }
    }

    private static void task212() {
        int n = 4;
        while (n < 14) {
            System.out.println(n);
            n += 3;
        }
    }

    private static void task111() {
        int n = 4;
        while (n < 400) {
            System.out.println(n);
            n++;
        }
    }
    /////////////////////////////////////////////////////////////////////////////////другой маин был


    private static void task5() {
        int a, b, c;
        a = 3;
        b = 10;
        c = 20;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ваш стаж работы");
            int staj = scanner.nextInt();
            if (staj<=a){
                System.out.println("Надбавка 0%");
            }else if (staj > a && staj <= b){
                System.out.println("Надбавка 10%");
            }else if (staj > b && staj <= c){
                System.out.println("Надбавка 20%");
            }else {
                System.out.println("Надбавка 25%");
            }
        }
    }

    private static void task4() {
        String Добро = "Добро пожаловать";
        while (true) {
            if (Добро.equals("правильно")) {
                break;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ваши данные");
            String login = scanner.nextLine();
            String Parol = scanner.nextLine();
            if (login.equals("Ivan") && Parol.equals("334455")) {
                System.out.println(Добро);
                Добро = "правильно";
            } else if (login.equals("alex") && Parol.equals("777")) {
                System.out.println(Добро);
                Добро = "правильно";
            } else if (login.equals("petr") && Parol.equals("b5678")) {
                System.out.println(Добро);
                Добро = "правильно";
            } else {
                System.out.println("Ваши данные не правильные");
            }

        }
    }

    private static void task3() {
        int a, b, c, d;
        a = 21;
        b = 49;
        c = 90;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер квартиры");
            int kvartira = scanner.nextInt();
            if (kvartira > 0 && kvartira < a) {
                System.out.println("Квартира находиться в первом подъезде");
            } else if (kvartira >= a && kvartira < b) {
                System.out.println("Квартира находиться во второй подъезде");
            } else if (kvartira >= b && kvartira <= c) {
                System.out.println("Квартира находиться в третим подъезде");
            } else {
                System.out.println("Нет такой квартиры в этом подъезде");
            }
        }
    }

    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int chislo1 = scanner.nextInt();
        int chislo2 = scanner.nextInt();
        if (chislo1 > chislo2) {
            System.out.println("Первое число оказалось максимальнее");
        } else if (chislo2 > chislo1) {
            System.out.println("Второе число оказалось макисмальне");
        } else {
            System.out.println("Они оба равны");
        }
    }

    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int chislo1 = scanner.nextInt();
        int chislo2 = scanner.nextInt();
        if (chislo1 > chislo2) {
            System.out.println("Первое число оказалось максимальнее");
        } else if (chislo2 > chislo1) {
            System.out.println("Второе число оказалось макисмальне");
        }
    }

    /////////////////////////////////////////////////////////////////////////////////другой маин был
    private static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину пароля");
        int dlina = scanner.nextInt();

        if (dlina > 6 && dlina < 20) {
            for (int i = 0; i < dlina; i++) {
                dlina += (int) (Math.random() * 14) + 20;
            }
        }

        System.out.println("Ваш пароль " + dlina);


    }

    private static void task41() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ((Math.random() * 10) + 1);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int x = 0;
        int[][] ara = new int[5][5];
        for (int i = 0; i < ara.length; i++) {
            for (int j = 0; j < ara[i].length; j++) {
                ara[i][j] = (int) ((Math.random() * 10) + 1);
                System.out.print(ara[i][j] + " ");

            }
            System.out.println();
        }




    }


    private static void task21() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt();
        int итог = 0;
        for (int i = 1; i <= n; i++) {
            итог += (5 * i);

        }
        System.out.println(итог);
    }

    private static double task1(int a, int b) {
        double среднееарифметическое = (a + b) / 2;
        return среднееарифметическое;
    }

    private static void task31() {
        int население = 10000000;
        int рождаемость = 14;
        int смертность = 8;
        int итог = 0;
        for (int i = 0; i < 10; i++) {
            итог += (население / 1000 * (рождаемость - смертность));
            System.out.println(итог);
        }
    }

    /////////////////////////////////////////////////////////////////////////////////другой маин был

    private static void array11() {
        int [] arr = {4,5,6,7,8};
        String [] names = {"Маша","Jake","Ok","Sadyr"};

        System.out.println(names[1] + " исполнилось " + arr[2] + " лет");
    }

    private static void array10() {
        int[][] arr = new int[3][3];
        int col1 = 0;
        int col2 = 0;
        int col3 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ((Math.random() * 10) +1);
                System.out.print(arr[i][j] + " ");
                if (j == 0) col1 += arr[i][j];
                else if (j==1) col2 += arr[i][j];
                else col3 += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("col1 =" + col1 + "\ncol2 = " + col2 + "\ncol3 = " + col3);
    }
    private static void array9() {
        int [][] arr = new int[3][2];
        arr[0][0] = 4;
        arr[0][1] = 5;
        arr[1][0] = 6;
        arr[1][1] = 7;
        arr[2][0] = 8;
        arr[2][1] = 9;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length -1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void array8() {
        int [][] arr = new int[3][3];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (i==j || ((i + j)== arr.length - 1)){
                    arr[i][j]=1;
                }
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }


    }

    private static void array7() {
        Scanner cs = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String input = cs.nextLine();
        int count = 0;

        if (input.length() != 0) {
            count++;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;

                }
            }
            System.out.println("Количество слов в предложении ранвяется = " + count);
        }
    }
    private static void array6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше 3");

        int n = scanner.nextInt();
        while (n < 4) {
            System.out.println("Повторите ввод, ваше число меньше 3");
            n = scanner.nextInt();
            if (n < 3) {
            }
        }
        System.out.println("Ваше число принято");
        System.out.println();
        int x = 0;
        int[] mas1 = new int[n];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (random() * n);
            if (mas1[i] % 2 == 0)
                x++;

        }
        System.out.println(Arrays.toString(mas1));
        System.out.println();

        int b =0;
        int[] mas2 = new int[x];
        for (int i = 0; i < mas1.length; i++){
            if (mas1[i] % 2 == 0){
                mas2[b] = mas1[i];
                b++;
            }

        }
        System.out.println("Второй массив");
        System.out.println(Arrays.toString(mas2));
    }

    private static void array5() {
        int[] digits = new int[5];
        int[] digi = new int[5];
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < digits.length; i++) {
            digits[i] = (int) (random() * 5);
            digi[i] = (int) (random() * 5);
            sum1 += digits[i];
            sum2 += digi[i];
        }
        double rezalt = sum1 / 5;
        double rezalt1 = sum2 / 5;

        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(digi));
        System.out.println(rezalt);
        System.out.println(rezalt1);

    }

    private static void array4() {
        int[] digits = new int[8];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = (int) (Math.random() * 10);
            System.out.print(digits[i] + " ");
            if (i % 2 != 0) {
                digits[i] = 0;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(digits));
    }

    private static void array3() {
        int[] digits = new int[12];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = (int) (random() * 15);
            System.out.print(digits[i] + " ");
        }

        int maxSum = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > maxSum) {
                maxSum = digits[i];
            }
        }
        System.out.println();
        System.out.print(maxSum);
        System.out.println();
        System.out.print("hello");


    }

    private static void array2() {
        int[] digits = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9};
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < 6) {
                digits[i] = digits[i] * 2;
            }

        }
        System.out.println(Arrays.toString(digits));
    }

    private static void array() {
        int[] digits = {2, 2, 4, 4, 5, 5};
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 4) {
                digits[i] = 3;
            } else if (digits[i] == 5) {
                digits[i] = 1;
            }
        }
        System.out.println(Arrays.toString(digits));
    }

    private static void exercise6(String name, int age) {
        System.out.printf("Привет мое имя " + name + "и мне " + age + " лет");
    }

    private static boolean exercise5() {
        int a = -1;
        boolean isInterval = false;
        if (a >= 0) {
            isInterval = true;
        }
        System.out.println("Положительное число " + isInterval);
        return isInterval;
    }

    private static boolean exercise4() {
        int a, b;
        a = 21;
        b = 10;
        boolean isInterval = false;
        if ((a + b) < 10 && (a - b) <= 20) {
            isInterval = true;
        }
        System.out.println(isInterval);
        return isInterval;
    }
    /////////////////////////////////////////////////////////////////////////////////другой маин был
    private static void task42() {
        int [][] ara = new int[5][6];
        for (int i = 0; i <ara.length ; i++) {
            for (int j = 0; j < ara[i].length; j++) {
                ara[i][j] = (int) (Math.random() *5);
                System.out.print(ara[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int arr [][] = new int[6][5];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                arr[j][i] = ara [i][j];
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    private static void task32() {
        int [][] ara = new int[5][6];
        for (int i = 0; i <ara.length ; i++) {
            for (int j = 0; j <ara[i].length ; j++) {
                ara[i][j]= (int) (Math.random() * 60) +(-10);
                System.out.print(ara[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i <ara.length ; i++) {
            for (int j = 0; j <ara[i].length ; j++) {
                if (ara[i][j]< 0){
                    sum += ara [i][j];
                }
            }
        }
        System.out.print("Сумма отрицательных чисел = " + sum);

        long rezalt = 1;
        for (int i = 0; i <ara.length ; i++) {
            for (int j = 0; j < ara[i].length; j++) {
                if (ara[i][j] > 0) {
                    rezalt *= ara[i][j];
                }
            }
        }
        System.out.println();
        System.out.print("Результат умножения всех положительных чисел = " + rezalt);

        int bolshe = 0;
        for (int i = 0; i < ara.length ; i++) {
            for (int j = 0; j < ara[i].length; j++) {
                if (ara[i][j] > 10){
                    bolshe = ara [i][j];
                }
            }
        }
        System.out.println();
        System.out.print("Все числа больше 10 = " + bolshe + " ");

        int [] x = new int[bolshe];
        for (int i = 0; i <x.length ; i++) {
        }
        System.out.println(Arrays.toString(x));
    }

    private static void task22() {
        int [][] arr = new int [5][8];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j]= (int) (Math.random() * 10) + 10;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int maxsum = 0;
        int minsum =0;
        int [][] x = new int[5][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxsum){
                    maxsum = arr [i][j];
                    x [i][0] = maxsum;

                } else  if (arr[i][j] < minsum){
                    minsum = arr[i][j];
                    x [i][1] = minsum;
                }
            }
            System.out.print("Максимальное значение = " + maxsum);
            maxsum = 0;

            System.out.print(" //  минимальное значение = " + minsum);
            minsum =0;
            System.out.println();
        }
        for (int [] inst : x) {
            System.out.println(Arrays.toString(inst));
        }
    }
    private static void urok12() {
        char символ = 'a';
        String [][] array = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = символ + "" + (j +1);

                System.out.print(array[i][j]+ " ");

            }
            символ++;
            System.out.println();
        }
    }

}

