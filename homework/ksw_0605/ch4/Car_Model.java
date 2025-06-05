package homework.ksw_0605.ch4;

public class Car_Model {
    // 자동차 정보 1) 자동차명, 2) 제조사, 3) 연식, 4) 등록일로 구성
    String name;
    String company;
    String carAge;
    String regDate;
    
    public Car_Model(String name, String company, String carAge, String regDate) {
        this.name = name;
        this.company = company;
        this.carAge = carAge;
        this.regDate = regDate;
    }

    public void showInfo() {
        System.out.println("자동차명 : " + this.name);
        System.out.println("제조사 : " + this.company);
        System.out.println("연식 : " + this.carAge);
        System.out.println("등록일 : " + this.regDate);
    }

    public String getName() {
        return name;
    }

    public String getCarAge() {
        return carAge;
    }
}