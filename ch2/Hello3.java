package ch2;

public class Hello3 {
    public static int sum(int n, int m){
        return n + m;
    }

    public static int sub(int n, int m){
        return n - m;
    }

    public static int mul(int n, int m){
        return n * m;
    }

    public static int div(int n, int m){
        return n / m;
    }

    public static float div_float(int n, int m){
        return (float) n / m;
    }

    public static String info(String name, String phone, String email) {
        return "저는 " + name + " 입니다.\n" +
               "제 전화번호 : " + phone + "이고,\n" +
               "이메일 : " + email + " 입니다.";
    }
    public static void main(String[] args) {
        int result = sum(4000, 5000);
        System.out.println("sum 함수 복습해보기 : " + result);

        int result2 = sub(4000, 5000);
        System.out.println("sub 함수 복습해보기 : " + result2);

        int result3 = mul(4000, 5000);
        System.out.println("mul 함수 복습해보기 : " + result3);

        int result4 = div(4000, 5000);
        System.out.println("div 함수 복습해보기 : " + result4);

        float result5 = div_float(4,12 );
        System.out.println("div_float 함수 복습해보기 : " + result5);

        String name = "강신우";
        String phone = "010-1234-5678";
        String email = "kang@naver.com";

        String result6 = info(name, phone, email);
        System.out.println(result6);
    }

    
}
