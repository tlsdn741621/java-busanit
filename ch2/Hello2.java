package ch2;

public class Hello2 {
    // 정적인 메소드 정의
    // 메소드1 결과 변환값의 타입 : int
     public static int sum (int n, int m) {
        return n + m;
    }

    // 메소드2 결과 변환값의 타입 : int
    public static int mul(int n, int m) {
        return n * m;
    }

    // 메소드3 결과 변환값의 타입 : int
    public static int sub(int n, int m) {
        return n - m;
    }

    // 메소드4 결과 변환값의 타입 : int
    public static int div(int n, int m) {
        return n / m;
    }

    // 메소드5 결과 변환값의 타입 : float
    public static float div_float(int n, int m) {
        return (float) n / m; // 정수를 입력 받아서, 계산시 이것도 정수로 계산이 되니깐
    }

    // 메소드6
    public static String info(String name, String phone, String email) {
        return "저는 " + name + " 입니다.\n" +
               "제 전화번호 : " + phone + "이고,\n" +
               "이메일 : " + email + " 입니다.";
    }

    // 정적인 메소드, 이름 main
    public static void main(String[] args) {
        // 메소드1 사용
        int result = sum(100, 200);
        System.out.println("sum 이라는 함수 이용해서 결과 출력 : " + result);

        // 메소드2 사용
        int result2 = mul(10,20);
        System.out.println("mul 이라는 함수 이용해서 결과 출력 : " + result2);

        // 퀴즈2
        // 빼기
        // 메소드3 사용
        int result3 = sub(300,12);
        System.out.println("sub 이라는 함수 이용해서 결과 출력 : " + result3);

        // 퀴즈3
        // 나누기
        // 메소드4 사용
        int result4 = div(180,3);
        System.out.println("div 이라는 함수 이용해서 결과 출력 : " + result4);

        float result5 = div_float(3,2); // 반환값의 타입이 : float 이니까, 받을 변수의 타입도 일치
        System.out.println("div_float 이라는 함수 이용해서 결과 출력 : " + result5);

        String name = "강신우";
        String phone = "010-1234-5678";
        String email = "kang@naver.com";

        String result6 = info(name, phone, email);
        System.out.println(result6);

        // 퀴즈 푸는 도중에 정수로만 데이터 타입을 처리하고 있는데
        // 소수로 -> 실수로 표현은 어떻게 할까?
        // 데이터 타입에 대해서
        // 기본형, 
        // byte, int short, float, long, double, char, boolean 등등
        // 참조형 기본형을 제외한 나머지
        // 객체(Object), 배열(Array), 문자열(String) emd

        // 결론
        // 1)클래스 영역과, 메인 함수 영역 구분
        // 2)메인 함수로 시작 , 끝으로 한다
        // 3)메인 함수도 알고 보니, 정적인 함수(메소드)
        // 4)클래스명, 파일명(.java) 동일해야한다
        // 5)변수에서 기본형, 참조형이 있는데 현재는 2개 int , String 타입 이야기했고
        // 6)문자열을 표기시에 , 큰따옴표로 표기해서 사용한다
        // 7)정적 메소드(함수)를 정의하고
        // 8)정적 메소드를 사용(호출) 사용시 정의한 메소드로 가서 액션을 하고 돌아와서 재사용
        // 9)클래스 명, 대문자로 시작하고, 패키지 명과, 메소드(함수)명은 소문자로 시작하고
        // 10)이름 작성시, 사용가능한 특수 문자는 $,_ 달러기호와 언더바만 사용가능

        int s; // 변수를 정의만 했고 실제 할당은 안한 상태
        char a; //데이터 타입 char 한 문자만을 의미함
        s = 100;
        a= 'd';
        System.out.println("정수 표현 : " + s);
        System.out.println("문자 표현 : " + a);

        // 타입, 스캐너 입력 방법 설명 하면서

        // 퀴즈4 - 과제
        // 본인의 이름과, 전화번호, 이메일을 입력 받는 매개변수가 3개이고
        // 출력값은 문자열 타입인데 : 결과는
        // 저는 {이름} 입니다.
        // 제 전화번호 : {전화번호}이고,
        // 이메일 : {이메일} 입니다.
        // 출력 하는 예제해보기
    }
}
