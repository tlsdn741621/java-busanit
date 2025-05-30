package ch2;

public class Hello0530 {
    public static void main(String[] args) {
        System.out.println("Test~~출력");
    
    // 만들었던 클래스를 불러와서 재사용해보기
    // 본인 소개 및 간단 계산 해보기
    // 본인 소개
    String myInfo = Introduce.introduce("강신우", "010-4567-7896", "kang@naver.com");
    System.out.println(myInfo);
    String myFavorite = Introduce.favorite("햄버거", "게임", "배그");
    System.out.println(myFavorite);

    // 퀴즈 1
    // Introduce 클래스에, 정의한 사칙연산 메소드를 이용해서, 각각 계산 결과를
    // result1, result2, result3, result4 변수에 담아서, 출력해보기
    int result1 = Introduce.sum(10, 30);
    System.out.println("더하기 : " + result1);

    int result2 = Introduce.sub(100, 5);
    System.out.println("빼기 : " + result2);

    int result3 = Introduce.mul(9, 15);
    System.out.println("곱하기 : " + result3);

    int result4 = Introduce.div(420, 6);
    System.out.println("나누기 : " + result4);

    float result5 = Introduce.div_float(5, 10);
    System.out.println("나누기2 : " + result5);
    }
}
