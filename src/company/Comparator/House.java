package company.Comparator;

public class House implements Comparable<House> {
    String address;
    int price;
    boolean hasmebel;

    public House(String address, int price, boolean hasmebel) {
        this.address = address;
        this.price = price;
        this.hasmebel = hasmebel;
    }

    public String getAddress() {
        return address;
    }

    public int getPrice() {
        return price;
    }

    public boolean isHasmebel() {
        return hasmebel;
    }

    public void aboutHome(){
        System.out.println("Адрес:" + this.address + ",цена:" + this.price + ",наличие мебели:" + this.hasmebel);
    }


    @Override
    public int compareTo(House house) {
        if (hasmebel == house.isHasmebel()){
            return 1;
        }
        if (hasmebel != house.isHasmebel()){
            return -1;
        }
        return 0;
    }
}
