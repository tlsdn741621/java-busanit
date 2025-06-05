package ch4;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone1 = new Phone();

        phone1.model = "Galaxy s25";
        phone1.price = "185만원";
        phone1.company = "삼성전자";

        phone1.showInfo();

        Phone phone2 = new Phone("iPhone 16pro");
        phone2.price = "170만원";
        phone2.company = "Apple";

        phone2.showInfo();

        Phone phone3 = new Phone("BlackBerry Q20", "80만원");
        phone3.company = "BlackBerry Limited";

        phone3.showInfo();

        Phone phone4 = new Phone ("Xiaomi 15", "90만원","Xiaomi");

        phone4.showInfo();

        Phone[] phones = new Phone[4];

        phones[0] = phone1;
        phones[1] = phone2;
        phones[2] = phone3;
        phones[3] = phone4;

        System.out.println("phone1 주소: " + System.identityHashCode(phone1));
        System.out.println("phone2 주소: " + System.identityHashCode(phone2));
        System.out.println("phone3 주소: " + System.identityHashCode(phone3));
        System.out.println("phone4 주소: " + System.identityHashCode(phone4));
    }
}
