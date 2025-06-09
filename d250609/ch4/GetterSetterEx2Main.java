package d250609.ch4;

public class GetterSetterEx2Main {
    public static void main(String[] args) {
        GetterSetterEx2 getterSetterEx = new GetterSetterEx2("강신우", "ksw@naver.com", "1234");
        // public, 외부에서 직접 데이터에 접근
        // 설계 클래스에서 -> name에 대해서 , public -> private 변경함
        // 직접 접근, 수정이 불가
        // getterSetterEx.name = "직접 접근해서 이름 수정 강신우"; // 직접 접근해서, 임의로 수정함
        // private , 데이터 직접 접근을 막는다
        // getterSetterEx.email = "ksw@naver.com 수정";
        // getterSetterEx.password = "password 수정";
        getterSetterEx.showInfo();
        System.out.println("Getter 라는 메서드를 이용해서, 각 멤버 변수 하나 조회 확인");
        System.out.println("이름 조회 : " + getterSetterEx.getName());
        System.out.println("이메일 조회 : " + getterSetterEx.getEmail());
        System.out.println("패스워드 조회 : " + getterSetterEx.getPassword());
        System.out.println("Setter 라는 메서드를 이용해서, 각 멤버 변수 값 설정 확인");
        getterSetterEx.setName("강신우 setter로 수정");
        getterSetterEx.setEmail("ksw@naver.com setter로 수정");
        getterSetterEx.setPassword("12345 setter로 수정");
        System.out.println("Setter 를 이용해서, 데이터 변경하고, 값 확인");
        getterSetterEx.showInfo();
    }
}
