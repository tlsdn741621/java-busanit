package d250609.ch4;

public class FinalEx5Main {
    public static void main(String[] args) {
        FinalEx5 finalEx5 = new FinalEx5();
        finalEx5.circleMethod(10);
        // final 로 정의한, 공유 상수 변경 시도 -> 변경 불가
        // FinalEx5.PI = 3.14;
    }
}
