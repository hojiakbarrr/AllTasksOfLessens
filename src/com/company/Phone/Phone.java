package com.company.Phone;
public class Phone {
    public int number;
    public String model;
    public double weight;
    public String name;


    public Phone(int number, String model, double weight, String name) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.name = name;
        System.out.println(this.number + " " + this.model + " " + this.weight + " " + this.name);
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String receiveCall(){
        return this.name;
    }
    public void receiveCall(String name, int number){
    }
    public void sendMessage(String [] message){
        System.out.println("Этим номерам будет отправлено сообщение ");
        for (int i = 0; i < message.length; i++) {
            System.out.print(message[i] + " ");
        }

    }


}
