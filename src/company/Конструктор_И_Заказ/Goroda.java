package company.Конструктор_И_Заказ;

public class Goroda {
    public String nameOfCity;
    public int population;
    public String name;

    public Goroda(String nameOfCity, int population, String name) {
        this.nameOfCity = nameOfCity;
        this.population = population;
        this.name = name;
    }

    public void infocity(){
        System.out.println("Название города - "+this.nameOfCity +
                " и насиление - " + this.population + " " +
                this.name);
    }
}
