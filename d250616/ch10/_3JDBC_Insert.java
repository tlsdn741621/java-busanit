package d250616.ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import d250613.member_project.util.DateUtil;

public class _3JDBC_Insert {
    public static void main(String[] args) {
        // JDBC 실행순서
        // 1. 디비 서버에 접근을 위한 준비물
        // 1) 드리이버 위치 2) 유저명 3) 패스워드 4) 시비서버의 이이피 및 포트 번호
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 디비 서버 아이피, 포트, 서비스 이름
        String user = "scott"; // 접속할 유저
        String password = "tiger"; // 패스워드
        String driver = "oracle.jdbc.driver.OracleDriver"; // 드라이버 위치

        // 객체를 미리 선언만 해서, 초기화를 밑에서 하고, 전역처럼 사용하기
        Connection conn = null;
        PreparedStatement pstmt = null;
        // 조회 할 때만 필요한, 1) 전체 조회 2) 하나 조회 3) 검색. 
        // select 이용시에만 결과를 받을 임시 테이블
        // ResultSet rs = null;

        try {
            // 2. 드라이버 로딩, ojdbc8_g.jar 압축 파일에서, 필요한 경로를 찾아감
            // 예) Class.forname(driver); -> 대신에, .vscode 폴더에서, 오라클 드라이버의 .jar 파일을 메모리상에 로드중
            Class.forName(driver);

            // 3. Connection 맺기
            // 자바 코드와 오라클 데이터베이스를 연결 하는 것을 의미
            // java.sql 패키지에서 Connection 클래스 기능을 이용해서, 접근하기
            // 예) Connection conn = DriverManager.getConnection(url, user, password)
            conn = DriverManager.getConnection(url, user, password);

            // 4. SQL 문 작성
            // 자바에서 데이터베이스에 요청할 SQL 을 문자열로 저장하고 전달
            // 주의사항, 세미콜론을 입력하지 않는다.
            // 예) String query = "select sysdate from dual"
            // INSERT INTO MEMBER501 (id, name, password, email, reg_date) VALUES(
            // member501_seq.NEXTVAL,'강신우','1234','ksw@naver.com','2025년6월16일12시9분');
            // String query = "INSERT INTO MEMBER501 (ID,NAME,PASSWORD,EMAIL,REG_DATE)" +
            // "VALUES(?,?,?,?,?)";
            // 만약 , 자동 인덱스 생성으로 추가 할 경우
            String query = "INSERT INTO MEMBER501 (ID,NAME,PASSWORD,EMAIL,REG_DATE)" +
            "VALUES(MEMBER501_SEQ.NEXTVAL,?,?,?,?)";

            // 5. PreparedStatement 생성
            // 요청할 SQL 문을 데이터베이스 전송할 때 사용하는 기능(API)
            // 예) PreparedStatement pstmt = conn.prepareStatement(query)
            pstmt = conn.prepareStatement(query);
            // 추가할 데이터를 , 해당 와일드카드(?) 에 해당하는 데이터 임시로 하드코딩으로 넣고 있고,
            // 화면에서 데이터를 사용자로부터 받아서 추가 할 예정

            // 직접 ID 수동으로 넣을경우
            // pstmt.setInt(1, 100);
            // pstmt.setString(2, "강신우");
            // pstmt.setString(3, "1234");
            // pstmt.setString(4, "ksw@naver.com");
            // pstmt.setString(5, DateUtil.getCurrentDateTime());
            
            // 시퀀스 이용해서, 자동 순번으로 넣을 경우
            pstmt.setString(1, "강신우");
            pstmt.setString(2, "1234");
            pstmt.setString(3, "ksw@naver.com");
            pstmt.setString(4, DateUtil.getCurrentDateTime());

            // 6. SQL 문 전송 및 결과값 얻기, 1) 조회 버전 : executeQuery, 2) 쓰기, 수정, 삭제 : executeUpdate()
            // 조회 버전
            // 예)  ResultSet rs = stmt.executeQuery(query)
            // ResultSet : 가상의 테이블, 데이터 베이스에서 조회된 데이터를 테이블 형식으로 메모리상에 저장
            // 0 행 부터 시작 함.
            // 예) while(rs.next()) {   // 0행 시작 -> 1행의 데이터가 존재 하면, 가져올 작업한다
            // int deptno = rs.getInt("id");
            // String dname = rs. getString("name"); }

            // 쓰기 버전
            // int result = pstmt.executeUpdate()
            //오류 업데이트 시에, 메서드 호출 방법이 다름.
            // int result = pstmt.executeUpdate(query);
            int result = pstmt.executeUpdate();
            System.out.println(result + " 개의 데이터가 저장됨");

            
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            // 7. 자원 반납.
            // 객체를 생성한 역순으로 반납
            // 1) Connection 2) PreparedStatement 3) ResultSet 객체를 순서로 만들었음
            // 해당 객체의 자원 반답 객체.close()
            // try ~ resource 구문으로, 자동으로 autocloseable 이용하거나
            try {
                // 조회 할 때만 필요
                // if (rs != null)
                //     rs.close();
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
        
    }
}
