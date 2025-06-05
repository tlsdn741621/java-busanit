package ch4;

public class Phone {
    String model;
    String price;
    String company;

    public Phone() {}

    public Phone(String model) {
        this.model = model;
    }

    public Phone(String model, String price) {
        this.model = model;
        this.price = price;
    }

    public Phone(String model, String price, String company) {
        this.model = model;
        this.price = price;
        this.company = company;
    }

    public void showInfo() {
        System.out.println("모델명 : " + this.model);
        System.out.println("가격 : " + this.price);
        System.out.println("제조사 : " + this.company);
    }

}
