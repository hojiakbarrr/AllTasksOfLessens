package Game;

public class Doctor extends Hero {
    private String medicineType;
    private String nation;

    public Doctor(String medicineType) {
        this.medicineType = medicineType;

    }


    @Override
    public void move() {
        System.out.println("Доктор двигается ");
    }

    public void heal(){
        System.out.println("Доктор вылечил с помощью " + this.medicineType);
    }
}
