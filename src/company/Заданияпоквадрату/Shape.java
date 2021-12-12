package company.Заданияпоквадрату;

public abstract class Shape {
    private double storona;
    private String type;
    private int kolichStoron;

    public Shape(String type, int kolichStoron,double storona) {
        this.storona = storona;
        this.type = type;
        this.kolichStoron = kolichStoron;
    }

    public Shape(String type, double storona) {
        this.type = type;
        this.storona = storona;
    }

    public double getStorona() {
        return storona;
    }

    public void setStorona(double storona) {
        this.storona = storona;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getKolichStoron() {
        return kolichStoron;
    }

    public void setKolichStoron(int kolichStoron) {
        this.kolichStoron = kolichStoron;
    }
    public void perimetr(){

    }


}
