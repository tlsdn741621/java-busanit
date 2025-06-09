package d250609.ch4;

public class MemberEx3Main {
    public static void main(String[] args) {
        MemberEx3 member = new MemberEx3("강신우", "ksw@naver.com", "1234");
        
        System.out.println("getter 이름 조회 : " + member.getName());
        System.out.println("getter 이메일 조회 : " + member.getEmail());
        System.out.println("getter 패스워드 조회 : " + member.getPassword());

        member.changeNameEmailPassword("강신우 수정","ksw@naver.com 수정", "1234 수정");

        member.showInfo();

        // 인스턴스 생성 3개 하기
        MemberEx3 member1 = new MemberEx3("강신우1", "ksw1@naver.com", "1234");
        MemberEx3 member2 = new MemberEx3("강신우2", "ksw2@naver.com", "1234");
        MemberEx3 member3 = new MemberEx3("강신우3", "ksw3@naver.com", "1234");

        // 방금 만든 설계 클래스를 담을 배열 생성하기
        // Member[] memberArray = new Member[3];
        MemberEx3[] memberArray = {member1, member2, member3};

        // 반복문으로 담기
        // for (int i = 0; i < memberArray.length; i++) {
        //     memberArray[i] = memberTempArray[i];
        // }

        // 각 인스턴스를 반복문 이용해서 출력해보기
        for(MemberEx3 members : memberArray) {
            members.showInfo();
        }

        // 각 인스턴스 멤버의 변수를 한번에 3개 다 변경한느 메서드 이용해서 수정하고
        // 다시 출력 해보기
        member1.changeNameEmailPassword("강신우1 수정", "ksw1@naver.com 수정", "1234 수정");
        member2.changeNameEmailPassword("강신우2 수정", "ksw2@naver.com 수정", "1234 수정");
        member3.changeNameEmailPassword("강신우3 수정", "ksw3@naver.com 수정", "1234 수정");

        for(MemberEx3 members : memberArray) {
            members.showInfo();
        }

    }
}
