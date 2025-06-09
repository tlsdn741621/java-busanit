package d250609.ch4;

public class MemberEx3 {
    // 퀴즈1-1
    // 설계 클래스 만들기, 클래스명 : Member
    // 멤버 변수 : 1) name 2) email 3) password , private 지정
    // 생성자 만들기
    // getter, setter 만들기. 하나씩 조회 및 수정
    // 조회는 : showInfo, 각 멤버 정보 호출하는 기능
    // 수정 : changeNameEmailPassword : 메서드 이름으로 만들기
    // 실행 후
    // 1) 각 인스턴스 생성 3개 해보기 2) 각 인스턴스로 정보 출력 3) 정보 변경 해보기.
    private String name;
    private String email;
    private String password;

    public MemberEx3(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("이메일 : " + email);
        System.out.println("패스워드 : " + password);
    }

    // vscode 에서 지원 해주는 자동완 코드 , 이용 해보기
    // 우클릭 -> 소스작업 -> Generate Getters, Setters 선택하기
    
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }

    public void changeNameEmailPassword(String name, String email, String password) { 
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
