package ch4;

public class Phone_Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();

        phone1.model = "갤럭시 s25";
        phone1.price = "125만원";
        phone1.company = "삼성";

        phone1.showInfo();

        Phone phone2 = new Phone();

        phone2.model = "아이폰 16pro";
        phone2.price = "158만원";
        phone2.company = "애플";

        phone2.showInfo();

        Phone phone3 = new Phone();

        phone3.model = "갤럭시 폴더5";
        phone3.price = "2000만원";
        phone3.company = "삼성";

        phone3.showInfo();
    }
}
