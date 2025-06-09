package d250609.ch4;

public class BankAccountEx6 {
    // 퀴즈2
    // BankAccount 클래스 만들기
    // 인스턴스 멤버 변수 : 소유자(owner) 문자열 타입,

    // static 멤버 변수
    // 계좌개설건수 (accountCount) int 타입, static
    // 이자율 : 상수 final 로 선언, : INTEREST_RATE = 0.02; double 타입

    // 생성자는 , 매개변수가 하나인 생성자, owner , 
    // 추가로 계좌 개설시, 계좌 개설 건수 자동을 하나씪 증가
    // 현재 총 계좌 건수, 이자율를 확인하는 메소드 : showInfo()

    // 인스턴스 최소 3개 이상 만들기
    private String owner;

    public static int accountCount = 0;
    public static final double INTEREST_RATE = 0.02;

    public BankAccountEx6(String owner) {
        this.owner = owner;
        accountCount++;
    }

    public static void showInfo() {
        System.out.println("현재 총 계좌 건수 : " + accountCount);
        System.out.println("현재 이자율 : " + INTEREST_RATE);
    }
}
